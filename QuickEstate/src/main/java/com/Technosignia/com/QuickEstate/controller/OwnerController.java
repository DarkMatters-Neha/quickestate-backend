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

import com.Technosignia.com.QuickEstate.entity.Owner;
import com.Technosignia.com.QuickEstate.service.OwnerService;

@RestController
public class OwnerController {
	
	@Autowired
	OwnerService ownerService;
	
	@PostMapping("/owner")
	public Owner CreateOwnerDetails(@RequestBody Owner owner)
	{
		return ownerService.createOwner(owner);
	}
	
	
	@GetMapping("/owner")
	public List<Owner>findAllOwner(){
		return ownerService.findAllOwner();
	}
	@GetMapping("/owner/{id}")
	public Optional<Owner>findOwnerDetailsById(@RequestParam Long id){
		System.out.println(id);
		return ownerService.findOwnerDetailsById(id);
	}
	
	@DeleteMapping("/owner")
	public String deleteOwnerDetailsById(@RequestParam Long id) {
		return ownerService.deleteOwnerDetailsById(id);
	}
	@PutMapping("/owner")
	public Owner updateOwnerDetails(@RequestBody Owner own)
	{
		 return ownerService.updateOwner(own);
	}


}
