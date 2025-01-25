package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Gustavo");
		list.add("Felipe");
		list.add("Dirlan");
		list.add("Beatriz");
		list.add(2, "Roque");
		System.out.println(list.size());
		String firstName = list.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);
		System.out.println(firstName);
		System.out.println("------------------");
		for (String name : list) {
			System.out.println(name);
		}
		System.out.println("--------------");
		list.remove(1);
		list.remove("Dirlan");
		System.out.println(list.size());
		System.out.println("--------------");
		list.removeIf(name -> name.charAt(0) == 'R');
		for (String name : list) {
			System.out.println(name);
		}
		System.out.println("--------------");
		System.out.println("Index of Gustavo: " + list.indexOf("Gustavo"));
		System.out.println("Index of Roque: " + list.indexOf("Roque"));
		System.out.println("---------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());
		for (String name : result) {
			System.out.println(name);
		}
		System.out.println("------------------");
		String firstNameAgain = list.stream().filter(x -> x.charAt(0) == 'R').findFirst().orElse(null);
		System.out.println(firstNameAgain);

	}

}
