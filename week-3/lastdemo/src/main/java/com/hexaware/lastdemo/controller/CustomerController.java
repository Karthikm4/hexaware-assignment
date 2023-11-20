package com.hexaware.lastdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.lastdemo.dto.CustomerDTO;
import com.hexaware.lastdemo.entity.Customer;
import com.hexaware.lastdemo.service.ICustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	ICustomerService service;
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody CustomerDTO customerDTO) {
		return service.addCustomer(customerDTO);
	}

	@GetMapping("/get/{ID}")
	public CustomerDTO getById(@PathVariable int ID) {
		return service.getById(ID);
	}

	@GetMapping("/all")
	public List<Customer> getAllCustomers() {
		return service.getAllCustomers();
	}

	@PutMapping("/update")
	public Customer updateCustomers(@RequestBody CustomerDTO customerDTO) {
		return service.updateCustomers(customerDTO);
	}

	@DeleteMapping("/delete")
	public String deleteById(@PathVariable int customerId) {
		service.deleteById(customerId);
		return "Deleted";
		 
	}

}
