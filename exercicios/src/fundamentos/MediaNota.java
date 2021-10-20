package fundamentos;

import java.util.Scanner;

public class MediaNota {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota = 0;
        double notasValidas = 0;
        double media = 0;

        while (nota != -1) {
            System.out.print("Digite o valor de uma nota: ");
            nota = scan.nextDouble();
            if (nota >= 0 && nota <= 10) {
                media += nota;
                notasValidas++;
            } else if (nota == -1) System.out.print("A media das notas é " + media / notasValidas);
            else System.out.println("Nota Invalida! (Digite uma nota de 0 a 10)");
        }

        scan.close();
    }
}
