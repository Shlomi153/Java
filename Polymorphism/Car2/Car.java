package car;

public class Car {
	private int cylinders;
	private boolean engine;
	private String name;
	private int wheels;
	
	public Car(int cylinders, String name) {
		this.cylinders = cylinders;
		this.name = name;
		this.engine = true;
		this.wheels = 4;
	}
	
	public String startEngine() {
		//System.out.println(this.getClass().getSimpleName() + " engine is starting...");
		return this.getClass().getSimpleName() + " engine is starting...";
	}
	
	public String accelerate() {
		//System.out.println(this.getClass().getSimpleName() + " is accelerating...");
		return this.getClass().getSimpleName() + " is accelerating...";
	}
	
	public String brake() {
		//System.out.println(this.getClass().getSimpleName() + " is hitting the brake...");
		return this.getClass().getSimpleName() + " is hitting the brake...";
	}
	
	public int getCylinders() {
		return this.cylinders;
	}
	
	public String getName() {
		return this.name;
	}
}
