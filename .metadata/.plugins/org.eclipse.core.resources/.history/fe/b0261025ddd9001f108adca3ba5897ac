package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the data of the product: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();

		Product product = new Product(name, price);

		product.setName("Computer");
		product.setPrice(1200.00);
		System.out.println("Updated name: " 
		+ product.getName() 
		+ "\nUpdated price: " 
		+ product.getPrice());

		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.println("Enter the number of product to be added to the stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		System.out.println();
		System.out.println("Enter the number of product to be removed from the stock: ");
		int quantityToRemove = sc.nextInt();
		product.removeProducts(quantityToRemove);

		System.out.println();
		System.out.println("Updated data: " + product);

		sc.close();
	}
}
