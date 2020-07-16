package com.codingdojo.productsandcategories.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.productsandcategories.Models.CategoryModel;
import com.codingdojo.productsandcategories.Models.ProductModel;
import com.codingdojo.productsandcategories.Repositories.ProductRepository;

@Service
public class ProductService {
	
	private final ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public List<ProductModel> findAllProducts() {
		return this.productRepository.findAll();
	}
	
	public List<ProductModel> findProductsNotInCategory(CategoryModel categoryModel) {
		return this.productRepository.findByCategoriesNotContains(categoryModel);
	}
	
	public ProductModel getOneProduct(Long id) {
		return this.productRepository.findById(id).orElse(null);
	}
	
	public ProductModel createOneProduct(ProductModel productModel) {
		return this.productRepository.save(productModel);
	}
	
	
}
