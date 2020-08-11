package com.codecool.catagochi.model.generated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Environment{

	@JsonProperty("cats")
	private boolean cats;

	@JsonProperty("children")
	private Object children;

	@JsonProperty("dogs")
	private Object dogs;

	public void setCats(boolean cats){
		this.cats = cats;
	}

	public boolean isCats(){
		return cats;
	}

	public void setChildren(Object children){
		this.children = children;
	}

	public Object getChildren(){
		return children;
	}

	public void setDogs(Object dogs){
		this.dogs = dogs;
	}

	public Object getDogs(){
		return dogs;
	}

	@Override
 	public String toString(){
		return 
			"Environment{" + 
			"cats = '" + cats + '\'' + 
			",children = '" + children + '\'' + 
			",dogs = '" + dogs + '\'' + 
			"}";
		}
}