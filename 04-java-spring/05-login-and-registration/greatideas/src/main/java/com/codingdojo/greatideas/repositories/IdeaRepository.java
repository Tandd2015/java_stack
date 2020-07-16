package com.codingdojo.greatideas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.greatideas.models.IdeaModel;

@Repository
public interface IdeaRepository extends CrudRepository<IdeaModel,Long>{
	List<IdeaModel> findAll();
}
