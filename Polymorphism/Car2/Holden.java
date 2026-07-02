package car;

public class Holden extends Car {
	public Holden(int cylinders, String name) {
		super(cylinders, name);
	}
	
	@Override
	public String startEngine() {
		//System.out.println(this.getClass().getSimpleName() + " is starting starting...");
		return this.getClass().getSimpleName() + " is starting starting...";
	}
	
	@Override
	public String accelerate() {
		//System.out.println(this.getClass().getSimpleName() + " is speeding up...");
		return this.getClass().getSimpleName() + " is speeding up...";
	}
	
	@Override
	public String brake() {
		//System.out.println(this.getClass().getSimpleName() + " is stopping right about...now...");
		return this.getClass().getSimpleName() + " is stopping right about...now...";
	}
}
