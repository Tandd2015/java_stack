package com.codingdojo.driverslicense.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.driverslicense.models.Person;
import com.codingdojo.driverslicense.repositories.PersonRepository;

@Service
public class PersonService {

	// static variable
	private final PersonRepository personRepository;
	
	// constructor
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	// method functions
	public List<Person> allPerson() {
		return personRepository.findAll();
	}
	
	public List<Person> allUnlicensedPeople() {
		return personRepository.findByLicenseIdIsNull();
	}
	
	public Person createOnePerson(Person person) {
		return personRepository.save(person);
	}
		
	public Person findOnePerson(Long id) {
		return (personRepository).findById(id).orElse(null);
	}
	

}
