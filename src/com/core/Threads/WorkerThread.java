package com.core.Threads;

public class WorkerThread implements Runnable{
	
	@Override
	public String toString() {
		return "WorkerThread [command=" + command + "]";
	}
	public WorkerThread(String command) {
		super();
		this.command = command;
	}
	private String command;

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Start. Command = "+command);
		synchronized (this) {
	        processCommand();
	        System.out.println(Thread.currentThread().getName()+" End.");
		}
		
		
	}
	private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
