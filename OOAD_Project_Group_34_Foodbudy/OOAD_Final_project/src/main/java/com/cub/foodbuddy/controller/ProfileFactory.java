package com.cub.foodbuddy.controller;

import com.cub.foodbuddy.model.*;

public class ProfileFactory {
	private EndUser endUser;
	private Host host;
	private Admin admin;
	
	public EndUser getEndUser() {
		return endUser;
	}
	public void setEndUser(EndUser endUser) {
		this.endUser = endUser;
	}
	
	public Host getHost() {
		return host;
	}
	public void setHost(Host host) {
		this.host = host;
	}
	
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
}
