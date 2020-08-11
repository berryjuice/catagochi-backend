package com.codecool.catagochi.model.generated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Attributes{

	@JsonProperty("shots_current")
	private boolean shotsCurrent;

	@JsonProperty("special_needs")
	private boolean specialNeeds;

	@JsonProperty("declawed")
	private boolean declawed;

	@JsonProperty("spayed_neutered")
	private boolean spayedNeutered;

	@JsonProperty("house_trained")
	private boolean houseTrained;

	public void setShotsCurrent(boolean shotsCurrent){
		this.shotsCurrent = shotsCurrent;
	}

	public boolean isShotsCurrent(){
		return shotsCurrent;
	}

	public void setSpecialNeeds(boolean specialNeeds){
		this.specialNeeds = specialNeeds;
	}

	public boolean isSpecialNeeds(){
		return specialNeeds;
	}

	public void setDeclawed(boolean declawed){
		this.declawed = declawed;
	}

	public boolean isDeclawed(){
		return declawed;
	}

	public void setSpayedNeutered(boolean spayedNeutered){
		this.spayedNeutered = spayedNeutered;
	}

	public boolean isSpayedNeutered(){
		return spayedNeutered;
	}

	public void setHouseTrained(boolean houseTrained){
		this.houseTrained = houseTrained;
	}

	public boolean isHouseTrained(){
		return houseTrained;
	}

	@Override
 	public String toString(){
		return 
			"Attributes{" + 
			"shots_current = '" + shotsCurrent + '\'' + 
			",special_needs = '" + specialNeeds + '\'' + 
			",declawed = '" + declawed + '\'' + 
			",spayed_neutered = '" + spayedNeutered + '\'' + 
			",house_trained = '" + houseTrained + '\'' + 
			"}";
		}
}