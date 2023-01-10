package com.design.pattern.observer;

public interface Subject {

	//methods to register and unregister observers
	public void register(Observer observer);
	public void unRegister(Observer observer);
	
	//method to notify the observers
	public void notifyObservers();
	
	//method to get updates from subject
	public Object getUpdate(Observer observer);
}
