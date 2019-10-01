package com.insuchi.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@Autowired
	PersonService ps;

	/*
	 * @GetMapping("/persons/{id}") public Person getPerson(@PathVariable Long id) {
	 * 
	 * return ps.getPerson(id); }
	 */

	@GetMapping("/persons/{name}")
	public Person getPerson(@PathVariable String name) {

		return ps.getPerson(name);
	}


	@GetMapping("/persons")
	public List<Person> getPerson() {

		return ps.getPersons();
	}

	@PostMapping(path = "/persons", consumes = "application/json", produces = "application/json")
	public Person newPerson(@RequestBody Person p) {

		return ps.addPerson(p);
	}



	@DeleteMapping("/persons/{id}")
	public void deletePerson(@PathVariable Long id) {

		ps.deletePerson(id);
	}
}
