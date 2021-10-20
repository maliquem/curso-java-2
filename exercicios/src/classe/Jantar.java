package classe;

import java.util.Scanner;

public class Jantar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nomePessoa = scan.next();
        System.out.print("Digite o peso da pessoa: ");
        double pesoPessoa = scan.nextDouble();
        var p1 = new Pessoa(nomePessoa, pesoPessoa);

        System.out.print("Digite o nome da comida: ");
        String nomeComida = scan.next();
        System.out.print("Digite o peso da comida: ");
        double pesoComida = scan.nextDouble();
        var c1 = new Comida(nomeComida, pesoComida);

        Double pesoAdd = p1.jantar(c1.peso);

        System.out.printf("Peso atual do %s é %.3f depois de comer %s!", p1.nome, pesoAdd, c1.nome);

        scan.close();

    }
}
