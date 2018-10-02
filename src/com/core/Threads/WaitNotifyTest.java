package com.core.Threads;

public class WaitNotifyTest {
	public static void main(String[] args) {
		Message mes=new Message("procees it");
		
		Waiter waiter=new Waiter(mes);
		new Thread(waiter,"waiter1").start();
		
		Waiter waiter1=new Waiter(mes);
		new Thread(waiter1,"waiter2").start();
		
		Notifier notifier = new Notifier(mes);
        new Thread(notifier, "notifier").start();
        System.out.println("All the threads are started");
	}

}
