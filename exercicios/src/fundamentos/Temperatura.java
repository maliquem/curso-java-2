package fundamentos;

import java.util.Scanner;

public class Temperatura {
	
	public static void main(String[] args) {
		final int SUB = 32;
		final double DIV = 5/9.0;
		double fahrenheit;
		double celsius;
		
		System.out.print("Informe a temperatura em FAHRENHEIT a ser convertida para CELSIUS: ");
		
		Scanner scan = new Scanner( System.in );
		fahrenheit = scan.nextDouble();
		
		celsius = (fahrenheit - SUB) * DIV;
		System.out.print("A temperatura em CELSIUS é " + Math.round(celsius));
		scan.close();
	}

}
