package com.Technosignia.com.QuickEstate.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.com.QuickEstate.entity.Customer;
import com.Technosignia.com.QuickEstate.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;
	@PostMapping("/customer")
	public Customer CreateCustomerDetails(@RequestBody Customer customer)
	{
		return customerService.createCustomer(customer);
	}
	
	@GetMapping("/customer")
	public List<Customer>findAllCustomer(){
		return customerService.findAllCustomer();
	}
	@GetMapping("/customer/{id}")
	public Optional<Customer>findCustomerDetailsById(@RequestParam Long id){
		System.out.println(id);
		return customerService.findCustomerDetailsById(id);
	}
	
	@DeleteMapping("/customer")
	public String deleteCustomerDetailsById(@RequestParam Long id) {
		return customerService.deleteCustomerDetailsById(id);
	}
	@PutMapping("/customer")
	public Customer updateCustomerDetails(@RequestBody Customer cust)
	{
		 return customerService.updateCustomer(cust);
	}


}
