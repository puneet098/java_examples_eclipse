package design_patterns.proxy.protection;

public class Car implements Driveable {
	
	protected Driver driver;
	
	

	public Car(Driver driver) {
		super();
		this.driver = driver;
	}



	public void drive() {
		System.out.println("The car is being driven by the driver.");

	}

}
