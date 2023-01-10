package design_patterns.proxy.image;

public class ProxyImage extends RealImage {

	public ProxyImage(String fileName) {
		super(fileName);
	}
	
	@Override
	public void display() {
		if(fileName.endsWith(".jpg"))
			super.display();
		else
			System.out.println("nothing to display");
	}
	

}
