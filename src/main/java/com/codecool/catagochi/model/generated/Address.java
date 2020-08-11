package com.codecool.catagochi.model.generated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address{

	@JsonProperty("country")
	private String country;

	@JsonProperty("address2")
	private Object address2;

	@JsonProperty("city")
	private String city;

	@JsonProperty("address1")
	private String address1;

	@JsonProperty("postcode")
	private String postcode;

	@JsonProperty("state")
	private String state;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setAddress2(Object address2){
		this.address2 = address2;
	}

	public Object getAddress2(){
		return address2;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setAddress1(String address1){
		this.address1 = address1;
	}

	public String getAddress1(){
		return address1;
	}

	public void setPostcode(String postcode){
		this.postcode = postcode;
	}

	public String getPostcode(){
		return postcode;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	@Override
 	public String toString(){
		return 
			"Address{" + 
			"country = '" + country + '\'' + 
			",address2 = '" + address2 + '\'' + 
			",city = '" + city + '\'' + 
			",address1 = '" + address1 + '\'' + 
			",postcode = '" + postcode + '\'' + 
			",state = '" + state + '\'' + 
			"}";
		}
}