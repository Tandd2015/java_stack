package com.codingdojo.productsandcategories.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.productsandcategories.Models.CategoryModel;
import com.codingdojo.productsandcategories.Models.ProductModel;

@Repository
public interface ProductRepository extends CrudRepository<ProductModel,Long> {
	List<ProductModel> findAll();
	List<ProductModel> findByCategoriesNotContains(CategoryModel categoryModel);
}
