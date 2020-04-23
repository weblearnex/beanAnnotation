package com.springbeanannotation.springbeanannotation.beans.tradisonalbean;

public class Company {
	 private String companyName;
	 private Address address;
	 
	    public Company(Address address ,String companyName) {
	        this.address = address;
	        this.companyName =companyName;
	    }

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		
		
	    
}
