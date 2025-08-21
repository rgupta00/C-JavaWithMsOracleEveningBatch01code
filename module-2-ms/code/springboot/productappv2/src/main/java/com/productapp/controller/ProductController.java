package com.productapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.dao.Product;
import com.productapp.service.ProductService;

@RestController
@RequestMapping(path="productapp")
public class ProductController {
	
	private ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	//get all products
	@GetMapping(path = "products")
	public List<Product> getAll(){
		return productService.getAll();
	}
	//get by id
	@GetMapping(path = "products/{id}")
	public Product getById(@PathVariable("id")  int id) {
		return productService.getProductById(id);
	}
	
	//add product
	
	//update
	
	
	//delete
	

}
