package org.thread.deadlock;
/*
 * this class is demonstrating thread deadlock.
 * Ordering of lock is importnent 
 */
public class TestThread {

	public  static Object Lock1 = new Object();
	public  static Object Lock2 = new Object();
	
	
	public static void main(String[] args) {
		System.out.println("====Welcome to Thread Deadlock");
		Thread t1 = new Thread(new ThreadDemo());
		Thread t2 = new Thread(new ThreadDemo01());
		t1.start();
		t2.start();
	}
	
	
}

class ThreadDemo implements Runnable{
		public void run() {
		synchronized (TestThread.Lock1){
			System.out.println("Thread1 is holding the lock");
			try {
				Thread.sleep(10);
			}catch(InterruptedException ex) {
			}
			
			System.out.println("Thread 1: waiting for lock2");
			
			synchronized (TestThread.Lock2) {
				System.out.println("Thread1: holding lock for Lock1 & Lock2 ");
			}
		}
	}

			
}

class ThreadDemo01 implements Runnable{
	
	public void run() {
		synchronized (TestThread.Lock1) {
			System.out.println("Thread2 is holding the lock 1");
			try {
				Thread.sleep(10);
			}catch(InterruptedException ex) {}
			System.out.println("Thread 2: Waiting for lock 2...");
			
			synchronized (TestThread.Lock2) {
				System.out.println("Thread2: holding lock for 1 & 2");
			}
		}
		
	}
	
}