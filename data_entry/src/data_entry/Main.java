package data_entry;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
//		String x;
//		
//		x = sc.next();
//		System.out.println("A palavra digitada foi: " + x);
//		
//		int y;
//		y = sc.nextInt();
//		System.out.println("Você digitou o valor: " + y);
//		
//		double z;
//		z = sc.nextDouble();
//		System.out.printf("O valor digitador é: %.2f%n", z);
//		
//		char w;
//		w = sc.next().charAt(0);
//		System.out.println("O primeiro caractere digitado é: " + w);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados Digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();

	}

}