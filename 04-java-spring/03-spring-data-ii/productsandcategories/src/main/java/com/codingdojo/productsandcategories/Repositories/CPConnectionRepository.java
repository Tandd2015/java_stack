package com.codingdojo.productsandcategories.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.productsandcategories.Models.CPConnectionModel;
import com.codingdojo.productsandcategories.Models.CategoryModel;
import com.codingdojo.productsandcategories.Models.ProductModel;

@Repository
public interface CPConnectionRepository extends CrudRepository<CPConnectionModel,Long>{
//	List<CPConnectionModel> findAll();
//	List<CPConnectionModel> findByConnectionsNotContains(CPConnectionModel cpconnectionModel);
}
