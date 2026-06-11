package worker;

import java.time.LocalDate;

public class Employee extends Worker {
	protected static int employeeID = 0;
	protected LocalDate hireDate;
	
	public Employee(String name, LocalDate birthDate, LocalDate hireDate) {
		super(name, birthDate);
		this.hireDate = hireDate;
		employeeID += 1;
	}
	
	@Override
	public String toString() {
		return "Employee{" + "\n"
				+ "	EmployeeID: " + employeeID + "\n"
				+ "	Name: " + this.name + "\n"
				+ "	BirthDate: " + this.birthDate + "\n"
				+ "	HireDate: " + this.hireDate + "\n"
				+ "}";
	}
}
