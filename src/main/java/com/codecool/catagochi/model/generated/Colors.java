package com.codecool.catagochi.model.generated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Colors{

	@JsonProperty("secondary")
	private Object secondary;

	@JsonProperty("tertiary")
	private Object tertiary;

	@JsonProperty("primary")
	private String primary;

	public void setSecondary(Object secondary){
		this.secondary = secondary;
	}

	public Object getSecondary(){
		return secondary;
	}

	public void setTertiary(Object tertiary){
		this.tertiary = tertiary;
	}

	public Object getTertiary(){
		return tertiary;
	}

	public void setPrimary(String primary){
		this.primary = primary;
	}

	public String getPrimary(){
		return primary;
	}

	@Override
 	public String toString(){
		return 
			"Colors{" + 
			"secondary = '" + secondary + '\'' + 
			",tertiary = '" + tertiary + '\'' + 
			",primary = '" + primary + '\'' + 
			"}";
		}
}