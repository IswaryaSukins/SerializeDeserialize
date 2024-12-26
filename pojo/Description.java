package com.testing.pojo;

public class Description {
	private String description;
	private String name;
	private String email;
	
	public Description() {
		
	}
	
	public Description(String desc,String Name,String mail) {
		this.description=desc;
		this.name=Name;
		this.email=mail;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Description [description=" + description + ", name=" + name + ", email=" + email + "]";
	}
	
	

}
