package com.niit.pattern.display;

import com.niit.entity.Product;
import com.niit.pattern.DAOImpl.ProductDAOImpl;
import com.niit.pattern.dao.ProductDAO;

public class DesignPatternDisplay {

	private static ProductDAO productDAO = ProductDAOImpl.getProductDAO();
	
	public static void main(String...strings ) {
		
		displayAllProducts();
		
		//fetch the product by brand
		System.out.println("Updated List");
	
		displayProductsByBrand("Sony");
		
	
	}
		

	private static void displayProductsByBrand(String brand) {
		for (Product product :productDAO.getByBrand(brand)) {
			System.out.println(product);
		}
		
	}


	private static void displayAllProducts() {
		
		for (Product product : productDAO.list()) {
			System.out.println(product);
		}
		
	}

}
