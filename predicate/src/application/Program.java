package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

//		Predicate<Product> pred = p -> p.getPrice() >= 100;
//		list.removeIf(pred);
//		list.removeIf(new ProductPredicate());
//		list.removeIf(Product::staticProductPredicate);
//		list.removeIf(Product::nonStaticProductPredicate);
		list.removeIf(p -> p.getPrice() >= 100);
		for (Product p : list) {
            System.out.println(p);
		}
	}

}
