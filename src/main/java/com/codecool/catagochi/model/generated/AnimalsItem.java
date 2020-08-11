package com.codecool.catagochi.model.generated;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AnimalsItem{

	@JsonProperty("gender")
	private String gender;

	@JsonProperty("distance")
	private Object distance;

	@JsonProperty("_links")
	private Links links;

	@JsonProperty("status_changed_at")
	private String statusChangedAt;

	@JsonProperty("description")
	private String description;

	@JsonProperty("organization_animal_id")
	private Object organizationAnimalId;

	@JsonProperty("videos")
	private List<Object> videos;

	@JsonProperty("type")
	private String type;

	@JsonProperty("photos")
	private List<Object> photos;

	@JsonProperty("colors")
	private Colors colors;

	@JsonProperty("breeds")
	private Breeds breeds;

	@JsonProperty("contact")
	private Contact contact;

	@JsonProperty("id")
	private int id;

	@JsonProperty("published_at")
	private String publishedAt;

	@JsonProperty("primary_photo_cropped")
	private Object primaryPhotoCropped;

	@JsonProperty("url")
	private String url;

	@JsonProperty("tags")
	private List<Object> tags;

	@JsonProperty("coat")
	private String coat;

	@JsonProperty("environment")
	private Environment environment;

	@JsonProperty("size")
	private String size;

	@JsonProperty("species")
	private String species;

	@JsonProperty("organization_id")
	private String organizationId;

	@JsonProperty("name")
	private String name;

	@JsonProperty("attributes")
	private Attributes attributes;

	@JsonProperty("age")
	private String age;

	@JsonProperty("status")
	private String status;

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getGender(){
		return gender;
	}

	public void setDistance(Object distance){
		this.distance = distance;
	}

	public Object getDistance(){
		return distance;
	}

	public void setLinks(Links links){
		this.links = links;
	}

	public Links getLinks(){
		return links;
	}

	public void setStatusChangedAt(String statusChangedAt){
		this.statusChangedAt = statusChangedAt;
	}

	public String getStatusChangedAt(){
		return statusChangedAt;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setOrganizationAnimalId(Object organizationAnimalId){
		this.organizationAnimalId = organizationAnimalId;
	}

	public Object getOrganizationAnimalId(){
		return organizationAnimalId;
	}

	public void setVideos(List<Object> videos){
		this.videos = videos;
	}

	public List<Object> getVideos(){
		return videos;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setPhotos(List<Object> photos){
		this.photos = photos;
	}

	public List<Object> getPhotos(){
		return photos;
	}

	public void setColors(Colors colors){
		this.colors = colors;
	}

	public Colors getColors(){
		return colors;
	}

	public void setBreeds(Breeds breeds){
		this.breeds = breeds;
	}

	public Breeds getBreeds(){
		return breeds;
	}

	public void setContact(Contact contact){
		this.contact = contact;
	}

	public Contact getContact(){
		return contact;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setPublishedAt(String publishedAt){
		this.publishedAt = publishedAt;
	}

	public String getPublishedAt(){
		return publishedAt;
	}

	public void setPrimaryPhotoCropped(Object primaryPhotoCropped){
		this.primaryPhotoCropped = primaryPhotoCropped;
	}

	public Object getPrimaryPhotoCropped(){
		return primaryPhotoCropped;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setTags(List<Object> tags){
		this.tags = tags;
	}

	public List<Object> getTags(){
		return tags;
	}

	public void setCoat(String coat){
		this.coat = coat;
	}

	public String getCoat(){
		return coat;
	}

	public void setEnvironment(Environment environment){
		this.environment = environment;
	}

	public Environment getEnvironment(){
		return environment;
	}

	public void setSize(String size){
		this.size = size;
	}

	public String getSize(){
		return size;
	}

	public void setSpecies(String species){
		this.species = species;
	}

	public String getSpecies(){
		return species;
	}

	public void setOrganizationId(String organizationId){
		this.organizationId = organizationId;
	}

	public String getOrganizationId(){
		return organizationId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAttributes(Attributes attributes){
		this.attributes = attributes;
	}

	public Attributes getAttributes(){
		return attributes;
	}

	public void setAge(String age){
		this.age = age;
	}

	public String getAge(){
		return age;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"AnimalsItem{" + 
			"gender = '" + gender + '\'' + 
			",distance = '" + distance + '\'' + 
			",_links = '" + links + '\'' + 
			",status_changed_at = '" + statusChangedAt + '\'' + 
			",description = '" + description + '\'' + 
			",organization_animal_id = '" + organizationAnimalId + '\'' + 
			",videos = '" + videos + '\'' + 
			",type = '" + type + '\'' + 
			",photos = '" + photos + '\'' + 
			",colors = '" + colors + '\'' + 
			",breeds = '" + breeds + '\'' + 
			",contact = '" + contact + '\'' + 
			",id = '" + id + '\'' + 
			",published_at = '" + publishedAt + '\'' + 
			",primary_photo_cropped = '" + primaryPhotoCropped + '\'' + 
			",url = '" + url + '\'' + 
			",tags = '" + tags + '\'' + 
			",coat = '" + coat + '\'' + 
			",environment = '" + environment + '\'' + 
			",size = '" + size + '\'' + 
			",species = '" + species + '\'' + 
			",organization_id = '" + organizationId + '\'' + 
			",name = '" + name + '\'' + 
			",attributes = '" + attributes + '\'' + 
			",age = '" + age + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}