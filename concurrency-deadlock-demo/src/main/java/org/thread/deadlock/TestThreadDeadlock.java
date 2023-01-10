package org.thread.deadlock;

public class TestThreadDeadlock {

	public  static Object Lock1 = new Object();
	public  static Object Lock2 = new Object();
	
	
	public static void main(String[] args) {
		System.out.println("====Welcome to Thread Deadlock");
		Thread t1 = new Thread(new ThreadDemo1());
		Thread t2 = new Thread(new ThreadDemo2());
		t1.start();
		t2.start();
	}
	
	
}

class ThreadDemo1 implements Runnable{
		public void run() {
		synchronized (TestThreadDeadlock.Lock1){
			System.out.println("ThreadDemo1 is holding the lock");
			try {
				Thread.sleep(10);
			}catch(InterruptedException ex) {
			}
			
			System.out.println("Thread 1: waiting for lock2");
			
			synchronized (TestThreadDeadlock.Lock2) {
				System.out.println("Thread1: holding lock for Lock1 & Lock2 ");
			}
		}
	}

			
}

class ThreadDemo2 implements Runnable{
	
	public void run() {
		synchronized (TestThreadDeadlock.Lock2) {
			System.out.println("ThreadDemo2 is holding the lock");
			try {
				Thread.sleep(10);
			}catch(InterruptedException ex) {}
			
			synchronized (TestThreadDeadlock.Lock1) {
				System.out.println("Thread2: holding lock for 1 & 2");
			}
		}
		
	}
	
}