package com.codecool.catagochi.model.generated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Contact{

	@JsonProperty("address")
	private Address address;

	@JsonProperty("phone")
	private Object phone;

	@JsonProperty("email")
	private String email;

	public void setAddress(Address address){
		this.address = address;
	}

	public Address getAddress(){
		return address;
	}

	public void setPhone(Object phone){
		this.phone = phone;
	}

	public Object getPhone(){
		return phone;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	@Override
 	public String toString(){
		return 
			"Contact{" + 
			"address = '" + address + '\'' + 
			",phone = '" + phone + '\'' + 
			",email = '" + email + '\'' + 
			"}";
		}
}