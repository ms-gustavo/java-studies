package java_math_functions;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		//Raíz quadrada
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raíz quadrada de " + x + " = " + A);
		System.out.println("Raíz quadrada de " + y + " = " + B);
		System.out.println("Raíz quadrada de 25 = " + C);
		
		//Potência de X elevado a Y
		A = Math.pow(x, y);
		B = Math.pow(x,  2.0);
		C = Math.pow(5.0,  2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(y + " elevado ao quadrado" + " = " + B);
		System.out.println("5 elevado ao quadrado" + " = " + C);
		
		//Valor absoluto de Y
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		double b = 5.0;
		double a = 1.0;
		double c = 1.0;
		
		double delta = Math.pow(b,  2.0) - 4*a*c;
		double x1 = (-b + Math.sqrt(delta)) / (2.0 *a);
		double x2 = (-b - Math.sqrt(delta)) / (2.0* a);
		
		System.out.println("Resultado é " + x1 + " ou " + x2);
	}

}
