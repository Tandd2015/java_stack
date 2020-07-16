package com.codingdojo.productsandcategories.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.productsandcategories.Models.CategoryModel;
import com.codingdojo.productsandcategories.Models.ProductModel;

@Repository
public interface CategoryRepository extends CrudRepository<CategoryModel,Long> {
	List<CategoryModel> findAll();
	List<CategoryModel> findByProductsNotContains(ProductModel productModel);
}
