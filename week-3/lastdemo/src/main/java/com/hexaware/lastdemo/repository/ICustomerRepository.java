package com.hexaware.lastdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.lastdemo.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer>{

}
