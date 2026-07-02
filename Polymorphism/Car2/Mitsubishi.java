package car;

public class Mitsubishi extends Car {
	public Mitsubishi(int cylinders, String name) {
		super(cylinders, name);
	}
	
	@Override
	public String startEngine() {
		//System.out.println(this.getClass().getSimpleName() + " is starting the engine...");
		return this.getClass().getSimpleName() + " is starting the engine...";
	}
	
	@Override
	public String accelerate() {
		//System.out.println(this.getClass().getSimpleName() + " is accelerating...");
		return this.getClass().getSimpleName() + " is accelerating...";
	}
	
	@Override
	public String brake() {
		//System.out.println(this.getClass().getSimpleName() + " is braking braking...");
		return this.getClass().getSimpleName() + " is braking braking...";
	}
}
