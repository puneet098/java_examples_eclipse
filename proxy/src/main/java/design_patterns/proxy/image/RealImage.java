package design_patterns.proxy.image;

public class RealImage implements Image {
	
	protected String fileName;
	
	public RealImage(String fileName) {
		super();
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying ....."+fileName);
	}
	
	private void loadFromDisk(String fileName2) {
		
		System.out.println("Loading from disk....."+fileName);
		
	}

}
