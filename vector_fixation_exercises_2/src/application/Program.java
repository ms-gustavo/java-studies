package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serão digitadas: ");
		int n = sc.nextInt();
		Person[] vect = new Person[n];
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:\n", i+ 1 );
			System.out.println("Nome: ");
			String name = sc.nextLine();
			System.out.println("Idade: ");
			int age = sc.nextInt();
			System.out.println("Altura: ");
			double height = sc.nextDouble();
			vect[i] = new Person(name, age, height);
		}
		
		double sumHeight = 0.0;
		double lessThanSixteenYears = 0.0;
		for(int i = 0; i<vect.length;i++) {
			sumHeight += vect[i].getHeight();
			if(vect[i].getAge() < 16) {
				lessThanSixteenYears++;
			}
		}
		
		double avgAge = sumHeight / vect.length;
		double avgLessThanSixteen = (( lessThanSixteenYears / vect.length) * 100);
		
		System.out.printf("Altura média: %.2f\n", avgAge);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", avgLessThanSixteen);
		
		for(int i = 0; i<vect.length;i++) {
			if(vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		
		sc.close();
	}

}
