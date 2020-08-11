package com.codecool.catagochi.model.generated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Links{

	@JsonProperty("organization")
	private Organization organization;

	@JsonProperty("self")
	private Self self;

	@JsonProperty("type")
	private Type type;

	public void setOrganization(Organization organization){
		this.organization = organization;
	}

	public Organization getOrganization(){
		return organization;
	}

	public void setSelf(Self self){
		this.self = self;
	}

	public Self getSelf(){
		return self;
	}

	public void setType(Type type){
		this.type = type;
	}

	public Type getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"Links{" + 
			"organization = '" + organization + '\'' + 
			",self = '" + self + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}