package com.springbeanannotation.springbeanannotation.beans.springbean;

import org.springframework.stereotype.Component;


@Component
public class CompanyWithSpring{
	
	private String companyName;
	private AddressWithString addressWithString;
	 
	public CompanyWithSpring() {
	  
	}
	
    public CompanyWithSpring(AddressWithString addressWithString,String companyName) {
        this.addressWithString = addressWithString;
        this.companyName=companyName;
    	}
    
	public AddressWithString getAddressWithString() {
		return addressWithString;
	}

	public void setAddressWithString(AddressWithString addressWithString) {
		this.addressWithString = addressWithString;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
    
}
