package com.codecool.catagochi.model.generated;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PetFinderCats{

	@JsonProperty("pagination")
	private Pagination pagination;

	@JsonProperty("animals")
	private List<AnimalsItem> animals;

	public void setPagination(Pagination pagination){
		this.pagination = pagination;
	}

	public Pagination getPagination(){
		return pagination;
	}

	public void setAnimals(List<AnimalsItem> animals){
		this.animals = animals;
	}

	public List<AnimalsItem> getAnimals(){
		return animals;
	}

	@Override
 	public String toString(){
		return 
			"PetFinderCats{" + 
			"pagination = '" + pagination + '\'' + 
			",animals = '" + animals + '\'' + 
			"}";
		}
}