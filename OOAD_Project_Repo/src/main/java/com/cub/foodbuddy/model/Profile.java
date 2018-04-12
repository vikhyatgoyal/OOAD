package com.cub.foodbuddy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class Profile {

	/* Attributes */
	@Column(name = "name")
	private String name;
	@Id
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "mobile")
	private String mobile;
	private String type;
	
	/* Default Constructor */
	public Profile() {
		
	}
	
	/* Overloaded constructor */
	public Profile(String name, String email, String password, String mobile, String type) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.type = type;
	}
	/* Getters and Setters */
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}