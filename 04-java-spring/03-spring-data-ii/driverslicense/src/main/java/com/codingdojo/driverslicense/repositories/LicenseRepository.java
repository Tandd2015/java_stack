package com.codingdojo.driverslicense.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.driverslicense.models.License;

@Repository
public interface LicenseRepository extends CrudRepository<License,Long>{
	public List<License> findAll();
	public License findTopByOrderByNumberDesc();
}
