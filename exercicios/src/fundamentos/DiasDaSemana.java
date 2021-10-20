package fundamentos;

import java.util.Scanner;

public class DiasDaSemana {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome de um dos dias da semana: ");
        String nome = scanner.nextLine();

        if (nome.equalsIgnoreCase("Domingo"))
            System.out.printf("%s é o primeiro dia da semana", nome);
        else if (nome.equalsIgnoreCase("Segunda"))
            System.out.printf("%s é o segundo dia da semana", nome);
        else if (nome.equalsIgnoreCase("Terça"))
            System.out.printf("%s é o terceiro dia da semana", nome);
        else if (nome.equalsIgnoreCase("Quarta"))
            System.out.printf("%s é o quarto dia da semana", nome);
        else if (nome.equalsIgnoreCase("Quinta"))
            System.out.printf("%s é o quinto dia da semana", nome);
        else if (nome.equalsIgnoreCase("Sexta"))
            System.out.printf("%s é o sexto dia da semana", nome);
        else if (nome.equalsIgnoreCase("Sabado"))
            System.out.printf("%s é o setimo dia da semana", nome);
        else
            System.out.println("Nenhum dia valido foi detectado");

        scanner.close();

    }

}
