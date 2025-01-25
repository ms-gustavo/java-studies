package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		
		double z = 10.35789;
		System.out.println(z);
		System.out.printf("%.3f\n",z);
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f\n",z);
		
		System.out.println("RESULTADO = " + z + " metros");
		System.out.printf("RESULTADO = %.2f metros\n", z);
		
		String name = "Gustavo";
		byte age = 29;
		double salary = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$%.2f reais", name, age, salary);

	}

}