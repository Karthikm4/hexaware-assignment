package com.hexaware.onlinegrocery.services;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.onlinegrocery.entity.Orders;

class OrdersServicesImpTest {
	OrdersServicesImp obj =new OrdersServicesImp();
	@Test
	void testCreateOrder() {
		Orders entity = new Orders();
		assertEquals(1,obj.createOrder(entity));
		
	}

@Test
	void testUpdateOrder() {
	Orders entity = new Orders();
	assertEquals(1,obj.updateOrder(entity));


}

	@Test
	void testGetOrder() {
		Orders actual=obj.getOrder(1);
		Orders expected=new Orders();
		assertEquals(expected, actual);
		
}

	@Test
	void testGetAllOrders() {
		List<Orders> actual=obj.getAllOrders();
		List<Orders> expected =new ArrayList<Orders>();
		expected.add(new Orders(45,14,LocalDate.of(2023, 07, 20),"Hyderabad","Phonepe",20000.0));
		assertEquals(expected, actual);
		
	}

	@Test
	void testDeleteOrder() {
		assertEquals(1, obj.deleteOrder(1));

		
	}

}
