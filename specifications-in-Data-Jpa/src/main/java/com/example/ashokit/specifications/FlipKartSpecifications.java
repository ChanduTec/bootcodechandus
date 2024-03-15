package com.example.ashokit.specifications;

import org.springframework.data.jpa.domain.Specification;

import com.example.ashokit.entity.FlipKart;

public class FlipKartSpecifications {

	public static Specification<FlipKart> nameLike(String name) {
		return (chandu, query, criteriaBuilder) -> criteriaBuilder.like(chandu.get("name"), "%" + name + "%");
	}

	public static Specification<FlipKart> priceLessThan(double price) {
		return (root, query, criteriaBuilder) -> criteriaBuilder.lessThanOrEqualTo(root.get("price"), price);
	}

	public static Specification<FlipKart> priceGreaterThan(double price) {
		return (root, query, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get("price"), price);
	}

}