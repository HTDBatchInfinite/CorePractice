package com.core.string;

public class StringReverse {
	public static void main(String[] args) {
		useStringBUffer();
		useStringBuilder();
		useString();
		String name="chandu";
		String reverse=UseRecursion("chandu");
		System.out.println("recursion:::"+reverse);
		
	}

	private static String UseRecursion(String name) {
		if(name==null||name.length()<=1){
			return name;
		}
		return UseRecursion(name.substring(1))+name.charAt(0);
		
	}

	private static void useString() {
		String name="chandu";
		char[] arr=name.toCharArray();
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]);
		}
		
	}

	private static void useStringBuilder() {
		StringBuffer buffer=new StringBuffer("chandu");
		System.out.println("original buffer::"+buffer.toString());
		buffer.reverse();
		System.out.println("reverse buffer::"+buffer.toString());
		
	}

	private static void useStringBUffer() {
		StringBuilder bulider=new StringBuilder("chandu");
		System.out.println("original bulider::"+bulider.toString());
		bulider.reverse();
		System.out.println("reverse bulider::"+bulider.toString());
		
	}

}
