package com.hexaware.onlinegrocery.services;

import java.util.ArrayList;
import java.util.List;

import com.hexaware.onlinegrocery.entity.Products;

public class ProductsServicesImp implements IProductsServices {

	@Override
	public int createProduct(Products product) {

		return 1;
	}

	@Override
	public int updateProduct(Products product) {

		return 1;
	}

	@Override
	public Products getProduct(int product_id) {
		Products product = new Products();
		return product;
	}

	@Override
	public List<Products> getAllProducts() {
		List<Products> a=new ArrayList<Products>();
		a.add(new Products(65,"hairoil","Oil","Parachute",50,1));
		return a;
		
	}

	@Override
	public int deleteProducts(int product_id) {

		return 1;
	}

}
