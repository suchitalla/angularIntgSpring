package com.insuchi.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	@Autowired
	PersonRepository pr;

	public Person getPerson(Long id) {
		// TODO Auto-generated method stub

		if (pr.findById(id).isPresent())
			return pr.findById(id).get();
		else
			return null;
	}

	public List<Person> getPersons() {
		// TODO Auto-generated method stub

		return (List<Person>) pr.findAll();

	}

	public Person addPerson(Person p) {
		// TODO Auto-generated method stub
		System.out.println("In addPerson");
		return pr.save(p);
	}

	public void deletePerson(Long id) {
		// TODO Auto-generated method stub
		pr.deleteById(id);

	}

	public Person getPerson(String name) {
		// TODO Auto-generated method stub
		return pr.findByFirstNameOrLastName(name, name);
	}

}
