package co.tomcio.springdemo.mvc;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private String favoriteLanguageSet;
	private String favoriteLanguageFile;
	private String[] operatingSystems;
	
	private HashMap<String, String> favoriteLanguageOptions;
	
	// private HashMap<String, String> countryOptions;

	public Student() {
		// populated country options: used ISO country code
//		countryOptions = new HashMap<>();
//		countryOptions.put("BR", "Brasil");
//		countryOptions.put("FR", "France");
//		countryOptions.put("DE", "Germany");
//		countryOptions.put("IN", "India");
//		countryOptions.put("PL", "Proland");
//		countryOptions.put("GB", "Great Britain");
//		countryOptions.put("US", "Unitet States of America");
		
		favoriteLanguageOptions = new HashMap<>();
		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("PHP", "PHP");
		favoriteLanguageOptions.put("C#", "C#");
		favoriteLanguageOptions.put("Ruby", "Ruby");
		favoriteLanguageOptions.put("JS", "JavaScript");
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

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
	public HashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public String getFavoriteLanguageSet() {
		return favoriteLanguageSet;
	}

	public void setFavoriteLanguageSet(String favoriteLanguageSet) {
		this.favoriteLanguageSet = favoriteLanguageSet;
	}

	public String getFavoriteLanguageFile() {
		return favoriteLanguageFile;
	}

	public void setFavoriteLanguageFile(String favoriteLanguageFile) {
		this.favoriteLanguageFile = favoriteLanguageFile;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

//	public HashMap<String, String> getCountryOptions() {
//		return countryOptions;
//	}

}
