package basics.retrieve_property_value;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyCustomProperties {

	private final Properties properties;

	public MyCustomProperties() {
		properties = new Properties();
		 try {
			 	//properties.load(getClass().getClassLoader().getResourceAsStream("src/main/resources/myCustom.properties"));
	            properties.load(new FileInputStream("src/main/resources/myCustom.properties"));

	        } catch (Exception ioex) {
	            Logger.getLogger(getClass().getName()).log(Level.ALL, "IOException Occured while loading properties file::::" +ioex.getMessage());
	        }
	}
	
	public String getProperty(String keyName) {
		 Logger.getLogger(getClass().getName()).log(Level.INFO, "Reading Property " + keyName);
	        return properties.getProperty(keyName, "There is no key in the properties file");
		
	}
	
	
	
	
	
}
