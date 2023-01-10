package com.design.pattern.observer;

public interface Observer {
	
	//method to update the observer, used by subject
	public void update();
	
	//attach subject with the observer
	public void setSubject(Subject sub);

}
