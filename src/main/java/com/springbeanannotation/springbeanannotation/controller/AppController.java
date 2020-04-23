package com.springbeanannotation.springbeanannotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbeanannotation.springbeanannotation.beans.springbean.CompanyWithSpring;
import com.springbeanannotation.springbeanannotation.beans.tradisonalbean.Address;
import com.springbeanannotation.springbeanannotation.beans.tradisonalbean.Company;
import com.springbeanannotation.springbeanannotation.beans.tradisonalbean.User;


@RestController
public class AppController {
	
	@Autowired
	@Qualifier("simpleUser")
	private User user;
	
	@Autowired
	@Qualifier("userConst")
	private User userConst;
	
	Address address = new Address("Test street", 1000);
	Company company = new Company(address ,"Apple");
	
	@Autowired
	@Qualifier("companySpring")
	private CompanyWithSpring springapproch;
	
	@GetMapping("/")
	public String app(){
		user.entryPoint();
		System.out.println(user.getName() +"  "+user.getAdd());
		return "Application up and running";
	}
	
	@GetMapping("/userConst")
	public String userConst(){
		user.entryPoint();
		System.out.println(userConst.getName() +"  "+userConst.getAdd());
		return "Application up and running";
	}
	
	@GetMapping("/traditional")
	public String traditional(){
		System.out.println(company.getCompanyName());
		System.out.println(company.getAddress().getNumber()+"::::::"+company.getAddress().getStreet());
		return "Application up and running";
	}
	
	@GetMapping("/springapproch")
	public String springapproch(){
		System.out.println(springapproch.getCompanyName());
		System.out.println(springapproch.getAddressWithString().getNumber()+"::::::"+springapproch.getAddressWithString().getStreet());
		return "Application up and running";
	}

}
