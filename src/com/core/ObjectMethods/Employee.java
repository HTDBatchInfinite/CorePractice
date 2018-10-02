package com.core.ObjectMethods;

public class Employee implements Cloneable{
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int id;
	private String name;
	
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
	
	

}
