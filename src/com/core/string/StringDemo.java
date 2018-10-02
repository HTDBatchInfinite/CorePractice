package com.core.string;

public class StringDemo {
	public static void main(String[] args) {
		String s1=new String("chandu");
		s1=new String("siva");
		System.out.println("s1::"+s1);
		//we can't re intilizee the Object and 
		//we can't change the reference of the object
		//but we can change the state of the object
		final StringBuffer buffer=new StringBuffer("chandu");
		//buffer=new StringBuffer("siva");
		buffer.append(" ujjina");
		System.out.println("buffer::"+buffer.toString());
	}

}
