package com.codingdojo.authone.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.authone.models.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel,Long>{
	UserModel findByUsername(String username);
}
