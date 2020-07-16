package com.codingdojo.greatideas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.greatideas.models.IdeaModel;
import com.codingdojo.greatideas.models.UserModel;
import com.codingdojo.greatideas.repositories.IdeaRepository;
import com.codingdojo.greatideas.repositories.UserRepository;

@Service
public class IdeaServices {
	private IdeaRepository ideaRepository;
	private UserRepository userRepository;
	
	public IdeaServices(IdeaRepository ideaRepository,UserRepository userRepository) {
		this.ideaRepository = ideaRepository;
		this.userRepository = userRepository;
	}
	
	public IdeaModel deleteIdeaModel(Long id) {
		Optional<IdeaModel> optionalIdeaModel = ideaRepository.findById(id);
		if(optionalIdeaModel.isPresent()) {
			ideaRepository.deleteById(id);
			return optionalIdeaModel.get();
		}
		return null;
	}
//	public IdeaModel CreateIdeaModel(IdeaModel ideaModel) {
//		return this.ideaRepository.save(ideaModel);
//	}
	public IdeaModel getOneIdeaModel(Long id) {
		return this.ideaRepository.findById(id).orElse(null);
	}
	public IdeaModel CreateIdeaModel(IdeaModel ideaModel, Long id) {
		ideaModel.setUserModel(this.userRepository.findById(id).orElse(null));
		return this.ideaRepository.save(ideaModel);
	}
	
//	public IdeaModel UpdateIdeaModel(IdeaModel ideaModel) {
//		return this.ideaRepository.save(ideaModel);
//	}
	public IdeaModel UpdateIdeaModel(IdeaModel ideaModel, Long id) {
		ideaModel.setUserModel(this.userRepository.findById(id).orElse(null));
		return this.ideaRepository.save(ideaModel);
	}
	
	public List<IdeaModel> findAllIdeaModels() {
		return this.ideaRepository.findAll();
	}
	
	public IdeaModel likeUser(IdeaModel ideaModel, UserModel userModel) {

		List<UserModel> users = ideaModel.getUsersLiked();
		if(!users.contains(userModel)) {
			users.add(userModel);
		}
		ideaModel.setUsersLiked(users);
		return this.ideaRepository.save(ideaModel);
	}
	public IdeaModel dislikeUser(IdeaModel ideaModel, UserModel userModel) {

		List<UserModel> users = ideaModel.getUsersLiked();
		users.remove(userModel);
		return this.ideaRepository.save(ideaModel);
	}
	// find user by id
	public IdeaModel findIdeaModelById(Long id) {
		
		Optional<IdeaModel> ideaModel = ideaRepository.findById(id);
		
		if(ideaModel.isPresent()) {
			return ideaModel.get();
		} else {
			return null;
		}
	}
	
}
