package com.codingdojo.productsandcategories.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.productsandcategories.Models.CategoryModel;
import com.codingdojo.productsandcategories.Models.ProductModel;
import com.codingdojo.productsandcategories.Repositories.CategoryRepository;

@Service
public class CategoryService {
	
	private final CategoryRepository categoryRepository;
	
	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public List<CategoryModel> findAllCategories() {
		return this.categoryRepository.findAll();
	}
	
	public List<CategoryModel> findCategoriesNotInProduct(ProductModel productModel) {
		return this.categoryRepository.findByProductsNotContains(productModel);
	}
	
	public CategoryModel getOneCategory(Long id) {
		return this.categoryRepository.findById(id).orElse(null);
	}
	
	public CategoryModel createOneCategory(CategoryModel categoryModel) {
		return this.categoryRepository.save(categoryModel);
	}
	
	
}
