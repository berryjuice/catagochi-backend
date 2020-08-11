package com.codecool.catagochi.model.generated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Breeds{

	@JsonProperty("secondary")
	private Object secondary;

	@JsonProperty("mixed")
	private boolean mixed;

	@JsonProperty("primary")
	private String primary;

	@JsonProperty("unknown")
	private boolean unknown;

	public void setSecondary(Object secondary){
		this.secondary = secondary;
	}

	public Object getSecondary(){
		return secondary;
	}

	public void setMixed(boolean mixed){
		this.mixed = mixed;
	}

	public boolean isMixed(){
		return mixed;
	}

	public void setPrimary(String primary){
		this.primary = primary;
	}

	public String getPrimary(){
		return primary;
	}

	public void setUnknown(boolean unknown){
		this.unknown = unknown;
	}

	public boolean isUnknown(){
		return unknown;
	}

	@Override
 	public String toString(){
		return 
			"Breeds{" + 
			"secondary = '" + secondary + '\'' + 
			",mixed = '" + mixed + '\'' + 
			",primary = '" + primary + '\'' + 
			",unknown = '" + unknown + '\'' + 
			"}";
		}
}