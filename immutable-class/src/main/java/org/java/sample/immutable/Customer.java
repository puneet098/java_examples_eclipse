package org.java.sample.immutable;

import java.time.LocalDate;

public final class Customer {

	private final int id;
	private final String name;
	private final LocalDate date;
	public Customer(int id, String name, LocalDate date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public LocalDate getDate() {
		return date;
	}
		
	
}
