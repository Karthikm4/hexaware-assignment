
package com.hexaware.onlinegrocery.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.hexaware.onlinegrocery.entity.Orders;

public class OrdersServicesImp implements IOrdersServices {

	@Override
	public int createOrder(Orders order) {
		
		return 1;
	}

	@Override
	public int updateOrder(Orders order) {
		
		return 1;
	}

	@Override
	public Orders getOrder(int order_id) {
		Orders order=new Orders();
		return order;
	}

	@Override
	public List<Orders> getAllOrders() {
		List<Orders> a=new ArrayList<Orders>();
		a.add(new Orders(45,14,LocalDate.of(2023, 07, 20),"Hyderabad","Phonepe",20000.0));
		return a;
		
	}

	@Override
	public int deleteOrder(int order_id) {
		
		return 1;
	}

}









