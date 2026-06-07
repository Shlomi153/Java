package worker;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public class Worker {
	private String name;
	private LocalDate birthDate;
	private LocalDate endDate;
	
	public Worker() {}
	
	public Worker(String name, LocalDate birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public int getAge() {
		LocalDate now = LocalDate.now();
		int age = (int)ChronoUnit.YEARS.between(this.birthDate, now);
		
		return age;
	}
	
	public double collectPay() {
		return 0.0;
	}
	
	public void terminate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	@Override
	public String toString() {
		return 	"Worker{" + "\n" +
				"	Name: " + this.name + "\n" + 
				"	Date of birth: " + this.birthDate + "\n" +
				"	Last day of employment: " + this.endDate + "\n" +
				"}";
	}
}
