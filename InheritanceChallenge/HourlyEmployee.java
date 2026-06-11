package worker;

import java.time.LocalDate;
import java.text.DecimalFormat;

public class HourlyEmployee extends Employee {
	private double hourlyPayRate;
	
	DecimalFormat df = new DecimalFormat("#.00");
	
	public HourlyEmployee(String name, LocalDate birthDate, LocalDate hireDate, double hourlyPayRate) {
		super(name, birthDate, hireDate);
		this.hourlyPayRate = hourlyPayRate;
	}
	
	@Override
	public double collectPay() {
		int dailyWorkHours = 8;
		int workDaysPerWeek = 5;
		return hourlyPayRate * dailyWorkHours * workDaysPerWeek * 4;
	}
	
	public double getDoublePay() {
		return this.collectPay() * 2;
	}
	
	@Override
	public String toString() {
		return "HourlyEmployee{" + "\n"
				+ "	Name: " + this.name + "\n"
				+ " BirthDate: " + this.birthDate + "\n"
				+ "	HireDate: " + this.hireDate + "\n"
				+ "	HourlyPayRate: " + df.format(this.hourlyPayRate) + "$" + "\n"
				+ "	EndDate: " + this.endDate + "\n"
				+ "	Monthly pay: " + df.format(this.collectPay()) + "$" + "\n"
				+ " Double the pay: " + df.format(this.getDoublePay()) + "$" + "\n"
 				+ "}";
	}
}
