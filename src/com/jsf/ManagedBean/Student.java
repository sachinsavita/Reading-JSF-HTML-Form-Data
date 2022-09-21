package com.jsf.ManagedBean;

import java.util.*;

import javax.faces.bean.ManagedBean;

@ManagedBean      //1.
public class Student {
	
	private String userName;
	private String firstName;
	private String lastName;
	private String country;
	private String favouriteLanguage;
	private String skills[];
	
	
	//list of counties for drop down list
			List<String> countryOptions;
	
	//no-arg constructor    //2.
	public Student() {
		
		//Pre populate
		firstName = "Rajesh";
		lastName="Shukla";
		country = "India";
		favouriteLanguage = "Java";
		skills = new String[] {"Spring","JSF"};
		
		//populate the list of countries
		countryOptions = new ArrayList<>();
		
		countryOptions.add("Brazil");
		countryOptions.add("India");
		countryOptions.add("Russia");
		countryOptions.add("Oman");
		countryOptions.add("France");
		
	}

	
	//Getters and Setters       //3.
	public List<String> getCountryOptions() {
		return countryOptions;
	}

	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	public String getFavouriteLanguage() {
		
		return favouriteLanguage;
	}


	public void setFavouriteLanguage(String favouriteLanguage) {
		
		this.favouriteLanguage = favouriteLanguage;
	}


	public String[] getSkills() {
		return skills;
	}


	public void setSkills(String[] skills) {
		this.skills = skills;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}

	

}
