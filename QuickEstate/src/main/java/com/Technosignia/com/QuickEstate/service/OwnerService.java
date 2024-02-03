package com.Technosignia.com.QuickEstate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.com.QuickEstate.entity.Owner;
import com.Technosignia.com.QuickEstate.repository.OwnerRepository;

@Service
public class OwnerService {
	@Autowired
	OwnerRepository ownerRepository;
	
	public Owner createOwner(Owner own) {
		return ownerRepository.save(own);
	}
	
	public List<Owner>findAllOwner(){
		return ownerRepository.findAll();
	}
	public Optional<Owner>findOwnerDetailsById(Long id)
	{
		return ownerRepository.findById(id);
	}
	
	public String deleteOwnerDetailsById(Long id){
		ownerRepository.deleteById(id);
		return "Owner Deleted Sucessfully!";
	}
	public Owner updateOwner(Owner own){
		return ownerRepository.save(own);
	}


}
