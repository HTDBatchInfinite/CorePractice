package com.core.Threads;

public class Thread2 extends Thread {
	
	public Thread2(Shared s1, Shared s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
	}
	private Shared s1;
	private Shared s2;
	
	@Override
	public void run() {
		 s2.test1(s1); 
		
	}

}
