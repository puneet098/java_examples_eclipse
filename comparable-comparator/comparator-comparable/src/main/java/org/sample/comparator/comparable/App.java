package org.sample.comparator.comparable;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	var list = new ArrayList<Employee>();
    	list.add(new Employee(1,"Puneet",40));
    	list.add(new Employee(10,"Pawan",27));
    	list.add(new Employee(5,"Jayant",30));
    	list.add(new Employee(12,"Upasana",25));
    	list.add(new Employee(3,"Suprabha",30));
    	
    	for(Employee e:list) {
    		System.out.println("ID:--:"+e.getEmployeeId()+"==="+"name:--"+e.getName());
    	}
    	Collections.sort(list);
    	System.out.println("Comparable in action**************************");
    	for(Employee e:list) {
    		System.out.println("ID:--:"+e.getEmployeeId()+"==="+"name:--"+e.getName());
    	}
    	System.out.println("Comparator in action**************************");
    	Collections.sort(list, (emp1,emp2) -> emp1.getName().compareTo(emp2.getName()));
    	 for(Employee employee : list) {
             System.out.println(employee.getName());
         }
        System.out.println( "Hello World!" );
    }
}
