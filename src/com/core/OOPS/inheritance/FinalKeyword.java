package com.core.OOPS.inheritance;

public class FinalKeyword {
public static void main(String[] args) {
	
}
}

class A {
	
	/*public final void m1(){
		System.out.println("class A inside m1 ");
	}*/
	public static void m1(){
		System.out.println("class A inside m1 ");
	}
}
	class B extends A{
		//Static method can't be overriden
		/*public void m1(){
			System.out.println("class B inside m1 ");
		}*/
		
		//static method can't be overriden
		/*@Override
		public static void m1(){
			System.out.println("class A inside m1 ");
		}*/
		
	}
	class C extends B{
		
	}
