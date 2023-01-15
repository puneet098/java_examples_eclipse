package basics.retrieve_property_value;

import java.lang.reflect.Method;

public class PropertyReadingByRefection {

	public void printName(Object obj) {
		var c = obj.getClass();
		System.out.println(c.getName());
	}
	
	public Object getPropertyValue(Object obj, String property) {
		Object returnValue = null;
		try {
            String methodName = property.substring(0, 1) + property.substring(1, property.length());
            Class clazz = obj.getClass();
            Class.forName(clazz.getName());
            clazz.getFields();
        }
        catch (Exception e) {
            // Do nothing, we'll return the default value
        }
		return returnValue;
	}
	

}
