package com.codingdojo.dojooverflow.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.dojooverflow.models.AltQuestion;
import com.codingdojo.dojooverflow.models.Question;
import com.codingdojo.dojooverflow.models.Tag;
import com.codingdojo.dojooverflow.repositories.AnswerRepository;
import com.codingdojo.dojooverflow.repositories.QuestionRepository;
import com.codingdojo.dojooverflow.repositories.TagRepository;

@Service
public class QuestionService {
	private final QuestionRepository qRepo;
	private final AnswerRepository aRepo;
	private final TagRepository tRepo;
	
	public QuestionService(QuestionRepository qRepo, AnswerRepository aRepo, TagRepository tRepo) {
		this.qRepo = qRepo;
		this.aRepo = aRepo;
		this.tRepo = tRepo;
	}
	
	public List<Question> allQuestions() {
		return this.qRepo.findAll();
	}
	
	public Question oneQuestion(Long id) {
		return this.qRepo.findById(id).orElse(null);
	}
	
	public void newQuestion(AltQuestion question) {
		
	    List<Tag> Qtags = new ArrayList<Tag>();
	    
	    for(String insertAQ: question.splitTags()) {
	        Tag tag = this.tRepo.findByinsertT(insertAQ).orElse(null);
	        if(tag == null) {
	            tag = new Tag(insertAQ);
	            this.tRepo.save(tag);
	        }
            if(!Qtags.contains(tag)) {
                Qtags.add(tag);
            }
	    }
	    Question newQ = new Question(question.getInsertAQ(), Qtags);
	    this.qRepo.save(newQ);
	}
	
}
