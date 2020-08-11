package com.codecool.catagochi.model.generated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Next{

	@JsonProperty("href")
	private String href;

	public void setHref(String href){
		this.href = href;
	}

	public String getHref(){
		return href;
	}

	@Override
 	public String toString(){
		return 
			"Next{" + 
			"href = '" + href + '\'' + 
			"}";
		}
}