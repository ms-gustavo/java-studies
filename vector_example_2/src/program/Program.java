package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de produtos:");
		int productQuantity = sc.nextInt();
		Product[] vect = new Product [productQuantity];
		for (int i = 0; i < productQuantity; i++) {
			System.out.println("Digite o nome do produto: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.println("Digite o valor do produto: ");
			double productPrice = sc.nextDouble();
			vect[i] = new Product(productName, productPrice);
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
		sum += vect[i].getPrice();
		}
		
		double avg = sum / productQuantity;
		
		System.out.printf("AVERAGE PRICE = %.2f\n", avg);
		sc.close();
		
	}

}
