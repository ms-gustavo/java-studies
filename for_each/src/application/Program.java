package application;

public class Program {

	public static void main(String[] args) {

		String[] vect = new String[] { "Maria", "Joao", "Jose" };

		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("_---------------");
		
		for(String obj : vect) {
			System.out.println(obj);
		}
	}
}
