package com.valuelabcheckin.dto;

public class Contact {
	private long id;
	private String pleaseSpecifyTheNatureOfYourEnquiry;
	private String firstName;
	private String lastName;
	private String email;
	private String companyName;
	private String howDidYouHearAboutUs;
	private String country;
	private String comments;
	public long getId() {
		return id;
	}
	public String getPleaseSpecifyTheNatureOfYourEnquiry() {
		return pleaseSpecifyTheNatureOfYourEnquiry;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getCompanyName() {
		return companyName;
	}
	public String getHowDidYouHearAboutUs() {
		return howDidYouHearAboutUs;
	}
	public String getCountry() {
		return country;
	}
	public String getComments() {
		return comments;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setPleaseSpecifyTheNatureOfYourEnquiry(String pleaseSpecifyTheNatureOfYourEnquiry) {
		this.pleaseSpecifyTheNatureOfYourEnquiry = pleaseSpecifyTheNatureOfYourEnquiry;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setHowDidYouHearAboutUs(String howDidYouHearAboutUs) {
		this.howDidYouHearAboutUs = howDidYouHearAboutUs;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	

}
