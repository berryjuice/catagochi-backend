package com.codecool.catagochi.model.generated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pagination{

	@JsonProperty("_links")
	private Links links;

	@JsonProperty("count_per_page")
	private int countPerPage;

	@JsonProperty("total_count")
	private int totalCount;

	@JsonProperty("total_pages")
	private int totalPages;

	@JsonProperty("current_page")
	private int currentPage;

	public void setLinks(Links links){
		this.links = links;
	}

	public Links getLinks(){
		return links;
	}

	public void setCountPerPage(int countPerPage){
		this.countPerPage = countPerPage;
	}

	public int getCountPerPage(){
		return countPerPage;
	}

	public void setTotalCount(int totalCount){
		this.totalCount = totalCount;
	}

	public int getTotalCount(){
		return totalCount;
	}

	public void setTotalPages(int totalPages){
		this.totalPages = totalPages;
	}

	public int getTotalPages(){
		return totalPages;
	}

	public void setCurrentPage(int currentPage){
		this.currentPage = currentPage;
	}

	public int getCurrentPage(){
		return currentPage;
	}

	@Override
 	public String toString(){
		return 
			"Pagination{" + 
			"_links = '" + links + '\'' + 
			",count_per_page = '" + countPerPage + '\'' + 
			",total_count = '" + totalCount + '\'' + 
			",total_pages = '" + totalPages + '\'' + 
			",current_page = '" + currentPage + '\'' + 
			"}";
		}
}