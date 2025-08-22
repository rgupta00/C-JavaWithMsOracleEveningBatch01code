package com.productapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.dao.Product;
import com.productapp.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path="productapp")
public class ProductController {
	
	private ProductService productService;

	
	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	//get all products
	@GetMapping(path = "products", produces = {MediaType.APPLICATION_JSON_VALUE, 
			MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<List<Product>> getAll(){
		
//		if(1==1) {
//			throw new RuntimeException("some server side error");
//		}
		
		return ResponseEntity.status(HttpStatus.OK).body(productService.getAll());
	}
	//get by id
	@GetMapping(path = "products/{id}")
	public ResponseEntity<Product> getById(@PathVariable("id")  int id) {
		return ResponseEntity.status(HttpStatus.OK).body(productService.getProductById(id));
	}
	
	//action vs data
	@PostMapping(path = "products")
	public ResponseEntity<Product> addProduct(@Valid @RequestBody Product product) {
		Product productAddedToDb= productService.addProduct(product);
		return ResponseEntity.status(HttpStatus.CREATED).body(productAddedToDb);
	}
	
	//update
	@PutMapping(path = "products/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable("id")  int id, @RequestBody Product product) {
		return ResponseEntity.status(HttpStatus.OK).body(productService.updateProduct(id, product));
	}
	
	//delete
	@DeleteMapping(path = "products/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable("id")  int id) {
		 productService.getProductById(id);
		 return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

}
