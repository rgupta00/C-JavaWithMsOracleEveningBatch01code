package com.productsapp.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.productsapp.config.AppConfig;
import com.productsapp.dao.Product;
import com.productsapp.service.ProductService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		ProductService productService=ctx.getBean("productServiceImpl", ProductService.class);
		List<Product> products= productService.getAll();
		for(Product product: products) {
			System.out.println(product);
		}
	}
}
