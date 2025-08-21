package com.productapp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoMapImpl implements ProductDao{
	@Override
	public List<Product> getAll() {
		System.out.println("dao map impl");
		return List.of(new Product(1, "laptop", 34000),new Product(2, "laptop stand", 34));
	}

}
