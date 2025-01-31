package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of products: ");
		Integer productsQuantity = sc.nextInt();
		List<Product> productList = new ArrayList<>();
		for (int i = 1; i <= productsQuantity; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char productType = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String productName = sc.nextLine();
			System.out.print("Price: ");
			Double productPrice = sc.nextDouble();
			switch(productType) {
			case 'c':
				productList.add(new Product(productName, productPrice));
				break;
			case 'u':
				SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd/MM/yyyy");
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = inputDateFormat.parse(sc.next());
				productList.add(new UsedProduct(productName, productPrice, manufactureDate));
				break;
			case 'i':
				System.out.print("Custom fee: ");
				Double customFee = sc.nextDouble();
				productList.add(new ImportedProduct(productName, productPrice, customFee));
				break;
			}
			
			}
		System.out.println();
		System.out.println("PRICE TAGS");
		for(Product p : productList) {
			System.out.println(p.priceTag());
				
		}

		sc.close();

	}

}
