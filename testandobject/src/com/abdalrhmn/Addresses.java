package com.abdalrhmn;

public class Addresses {
	private String phone;
	private String gmail;
	private String country;
	private String sity;
	private String street;
	public Addresses(String phone, String gmail, String country, String sity, String street) {
		super();
		this.phone = phone;
		this.gmail = gmail;
		this.country = country;
		this.sity = sity;
		this.street = street;
	}
	public String infoAddresses() {
		return "phone:"+phone + " gmail:"+ gmail + " country:"+ country + " sity:"+ sity + " street:"+ street;
	}

}
