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

import com.Technosignia.com.QuickEstate.entity.Property;
import com.Technosignia.com.QuickEstate.service.PropertyService;

@RestController
public class PropertyController {
	@Autowired
	PropertyService propertyService;
	
	@PostMapping("/property")
	public Property CreatePropertyDetails(@RequestBody Property property)
	{
		return propertyService.createProperty(property);
	}	
	@GetMapping("/property")
	public List<Property> findAllOwner(){
		return propertyService.findAllProperty();
	}
	@GetMapping("/property/{id}")
	public Optional<Property> findOwnerDetailsById(@RequestParam Long id){
		System.out.println(id);
		return propertyService.findPropertyDetailsById(id);
	}
	
	@DeleteMapping("/property")
	public String deletePropertyDetailsById(@RequestParam Long id) {
		return propertyService.deletePropertyDetailsById(id);
	}
	@PutMapping("/property")
	public Property updateOwnerDetails(@RequestBody Property property)
	{
		 return propertyService.updateProperty(property);
	}

}
