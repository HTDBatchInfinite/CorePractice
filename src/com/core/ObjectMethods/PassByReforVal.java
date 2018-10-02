package com.core.ObjectMethods;

public class PassByReforVal {
	public static void main(String[] args) {
		String x = new String("ab");
		String s1="test1";
		change(x,s1);
		System.out.println(x);
		System.out.println(s1);
	}
	 
	public static void change(String x, String s1) {
		x = "cd";
		s1="xyz";
	}
}
