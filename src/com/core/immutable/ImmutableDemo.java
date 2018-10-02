package com.core.immutable;

import java.io.Serializable;
import java.util.Date;

public  final class ImmutableDemo implements Serializable{
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	//for
	public Date getDate() {
		return new Date();
	}
	public ImmutableDemo(int id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.date = new Date(new Date().getTime());
	}
	final int id;
	final String name;
	Date date=new Date();
	

}
