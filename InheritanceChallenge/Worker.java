package worker;

import java.time.LocalDate;
import java.time.Period;

public class Worker {
	protected String name;
	protected LocalDate birthDate;
	protected LocalDate endDate;
	
	public Worker(String name, LocalDate birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public int getAge() {
		LocalDate today = LocalDate.now();
		Period agePeriod = Period.between(this.birthDate, today);
		int age = agePeriod.getYears();
		
		return age;
	}
	
	public double collectPay() {
		return 0.0;
	}
	
	public void terminate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public String toString() {
		return "Worker{" + "\n"
				+ "	Name: " + this.name + "\n"
				+ "	birthDate: " + this.birthDate + "\n"
				+ "	endDate: " + this.endDate + "\n"
				+ "}";
	}
}
