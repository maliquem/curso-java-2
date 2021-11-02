package oo.desafio;

import java.util.Scanner;

public class TesteCode {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = scan.next();

        System.out.printf("O nome da pessoa e %s", nome);

        scan.close();
    }

}