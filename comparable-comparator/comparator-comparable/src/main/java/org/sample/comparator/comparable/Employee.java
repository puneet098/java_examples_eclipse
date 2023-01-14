package org.sample.comparator.comparable;

import java.util.Comparator;

public class Employee implements Comparable<Employee>, Comparator<Employee>{

	private int employeeId;
	private String name;
	private int age;





	public Employee(int employeeId, String name, int age) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee() {

	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.employeeId - o.employeeId;
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(getName());
	}


}
