package com.codingdojo.dojooverflow.services;

import org.springframework.stereotype.Service;

import com.codingdojo.dojooverflow.models.Answer;
import com.codingdojo.dojooverflow.repositories.AnswerRepository;

@Service
public class AnswerService {
	
	private final AnswerRepository aRepo;
	
	public AnswerService(AnswerRepository aRepo) {
		this.aRepo = aRepo;
	}
	
	public Answer createAnswer(Answer answer) {
		return this.aRepo.save(answer);
	}
	
	
}
