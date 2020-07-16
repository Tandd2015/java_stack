package com.codingdojo.authone.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.authone.models.RoleModel;

@Repository
public interface RoleRepository extends CrudRepository<RoleModel,Long>{
	 
	 List<RoleModel> findAll();
	 
	 List<RoleModel> findByName(String name);
}
