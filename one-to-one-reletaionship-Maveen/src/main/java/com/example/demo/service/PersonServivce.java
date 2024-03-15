package com.example.demo.service;

import java.util.ArrayList;

import org.hibernate.dialect.lock.PessimisticEntityLockException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Passport;
import com.example.demo.entity.Person;
import com.example.demo.repository.PassportRepository;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonServivce<E> {
	@Autowired
	private PersonRepository personRepository;

	@Autowired
	private PassportRepository passportRepository;

	public void savePerson() {
		Person person = new Person();
		person.setGender("male");
		person.setPersoneName("chandu");
		person.setPersonId(4);

		Passport passport = new Passport();

		passport.setPassportId(54);
		passport.setPassportIssuedArea(null);
		passport.setPassportNumber(65432);
		passport.setValidDate(null);

		person.setPassport(passport);
		passport.setPerson(person);
		System.out.println(person.toString());
		System.out.println(passport.toString());
		personRepository.save(person);
	}
}
