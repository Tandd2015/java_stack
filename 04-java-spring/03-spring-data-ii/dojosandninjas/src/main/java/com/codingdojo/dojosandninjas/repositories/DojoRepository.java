package com.codingdojo.dojosandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.dojosandninjas.models.DojoModel;

@Repository
public interface DojoRepository extends CrudRepository<DojoModel, Long> {
	List<DojoModel> findAll();
}
