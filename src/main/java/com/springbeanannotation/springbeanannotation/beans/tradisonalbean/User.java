package com.springbeanannotation.springbeanannotation.beans.tradisonalbean;

public class User {
	
	private String name;
	private String add;
	
	public User() {
		
	}
	
	public User(String name, String add) {
		super();
		this.name = name;
		this.add = add;
	}

	public void entryPoint(){
		System.out.println("this is entry point bean");
	}
	
	public void exit(){
		System.out.println("this is exit point bean");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}
	
	
	
	

}
