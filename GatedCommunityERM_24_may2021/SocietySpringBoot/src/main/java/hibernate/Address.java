package hibernate;

import javax.persistence.Column;
import javax.persistence.Transient;

public class Address 
{
	@Column(nullable=false)
	private String address;
	
	@Column(nullable=false)
	private final String country="India";
	
	@Column(nullable=false)
	private String state;
	
	@Column(nullable=false)
	private String city;
	
	@Column(nullable=false)
	private String street;
	
	@Column(nullable=false)
	private int pincode;
	
	@Transient
	private String completeaddress;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCompleteaddress() {
		return completeaddress;
	}

	public void setCompleteaddress(String completeaddress) {
		this.completeaddress = completeaddress;
	}

	public String getCountry() {
		return country;
	}
	
	
}