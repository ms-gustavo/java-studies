package application;

import java.util.Locale;
import java.util.Scanner;

//import entities.Employee;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		Rectangle rectangle = new Rectangle();
//		
//		System.out.println("Enter rectangle width and height: ");
//		System.out.print("Width: ");
//		rectangle.width = sc.nextDouble();
//		System.out.println("Height: ");
//		rectangle.height = sc.nextDouble();
//		
//		System.out.println();
//		
//		System.out.println("AREA = " + rectangle.area());
//		System.out.println("PERIMETER = " + rectangle.perimeter());
//		System.out.println("DIAGONAL = " + rectangle.diagonal());
//		
//		System.out.println();
		
//		Employee employee = new Employee();
//		
//		System.out.print("Name: ");
//		employee.name = sc.nextLine();
//		
//		System.out.print("Gross Salary: ");
//        employee.grossSalary = sc.nextDouble();
//        
//		System.out.print("Tax: ");
//		employee.tax = sc.nextDouble();
//		employee.netSalary();
//		System.out.println();
//		
//		System.out.println("Employee: " + employee);
//		System.out.println();
//		
//		System.out.println("Which percentage to increase salary?");
//		double percentage = sc.nextDouble();
//		employee.increaseSalary(percentage);
//		System.out.println();
//		
//		System.out.println("Updated data: " + employee);
		
				
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.firstQuarter = sc.nextDouble();
		student.secondQuarter = sc.nextDouble();
		student.thirdQuarter = sc.nextDouble();
		System.out.println(student.checkApprovation());
				
		
		sc.close();

	}

}
