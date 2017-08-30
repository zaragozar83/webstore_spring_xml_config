package com.rzs.webstore.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rzs.webstore.data.domain.Product;
import com.rzs.webstore.persistence.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	
	@RequestMapping(value="/product")
	public String getProduct(Model model) {
		Product p1 = new Product("iPhone 5s", new BigDecimal(500), "Apple iPhone 5s smartphone with 4.00-inch 640x1136 display and 8-megapixel rear camera", "Apple", "Smart Phone", 1000, 0, Boolean.FALSE, "New");
		model.addAttribute("product", p1);
		return "product";
	}
	
	@RequestMapping(value="/products")
	public String getProducts(Model model) {
		model.addAttribute("products", productRepository.getProducts());
		return "products";
	}
}
