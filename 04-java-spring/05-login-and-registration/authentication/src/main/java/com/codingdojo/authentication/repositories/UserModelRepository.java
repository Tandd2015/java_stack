package com.codingdojo.authentication.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.authentication.models.UserModel;

@Repository
public interface UserModelRepository extends CrudRepository<UserModel,Long> {
	List<UserModel> findAll();
	
	UserModel findByEmailAddress(String emailaddress);
	boolean existsByEmailAddress(String emailaddress);
}
