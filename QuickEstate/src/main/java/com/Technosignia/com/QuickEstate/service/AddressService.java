package com.Technosignia.com.QuickEstate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.com.QuickEstate.entity.Address;
import com.Technosignia.com.QuickEstate.repository.AddressRepository;

@Service
public class AddressService {
	@Autowired
	AddressRepository addressRepository;
	
	public Address createAddress(Address address) {
		return addressRepository.save(address);
	}

	public List<Address> findAllAddress() {
		// TODO Auto-generated method stub
		return addressRepository.findAll();
	}

	public Optional<Address> findAddressDetailsById(Long id) {
		// TODO Auto-generated method stub
		return addressRepository.findById(id);
	}

	public String deleteAddressDetailsById(Long id) {
		addressRepository.deleteById(id);
		return "Address Deleted Sucessfully!";
	}

	public Address updateAddress(Address address) {
		// TODO Auto-generated method stub
		return addressRepository.save(address);
	}
}
