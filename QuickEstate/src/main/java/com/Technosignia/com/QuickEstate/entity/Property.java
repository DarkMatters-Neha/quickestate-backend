package com.Technosignia.com.QuickEstate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Property {
	@Id
	long Id;
	String types;
	String name;
	@ManyToOne
	Owner owner;
	@OneToOne
	Address address;
	double rentalprice;
	double sellprice;
	long presentage;
	
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getRentalprice() {
		return rentalprice;
	}
	public void setRentalprice(double rentalprice) {
		this.rentalprice = rentalprice;
	}
	public double getSellprice() {
		return sellprice;
	}
	public void setSellprice(double sellprice) {
		this.sellprice = sellprice;
	}
	public long getPresentage() {
		return presentage;
	}
	public void setPresentage(long presentage) {
		this.presentage = presentage;
	}
	
	
	
}
