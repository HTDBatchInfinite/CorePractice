package com.core.Threads;

public class ThreadTest {
	public static Object lock1=new Object();
	public static Object lock2=new Object();
	public static void main(String[] args) {
		ThreadDemo1 demo1=new ThreadDemo1();
		ThreadDemo2 demo2 = new ThreadDemo2();
		demo1.start();
		demo2.start();
		
	}

private static class ThreadDemo1 extends Thread{
	@Override
	public void run(){
		synchronized (lock1) {
			System.out.println("Thread 1: Holding lock 1...");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread 1: Waiting for lock 2...");
			synchronized (lock2) {
				System.out.println("Thread 1: Holding lock 1 & 2...");
				
			}
		}
		
	}
}
	private static class ThreadDemo2 extends Thread{
		@Override
		public void run(){
			synchronized (lock2) {
				System.out.println("Thread 2: Holding lock 2...");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread 1: Waiting for lock 2...");
				synchronized (lock1) {
					System.out.println("Thread 1: Holding lock 1 & 2...");
				}
			}
			
		}
}
}

