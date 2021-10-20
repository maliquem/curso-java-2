package fundamentos;

import java.util.Scanner;

public class SalarioMedia {
	
	public static void main(String[] args) {
				
		Scanner sal = new Scanner(System.in);
		
		System.out.print("Informe o primeio salario do empregado: ");
		String salario1 = sal.next().replace(",", ".");
		
		System.out.print("Informe o segundo salario do empregado: ");
		String salario2 = sal.next().replace(",", ".");
		
		System.out.print("Informe o terceiro salario do empregado: ");
		String salario3 = sal.next().replace(",", ".");
		
		Double media = (Double.parseDouble(salario1) + Double.parseDouble(salario2) + Double.parseDouble(salario3)) / 3;
		
		System.out.print("A media dos 3 ultimos salarios é  " + media);
		
		sal.close();
		
	}

}
