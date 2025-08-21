package com.productsapp.dao;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
@Repository
@Primary
public class ProductDaoJdbcImpl implements ProductDao{

	@Override
	public List<Product> getAll() {
		System.out.println("dao jdbc impl");
		return List.of(new Product(1, "laptop", 34000),new Product(2, "laptop stand", 34));
	}

}
