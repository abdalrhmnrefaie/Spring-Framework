package com.abdalrhmn;

public class Addresses {
	private String phone;
	private String gmail;
	private String country;
	private String sity;
	private String street;
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSity() {
		return sity;
	}

	public void setSity(String sity) {
		this.sity = sity;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String infoAddresses() {
		return "phone:"+phone + " gmail:"+ gmail + " country:"+ country + " sity:"+ sity + " street:"+ street;
	}

}
