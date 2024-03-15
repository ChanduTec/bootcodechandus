package com.example.ashokit.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.example.ashokit.entity.FlipKart;
import com.example.ashokit.repo.FlipKartRepo;
import com.example.ashokit.specifications.FlipKartSpecifications;

@Service
public class FlipKartService {

	@Autowired
	private FlipKartRepo flipKartRepo;

	public List<FlipKart> getDataBasedOnPrice() {

		List<FlipKart> findAll = flipKartRepo.findAll();
		// findAll.forEach(System.out::println);
		List<FlipKart> collect = findAll.stream().filter(price -> price.getPrice() <= 10000)
				.collect(Collectors.toList());
		return collect;
	}

	List<FlipKart> filterPrices(Double price, Double pDouble) {
		List<FlipKart> findAll = flipKartRepo.findAll();
		// findAll.stream().allMatch(pp -> pp.setPrice(price) &&
		// pp.setPrice(pDouble)).forEach(Syystem.out::println);
		return null;
	}

	public void saveData() {

		ArrayList<FlipKart> flipKartsData = new ArrayList<>();
		flipKartsData.add(new FlipKart(123, "Mi", 3455.66, "Hyderabad"));
		flipKartsData.add(new FlipKart(13, "Lenovo", 6645567.543, "Pune"));
		flipKartsData.add(new FlipKart(23, "Apple", 8765.43, "Bng"));
		flipKartsData.add(new FlipKart(154, "Andriod", 456645.65, "Spl"));
		flipKartsData.add(new FlipKart(98, "Mi", 3243.66, "Khammam"));
		flipKartsData.add(new FlipKart(345, "EarPhones", 98898799.66, "Vijayawada"));

		flipKartRepo.saveAll(flipKartsData);
	}

	public void getProductsSpec(String name, Double minPrice, Double maxPrice) {

		Specification<FlipKart> spec = Specification.where(null);

		if (name != null) {
			spec = spec.and(FlipKartSpecifications.nameLike(name));
		}

		if (minPrice != null) {
			spec = spec.and(FlipKartSpecifications.priceGreaterThan(minPrice));
		}

		if (maxPrice != null) {
			spec = spec.and(FlipKartSpecifications.priceLessThan(maxPrice));
		}

		List<FlipKart> findAll = flipKartRepo.findAll(spec);
		findAll.forEach(System.out::println);

	}
}
