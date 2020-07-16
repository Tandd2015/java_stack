package com.codingdojo.greatideas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.greatideas.models.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel,Long>{
	List<UserModel> findAll();
	UserModel findByEmailAddress(String emailaddress);
	boolean existsByEmailAddress(String emailaddress);
}
