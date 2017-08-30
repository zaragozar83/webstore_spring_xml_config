package com.rzs.webstore.persistence.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.rzs.webstore.data.domain.Product;
import com.rzs.webstore.persistence.ProductRepository;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

	private List<Product> listOfProducts = new ArrayList<Product>();
	

	public ProductRepositoryImpl() {
		Product p1 = new Product("iPhone 5s", new BigDecimal(500), "Apple iPhone 5s smartphone with 4.00-inch 640x1136 display and 8-megapixel rear camera", "Apple", "Smart Phone", 1000, 0, Boolean.FALSE, "New");
		Product p2 = new Product("Dell Inspiron", new BigDecimal(700), "Dell Inspiron 14-inch Laptop (Black) with 3rd Generation Intel Core processors", "Dell", "Laptop", 1000, 0, Boolean.FALSE, "New");
		Product p3 = new Product("Nexus 7", new BigDecimal(300), "Google Nexus 7 is the lightest 7 inch tablet With a quad-core Qualcomm Snapdragon™ S4 Pro processor", "Google", "Tablet", 1000, 0, Boolean.FALSE, "New");
		
		listOfProducts.add(p1);
		listOfProducts.add(p2);
		listOfProducts.add(p3);
	}
	
	public List<Product> getProducts() {
		return this.listOfProducts;
	}

	public List<Product> getListOfProducts() {
		return listOfProducts;
	}
}
