package worker;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
	private double annualSalary;
	private boolean isRetired = false;
	
	public SalariedEmployee() {}
	
	public SalariedEmployee(String name, LocalDate birthDate, LocalDate hireDate, double annualSalary) {
		super(name, birthDate, hireDate);
		this.annualSalary = annualSalary;
	}
	
	public void retire(LocalDate endDate) {
		isRetired = true;
		terminate(endDate);
	}
	
	@Override
	public double collectPay() {
		return this.annualSalary / 12;
	}
	
	@Override
	public String toString() {
		return "SalariedEmployee{" + "\n" +
				"	Annual salary: " + this.annualSalary + "\n" +
				"	Is retired: " + this.isRetired + "\n" +
				"}";
	}
}
