package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapp.dao.Product;
import com.productapp.dao.ProductDao;
import com.productapp.dao.ProductDaoJdbcImpl;

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

}
