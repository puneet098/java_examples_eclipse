package design_patterns.proxy;

import design_patterns.proxy.image.Image;
import design_patterns.proxy.image.ProxyImage;
import design_patterns.proxy.protection.CarProxy;
import design_patterns.proxy.protection.Driveable;
import design_patterns.proxy.protection.Driver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("====protection proxy=====");
    	Driveable car = new CarProxy(new Driver(12));
    	car.drive();
    	
    	System.out.println("====Image proxy=====");
    	Image image = new ProxyImage("my.jpg");
    	image.display();
    	
    	image = new ProxyImage("");
    	image.display();
    	
    	
        System.out.println( "Hello World!" );
    }
}
