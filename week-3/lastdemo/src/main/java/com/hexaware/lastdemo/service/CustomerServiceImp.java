package com.hexaware.lastdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.lastdemo.dto.CustomerDTO;
import com.hexaware.lastdemo.entity.Customer;
import com.hexaware.lastdemo.repository.ICustomerRepository;
@Service
public class CustomerServiceImp implements ICustomerService {
	@Autowired
	ICustomerRepository repo;
	
	
	@Override
	public Customer addCustomer(CustomerDTO customerDTO) {
		Customer customer =new Customer();
		customer.setId(customerDTO.getId());
		customer.setName(customerDTO.getName());
		customer.setAge(customerDTO.getAge());
		return repo.save(customer);
	}

	@Override
	public CustomerDTO getById(int customerId) {
		Customer customer=repo.findById(customerId).orElse(null);
		
		
		CustomerDTO customerDTO =new CustomerDTO();
		customerDTO.setId(customer.getId());
		customerDTO.setName(customer.getName());
		customerDTO.setAge(customer.getAge());
		return customerDTO;
	}

	@Override
	public List<Customer> getAllCustomers() {
		return repo.findAll();
	}

	@Override
	public Customer updateCustomers(CustomerDTO customerDTO) {
		Customer customer =new Customer();
		customer.setId(customerDTO.getId());
		customer.setName(customerDTO.getName());
		customer.setAge(customerDTO.getAge());
		return repo.save(customer);
	}

	@Override
	public String deleteById(int customerId) {
		Customer customer =repo.findById(customerId).orElse(null);
		
		 repo.deleteById(customerId);
		 return "Deleted";
	}

}
