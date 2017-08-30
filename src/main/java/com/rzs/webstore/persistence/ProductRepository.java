package com.rzs.webstore.persistence;

import java.util.List;

import com.rzs.webstore.data.domain.Product;

public interface ProductRepository {

	List<Product> getProducts();
}
