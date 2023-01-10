package design_patterns.proxy.protection;

public class CarProxy extends Car {

	public CarProxy(Driver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void drive() {
		if(driver.age >= 16)
			super.drive();
		else			
		System.out.println("driver too young to drive.");
	}

}
