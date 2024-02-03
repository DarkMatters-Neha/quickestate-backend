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

import com.Technosignia.com.QuickEstate.entity.Address;
import com.Technosignia.com.QuickEstate.service.AddressService;

@RestController
public class AddressController {
	@Autowired
	AddressService addressService;
	
	@PostMapping("/address")
	public Address createAddress(@RequestBody Address address) {
		return addressService.createAddress(address);
	}
	
	@GetMapping("/address")
	public List<Address> findAllCustomer(){
		return addressService.findAllAddress();
	}
	@GetMapping("/address/{id}")
	public Optional<Address> findCustomerDetailsById(@RequestParam Long id){
		System.out.println(id);
		return addressService.findAddressDetailsById(id);
	}
	
	@DeleteMapping("/address")
	public String deleteCustomerDetailsById(@RequestParam Long id) {
		return addressService.deleteAddressDetailsById(id);
	}
	@PutMapping("/address")
	public Address updateCustomerDetails(@RequestBody Address address)
	{
		 return addressService.updateAddress(address);
	}

}
