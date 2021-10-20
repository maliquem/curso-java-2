package fundamentos;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		Double soma1 = Math.pow((6 * (3 + 2)), 2) / (3 * 2);
		Double soma2 = Math.pow((((1 - 5) * (2 - 7)) / 2), 2);
		Double sub = Math.pow((soma1 - soma2), 3);
		Double div = Math.pow(10, 3);
		Double res = sub / div;
		
		System.out.println("Resultado da Soma 1: " + soma1);
		System.out.println("Resultado da Soma 2: " + soma2);
		System.out.println("Resultado da Divisão: " + div);
		System.out.println("Resultado final: " + res);
		
		
		
		
	}
	
}
