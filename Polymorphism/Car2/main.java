package car;

public class main {
	public static void main(String[] args) {
//		//For all these below should change the methods in the classes to void instead of String
		
//		car();
//		
//		System.out.println();
//		
//		mitsubishi();
//		
//		System.out.println();
//		
//		holden();
//		
//		System.out.println();
//		
//		ford();
		
		Car car = new Car(8, "Base car");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		 
		Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
		System.out.println(mitsubishi.startEngine());
		System.out.println(mitsubishi.accelerate());
		System.out.println(mitsubishi.brake());
		 
		Ford ford = new Ford(6, "Ford Falcon");
		System.out.println(ford.startEngine());
		System.out.println(ford.accelerate());
		System.out.println(ford.brake());
		 
		Holden holden = new Holden(6, "Holden Commodore");
		System.out.println(holden.startEngine());
		System.out.println(holden.accelerate());
		System.out.println(holden.brake());
	}
	//For all these below should change the methods in the classes to void instead of String
	public static void car() {
		Car car = new Car(6, "Test car");
		
		System.out.println("Name: " + car.getName());
		System.out.println("Cylinders: " + car.getCylinders());
		
		car.startEngine();
		car.accelerate();
		car.brake();
	}
	
	public static void mitsubishi() {
		Mitsubishi eclipse = new Mitsubishi(8, "Eclipse Cross");
		
		System.out.println("Name: " + eclipse.getName());
		System.out.println("Cylinders: " + eclipse.getCylinders());
		
		eclipse.startEngine();
		eclipse.accelerate();
		eclipse.brake();
	}
	
	public static void holden() {
		Holden captiva = new Holden(2, "Captiva");
		
		System.out.println("Name: " + captiva.getName());
		System.out.println("Cylinders: " + captiva.getCylinders());
		
		captiva.startEngine();
		captiva.accelerate();
		captiva.brake();
	}
	
	public static void ford() {
		Ford mustang = new Ford(12, "Ford Mustang");
		
		System.out.println("Name: " + mustang.getName());
		System.out.println("Cylinders: " + mustang.getCylinders());
		
		mustang.startEngine();
		mustang.accelerate();
		mustang.brake();
	}
	
	
}
