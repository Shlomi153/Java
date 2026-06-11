package worker;

import java.time.LocalDate;

public class main {
	public static void main(String[] args) {
		Worker joe = new Worker("Joe Black", LocalDate.of(1980, 2, 25));
		
		System.out.println("Joe's age: " + joe.getAge() + "\n");
		System.out.println("Joe Black: \n" + joe.toString());
		
		Employee jane = new Employee("Jane Doe", LocalDate.of(1975, 1, 18), LocalDate.of(2019, 7, 9));
		
		System.out.println("Jane Doe: \n" + jane.toString() + "\n");
		
		SalariedEmployee misha = new SalariedEmployee("Misha Medved", LocalDate.of(1967, 4, 13), 
				LocalDate.of(2016, 2, 14), 70250);
		System.out.println("Misha Medved: before retirement \n" + misha.toString() + "\n");
		
		misha.retire(LocalDate.now());
		
		System.out.println("Misha Medved: after retirement \n" + misha.toString() + "\n");
		
		HourlyEmployee gary = new HourlyEmployee("Gary Gar", LocalDate.of(1964, 4, 1), LocalDate.of(2020, 6, 6)
				, 55);
		System.out.println("Gary Gar: \n" + gary.toString());
	}
}
