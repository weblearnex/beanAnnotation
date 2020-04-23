package com.springbeanannotation.springbeanannotation.config.springconfigs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springbeanannotation.springbeanannotation.beans.springbean.AddressWithString;
import com.springbeanannotation.springbeanannotation.beans.springbean.CompanyWithSpring;
import com.springbeanannotation.springbeanannotation.beans.tradisonalbean.User;


@Configuration
public class BeanConfiguration {
	
	@Bean(name="simpleUser")
	public User getUser() {
		return new User();
	}
	
	@Bean(name="userConst",initMethod="entryPoint", destroyMethod="exit")
	public User getUserWithDefault() {
		return new User("test","ABC");
	}
	
	@Bean(name="companySpring")
    public CompanyWithSpring getCompany() {
        return new CompanyWithSpring(new AddressWithString("Test Street Spring", 10000), "Appo");
    }
	
	

}
