package com.hexaware.onlinegrocery.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.onlinegrocery.entity.Products;

class ProductsServicesImpTest {
	ProductsServicesImp obj = new ProductsServicesImp();
	

	@Test
	void testCreateProduct() {
		Products entity=new Products();
		assertEquals(1,obj.createProduct(entity));
	}

	@Test
	void testUpdateProduct() {
		Products entity=new Products();
		assertEquals(1,obj.updateProduct(entity));
	}

	@Test
	void testGetProduct() {
		Products actual=obj.getProduct(1);
		Products expected=new Products();
		assertEquals(expected, actual);
		}

	@Test
	void testGetAllProducts() {
		List<Products> actual=obj.getAllProducts();
		List<Products> expected =new ArrayList<Products>();
		expected.add(new Products(65,"hairoil","Oil","Parachute",50,1));
		assertEquals(expected, actual);	}

	@Test
	void testDeleteProducts() {
		assertEquals(1,obj.deleteProducts(1));
	}

}
