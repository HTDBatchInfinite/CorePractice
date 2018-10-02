package com.core.collections;

public class DesignPatterns {
	public static void main(String[] args) {
		SingletonDesnpattern singleton=SingletonDesnpattern.getInstance();
		System.out.println(singleton);
		
		/*SingletonDesnpattern singleton1=SingletonDesnpattern.getInstance();
		System.out.println(singleton1);*/
	}

}
class SingletonDesnpattern{
	private static SingletonDesnpattern sngleton;
	private SingletonDesnpattern(){
		
	}
	public static SingletonDesnpattern getInstance(){
		return sngleton=new SingletonDesnpattern();
	}
	
}
