package com.example.ashokit.customeexceptionservice;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ashokit.customeexception.CustomeExcpetion;
import com.example.ashokit.customeexceptionrepository.CustomeRepository;
import com.example.ashokit.exceptions.ProductNotFoundClass;

import jakarta.persistence.criteria.CriteriaBuilder.In;

@Service
public class CustomService {

	@Autowired
	private CustomeRepository customeRepository;

	public CustomeExcpetion saveData(CustomeExcpetion customeExcpetion) {
		CustomeExcpetion save = customeRepository.save(customeExcpetion);
		return save;

	}

	public CustomeExcpetion getDataById(Integer id) {
		Optional<CustomeExcpetion> findById = customeRepository.findById(id);
		if (findById.isPresent()) {
			CustomeExcpetion customeExcpetion = findById.get();
			return customeExcpetion;
		} else {
			throw new ProductNotFoundClass("Chandu based on this id product is not saved");

		}
	}

	public List<CustomeExcpetion> getAllData() {
		List<CustomeExcpetion> findAll = customeRepository.findAll();
		return findAll;
	}
}
