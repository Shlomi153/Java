package worker;

import java.time.LocalDate;
import java.text.DecimalFormat;

public class SalariedEmployee extends Employee {
	private double annualSalary;
	private boolean isRetired = false;
	
	DecimalFormat df = new DecimalFormat("#.00");
	
	public SalariedEmployee(String name, LocalDate birthDate, LocalDate hireDate, double annualSalary) {
		super(name, birthDate, hireDate);
		this.annualSalary = annualSalary;
	}
	
	public void retire(LocalDate endDate) {
		terminate(endDate);
		this.isRetired = true;
	}
	
	@Override
	public double collectPay() {
		return this.annualSalary / 12;
	}
	
	@Override
	public String toString() {
		return "SalariedEmployee{" + "\n"
				+ "	Name: " + this.name + "\n"
				+ "	BirthDate: " + this.birthDate + "\n"
				+ "	HireDate: " + this.hireDate + "\n"
				+ "	EndDate: " + this.endDate + "\n"
				+ "	AnnualSalary: " + df.format(this.annualSalary) + "$" + "\n"
				+ "	MonthlySalary: " + df.format(this.collectPay()) + "$" + "\n"
				+ "	IsRetired: " + this.isRetired + "\n"
				+ "}";
	}
}
