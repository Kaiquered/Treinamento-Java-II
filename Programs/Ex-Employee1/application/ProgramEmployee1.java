package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee1;

public class ProgramEmployee1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		Employee1 employee = new Employee1();

		System.out.printf("Name: ");
		employee.name = input.nextLine();
		
		System.out.printf("Gross Salary: ");
		employee.grossSalary = input.nextDouble();
		
		System.out.printf("Tax: ");
		employee.tax = input.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f\n",employee.name,employee.netSalary());

		System.out.printf("Which percentage to incinputase salary?");
		double percentage = input.nextDouble();
		
		System.out.printf("Updated data: %s, $ %.2f", employee.name,employee.increaseSalary(percentage));
					
		input.close();
	}

}
