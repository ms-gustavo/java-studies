package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;



public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List<Employee> employeeList = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			System.out.println();
			System.out.println("Employee #"+i+1+": ");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			while(employeeExists(employeeList, id)) {
				System.out.println("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			employeeList.add(new Employee(id, name, salary));
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int employeeId = sc.nextInt();
		Employee employee = employeeList.stream().filter(x -> x.getId() == employeeId).findFirst().orElse(null);
		Double percentage;
		if(employee == null) {
			System.out.println("This employee ID doesn't exists");
		} else {
			System.out.println("Enter the percentage");
			percentage = sc.nextDouble();
			employee.increaseSalary(percentage);
			
		}
		
		System.out.println();
		System.out.println("List of employees:");
		
		for (Employee obj : employeeList) {
			System.out.println(obj);
		}
				
		sc.close(); 
		
		
		sc.close();
	}
	
	static boolean employeeExists(List<Employee> list, Integer id){
		Employee employeeExists = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return employeeExists != null;
	}

}
