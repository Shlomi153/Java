package worker;

import java.time.LocalDate;
import java.text.DecimalFormat;

public class main {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");
		
		
		Worker worker1 = new Worker("Bobby B", LocalDate.of(1980, 3, 23));
		int work1Age = worker1.getAge();
		System.out.println(work1Age);
		
		String work1Str = worker1.toString();
		System.out.println(work1Str);
		
		Employee employee1 = new Employee("Bridgette C", LocalDate.of(1985, 01, 17), LocalDate.of(2024, 1, 1));
		System.out.println(employee1.toString());
		
		SalariedEmployee jameson = new SalariedEmployee("Jameson JJ", LocalDate.of(1970, 05, 12),
				LocalDate.of(1965, 11, 05), 70000);
		
		String jamesonStr = jameson.toString();
		System.out.println(jamesonStr);
		
		double jamMonthlySalary = jameson.collectPay();
		
		System.out.println("Jameson collects: " + df.format(jamMonthlySalary) + "$ each month.");
		
		HourlyEmployee jake = new HourlyEmployee("Jake Wesker", LocalDate.of(1975, 1, 1), LocalDate.of(1999, 7, 1), 24.0);
		double jPay = jake.collectPay();
		double jDoublePay = jake.getDoublePay();
		
		System.out.println(jPay);
		System.out.println(jDoublePay);
		System.out.println(jake);
	}
}
