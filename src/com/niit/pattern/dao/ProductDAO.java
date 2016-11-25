package com.niit.pattern.dao;

import java.util.List;

import com.niit.entity.Product;

public interface ProductDAO {

	//As a single brand can have many products that's why List<product>
	List<Product> getByBrand (String brand);
	List<Product> list();
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);
	
}
