package com.hexaware.lastdemo.service;

import java.util.List;

import com.hexaware.lastdemo.dto.CustomerDTO;
import com.hexaware.lastdemo.entity.Customer;

public interface ICustomerService {
	Customer addCustomer(CustomerDTO customerDTO );
	CustomerDTO getById(int customerId);
	List<Customer> getAllCustomers();
	Customer updateCustomers(CustomerDTO customersDTO);
	String deleteById(int customerId);
}