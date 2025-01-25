package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

//		System.out.println("Quantos números você vai digitar? ");
//		int n = sc.nextInt();
//		while (n > 10) {
//			System.out.print("O número máximo é 10. Digite novamente: ");
//			n = sc.nextInt();
//		}
//		int[] vect = new int[n];
//
//		for (int i = 0; i < vect.length; i++) {
//			System.out.println("Digite um número: ");
//			vect[i] = sc.nextInt();
//		}
//		System.out.println("NÚMEROS NEGATIVOS:");
//		for (int i = 0; i < vect.length; i++) {
//			if (vect[i] < 0) {
//				System.out.printf("%d\n", vect[i]);
//			}
//		};
		
		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um número:");
			vect[i] = sc.nextDouble();
		}
		System.out.print("VALORES: ");
		for (int i = 0; i< vect.length; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		double sum = 0.0;
		for(int i=0; i<vect.length; i++) {
			sum += vect[i];
		}
		System.out.printf("\nSOMA = %.2f\n", sum);
		
		double avg = sum / vect.length;
		System.out.printf("MEDIA = %.2f\n", avg);
		sc.close();
	}

}