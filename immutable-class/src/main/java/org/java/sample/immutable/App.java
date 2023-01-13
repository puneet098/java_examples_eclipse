package org.java.sample.immutable;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void main( String[] args )
	{
		LocalDate date = LocalDate.now();
		Customer c1 = new Customer(1,"Puneet",date);
		System.out.println( "Hello World!"+date );
		c1.getDate();
	}


}


