package org.lambda.intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		new Thread(new CodeToRun()).start();//runnable implementation
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("this is from anonymous runnable");

			}

		}).start();//anonymous thread

		new Thread(()->System.out.println("printing from constructor")).start();//supported in jre8

		new Thread(() -> {
			System.out.println("printing line 1");
			System.out.println("printing line 2");
			System.out.format("pprinting line %d\n", 3);
		}).start();
	
	Employee john = new Employee("John Doe",30);
	Employee paul = new Employee("Paul",25);
	Employee jack = new Employee("Jack Hill", 40);
	Employee snow= new Employee("Snow White", 22);

	List<Employee> employees= new ArrayList<>();
	employees.add(jack);
	employees.add(snow);
	employees.add(paul);
	employees.add(john);
	
	Collections.sort(employees, new Comparator<Employee>() {
		
		public int compare(Employee e1, Employee e2) {
			return e1.getName().compareTo(e2)
		}
	});
	
	

	}

}
}

class CodeToRun implements Runnable{

	@Override
	public void run() {
		System.out.println("Printing from the runnable");

	}

}

class Employee{
	private String name;
	private int age;


	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


}