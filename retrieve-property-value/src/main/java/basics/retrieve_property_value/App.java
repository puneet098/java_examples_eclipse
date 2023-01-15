package basics.retrieve_property_value;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	MyCustomProperties properties = new MyCustomProperties();
    	
    	Logger.getLogger("App Main").log(Level.INFO, properties.getProperty("message.one"));
        Logger.getLogger("App Main").log(Level.INFO, properties.getProperty("message.two"));
        Logger.getLogger("App Main").log(Level.INFO, properties.getProperty("message.three"));
        Logger.getLogger("App Main").log(Level.INFO, properties.getProperty("message.four"));
        Logger.getLogger("App Main").log(Level.INFO, properties.getProperty("message.no.property"));
        
        var mfr = new PropertyReadingByRefection();
        mfr.printName(properties);
        Object obj = mfr.getPropertyValue(properties, "getProperty");
        System.out.println(obj.toString());
        System.out.println( "Hello World!" );
    }
}
