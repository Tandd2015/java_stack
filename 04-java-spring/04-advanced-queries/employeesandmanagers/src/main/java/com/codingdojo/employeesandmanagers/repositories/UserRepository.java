package com.codingdojo.employeesandmanagers.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.employeesandmanagers.models.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel,Long> {
	List<UserModel> findAll();
}
