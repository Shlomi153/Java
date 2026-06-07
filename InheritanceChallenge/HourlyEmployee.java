package worker;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
	private double hourlyPayRate;
	
	public HourlyEmployee() {}
	
	public HourlyEmployee(String name, LocalDate birthDate, LocalDate hireDate, double hourlyPayRate) {
		super(name, birthDate, hireDate);
		this.hourlyPayRate = hourlyPayRate;
	}
	
	@Override
	//Monthly pay, 160 hours
	public double collectPay() {
		return this.hourlyPayRate * 8 * 5 * 4;
	}
	
	public double getDoublePay() {
		return collectPay() * 2;
	}
	
	@Override
	public String toString() {
		return "HourlyEmployee{" + "\n" +
				"	HourlyPayRate: " + this.hourlyPayRate + "\n" +
				"}";
	}
}
