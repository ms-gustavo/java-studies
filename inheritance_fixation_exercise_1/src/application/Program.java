package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		Integer employeesNumber = sc.nextInt();
		List<Employee> employeeList = new ArrayList<>();
		for(int i = 1; i <= employeesNumber; i++) {
			System.out.println("Employee #" + i + " data:" );
			System.out.print("Outsourced (y/n)?");
			char outsourced = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String employeeName = sc.nextLine();
			System.out.print("Hours: ");
			Integer employeeHours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double employeeValuePerHour = sc.nextDouble();
			if(outsourced == 'y') {
				System.out.print("Additional charge: ");
				Double employeeAdditionalCharge = sc.nextDouble();
				employeeList.add(new OutsourcedEmployee(employeeName, employeeHours, employeeValuePerHour, employeeAdditionalCharge));
				
			} else {
				employeeList.add(new Employee(employeeName, employeeHours, employeeValuePerHour));
			}
		}
		System.out.println();
		System.out.println("PAYMENTS: ");
		for(Employee e : employeeList) {
			System.out.println(e.getName() + " - " + "$ " + e.payment());
		}
		
		sc.close();

	}

}
