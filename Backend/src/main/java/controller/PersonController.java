package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Person;

import java.util.List;

import repository.PersonRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api_test_tech/")
public class PersonController {
	
	@Autowired
	private PersonRepository personRepository;


	// get all Person
		@GetMapping("/person")
		public List<Person> getAllPerson(){
			return personRepository.findAll();
		}		
		
		// create Person rest api
		@PostMapping("/person")
		public Person createPerson(@RequestBody Person person) {
			return personRepository.save(person);
		}
		
		// get Person by id rest api
		@GetMapping("/person/{id}")
		public ResponseEntity<Person> getPersonById(@PathVariable Long id) {
			Person person = personRepository.findById(id)
					.orElseThrow();
			return ResponseEntity.ok(person);
		}



}
