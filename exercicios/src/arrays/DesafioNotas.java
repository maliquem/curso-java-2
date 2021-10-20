package arrays;

import java.util.Scanner;

public class DesafioNotas {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        System.out.print("Quantas notas você quer armazenar? ");
        num = scan.nextInt();

        double[] notas = new double[num];

        for (int i = 0; i < notas.length; i++){
            System.out.print("Digite a " + (i+1) + "ª Nota: ");
            notas[i] = scan.nextDouble();
        }

        double media = 0.0;

        for (double nota: notas) {
            media += nota;
        }

        System.out.print("A media das notas é: " + media / num);

        scan.close();

    }

}
