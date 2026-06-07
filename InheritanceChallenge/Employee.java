package worker;

import java.time.LocalDate;

public class Employee extends Worker {
	private static int employeeID = 0;
	private LocalDate hireDate;
	
	public Employee() {}
	
	public Employee(String name, LocalDate birthDate, LocalDate hireDate) {
		super(name, birthDate);
		this.hireDate = hireDate;
		employeeID += 1;
	}
	
	@Override
	public String toString() {
		return	"Employee{" + "\n" +
				"	EmployeeID: " + employeeID + "\n" +
				"	Date hired: " + this.hireDate + "\n" +
				"}";
	}

}
