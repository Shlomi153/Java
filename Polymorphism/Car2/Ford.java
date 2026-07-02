package car;

public class Ford extends Car {
	public Ford(int cylinders, String name) {
		super(cylinders, name);
	}
	
	@Override
	public String startEngine() {
		//System.out.println(this.getClass().getName() + " is getting on it's way...");
		return this.getClass().getName() + " is getting on it's way...";
	}
	
	@Override
	public String accelerate() {
		//System.out.println(this.getClass().getName() + " is getting there a bit faster...");
		return this.getClass().getName() + " is getting there a bit faster...";
	}
	
	@Override
	public String brake() {
		//System.out.println(this.getClass().getName() + " is starting to stop...");
		return this.getClass().getName() + " is starting to stop...";
	}
}
