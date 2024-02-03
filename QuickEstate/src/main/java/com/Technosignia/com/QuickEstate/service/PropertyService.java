package com.Technosignia.com.QuickEstate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.com.QuickEstate.entity.Property;
import com.Technosignia.com.QuickEstate.repository.PropertyRepository;

@Service
public class PropertyService {

	@Autowired
	PropertyRepository propertyRepository;
	
	public Property createProperty(Property property) {
		return propertyRepository.save(property);
	}
	
	public List<Property>findAllProperty(){
		return propertyRepository.findAll();
	}
	public Optional<Property>findPropertyDetailsById(Long id)
	{
		return propertyRepository.findById(id);
	}
	
	public String deletePropertyDetailsById(Long id){
		propertyRepository.deleteById(id);
		return "Property Deleted Sucessfully!";
	}
	public Property updateProperty(Property property){
		return propertyRepository.save(property);
	}


}
