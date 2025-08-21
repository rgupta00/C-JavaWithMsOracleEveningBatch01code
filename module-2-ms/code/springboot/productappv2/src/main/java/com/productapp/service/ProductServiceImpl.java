package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapp.dao.Product;
import com.productapp.dao.ProductDao;


@Service
public class ProductServiceImpl implements ProductService{

	private ProductDao productDao;
	
	@Autowired
	public ProductServiceImpl(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		//Serice layer= BL + CCC(cross cutting con)
		long start=System.currentTimeMillis();
		List<Product> products=productDao.getAll();
		long end=System.currentTimeMillis();
		System.out.println("time taken : "+(end-start)+" ms");
		return products;
	}

	@Override
	public Product getProductById(int productId) {
		return productDao.getProductById(productId);
	}

	@Override
	public Product addProduct(Product product) {
		return productDao.addProduct(product);
	}

	@Override
	public Product updateProduct(int productId, Product product) {
		return productDao.updateProduct(productId, product);
	}

	@Override
	public Product deleteProduct(int productId) {
		return productDao.deleteProduct(productId);
	}

}
