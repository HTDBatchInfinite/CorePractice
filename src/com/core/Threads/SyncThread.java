package com.core.Threads;

public class SyncThread implements Runnable{
	public SyncThread(Object obj1, Object obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}


	public Object getObj1() {
		return obj1;
	}


	public void setObj1(Object obj1) {
		this.obj1 = obj1;
	}


	public Object getObj2() {
		return obj2;
	}


	public void setObj2(Object obj2) {
		this.obj2 = obj2;
	}


	private Object obj1;
    private Object obj2;


	@Override
	public void run() {
		String name = Thread.currentThread().getName();
        System.out.println(name + " acquiring lock on "+obj1);
        synchronized (obj1) {
         System.out.println(name + " acquired lock on "+obj1);
         work();
         System.out.println(name + " acquiring lock on "+obj2);
         synchronized (obj2) {
            System.out.println(name + " acquired lock on "+obj2);
            work();
        }
         System.out.println(name + " released lock on "+obj2);
        }
        System.out.println(name + " released lock on "+obj1);
        System.out.println(name + " finished execution.");
		
	}
	private void work() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}
