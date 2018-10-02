package com.core.Final;

public final class CustomImmutable {
	public CustomImmutable(String name, int id, Age age) {
		super();
		this.name = name;
		this.id = id;
		Age cloneAge = new Age();
	    cloneAge.setDay(age.getDay());
	    cloneAge.setMonth(age.getMonth());
	    cloneAge.setYear(age.getYear());
	    this.age = cloneAge;
	}

	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	
	private final String name;
	private final int id;
	private final Age age;
	
	public Age getAge() {
		return age;
	}

	public static void main(String[] args) {
		Age age=new Age();
		age.setDay(13);
		age.setMonth(5);
		age.setYear(1992);
		CustomImmutable custom=new CustomImmutable("chandu", 1, age);
		System.out.println(custom.getAge().getYear());
		age.setYear(1993);
		System.out.println(custom.getAge().getYear());
	}

}
