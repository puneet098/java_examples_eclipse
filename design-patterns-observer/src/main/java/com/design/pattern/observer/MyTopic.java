package com.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {
	
	public List<Observer> observers = new ArrayList<>();
	public String message;
	public boolean changed;
	private final Object MUTEX = new Object();

	
	public MyTopic() {
		super();
		this.observers = new ArrayList<>();
	}

	@Override
	public void register(Observer observer) {
		if(observer == null)throw new  NullPointerException();
		synchronized(MUTEX) {
			if(!observers.contains(observer)) observers.add(observer);
		}

	}

	@Override
	public void unRegister(Observer observer) {
		synchronized(MUTEX) {
			if(observers.contains(observer)) observers.remove(observer);
		}

	}

	@Override
	public void notifyObservers() {
		List<Observer> observersLocal= null;
		//synchronization is used to make sure any observer registered after message is received is not notified
		synchronized (MUTEX) {
			if (!changed)
				return;
			observersLocal = new ArrayList<>(this.observers);
			this.changed=false;
		}
		for (Observer obj : observersLocal) {
			obj.update();
		}
	}

	@Override
	public Object getUpdate(Observer observer) {
		// TODO Auto-generated method stub
		return this.message;
	}
	
	//method to post message to the topic
		public void postMessage(String msg){
			System.out.println("Message Posted to Topic:"+msg);
			this.message=msg;
			this.changed=true;
			notifyObservers();
		}

}
