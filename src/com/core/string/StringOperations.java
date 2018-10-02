package com.core.string;

public class StringOperations {
	public static void main(String[] args) {
		String s1="abc";
		String s2="abc";
		//literal always stored in string pool
		 boolean doubleequal=s1==s2 ? true : false;
		 System.out.println("s1==s2:"+doubleequal);
		 
		 boolean equals=s1.equals(s2) ? true : false;
		 System.out.println("s1.equals(s2):"+equals);
		 
		 String s3="test";
		 String s4=new String("test").intern();
		 
		 boolean result1=s3==s4 ? true : false;
		 System.out.println("s3==s4:"+result1);
		 
		 
	}

}
