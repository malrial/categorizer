package com.platform.categorizer.model.business;

import java.util.Date;

public class Event {
	
	private String name;
	private Date ts;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getTs() {
		return ts;
	}
	public void setTs(Date ts) {
		this.ts = ts;
	}

}
