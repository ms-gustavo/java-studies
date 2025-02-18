package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import services.ProductService;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		ProductService ps = new ProductService();
		char c = 'T';
		Predicate<Product> criteria = p -> p.getName().charAt(0) == c;
		
		
		double sum = ps.filteredSum(list, criteria);
		
		System.out.println("Sum = " +String.format("%.2f", sum));
	}

}
