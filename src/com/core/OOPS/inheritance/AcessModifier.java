package com.core.OOPS.inheritance;

 
public class AcessModifier{
	public static void main(String[] args) {
		Parent parent=new Child1();
		parent.m2();
		
		Parent parent1=new Child2();
		parent1.m2();
		
	}
}
class Parent {
	
	public void m1(){
		System.out.println("inside Parent class public  m1()");
	}
	protected void m2(){
		System.out.println("inside Parent class protected m2()");
	}
	
	private void m3(){
		System.out.println("inside Parent class private m3()");
	}
}
	class Child1 extends Parent{
		@Override
		protected void m2(){
			System.out.println("inside child1 class protected m2()");
		}
	}
	class Child2 extends Child1{
		@Override
		protected void m2(){
			System.out.println("inside child2 class protected m2()");
		}
	}
	


