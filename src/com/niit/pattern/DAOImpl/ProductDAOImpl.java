package com.niit.pattern.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import com.niit.entity.Product;
import com.niit.pattern.dao.ProductDAO;

public class ProductDAOImpl implements ProductDAO {
	
	private static ProductDAO productDAO = null;
	
	public static ProductDAO getProductDAO() {
		if(productDAO == null) {
			productDAO = new ProductDAOImpl();
		}
		return productDAO;
	}
	
	List<Product> products = null;
	
	private ProductDAOImpl() {
		products = new ArrayList<>();
		products.add(new Product(1, "Sony bravia", "Sony", "Television", "This is a TV", 45000, 30));
		products.add(new Product(2, "iphone 7", "Apple", "Mobile", "This is a mobile", 21000, 50));
		products.add(new Product(3, "Sony Erricson", "Sony", "Mobile", "This is a phone", 15000, 45));
		products.add(new Product(4, "Inspiron 15", "Dell", "Laptop", "This is a Laptop", 60000, 12));
		
	}
	

	@Override
	public List<Product> getByBrand(String brand) {
		List<Product> temp = new ArrayList<>();
		for (Product product : products) {
			//match the product brand with the argument brand
			if ( product.getBrand().equals(brand)) {
				temp.add(product);
			}
			
		}
		
		return temp;
	}

	@Override
	public List<Product> list() {
		// TODO Auto-generated method stub
		return products;
	}

	@Override
	public boolean add(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Product product) {
			return false;
		}
		

	@Override
	public boolean delete(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

}
