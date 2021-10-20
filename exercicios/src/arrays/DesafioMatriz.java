package arrays;

import java.util.Scanner;

public class DesafioMatriz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int linha = 0;
        int coluna = 0;

        System.out.println("Digite as dimensões da Matriz!");
        System.out.print("X: ");
        int x = scan.nextInt();
        System.out.print("Y: ");
        int y = scan.nextInt();

        int[][] matriz = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (matriz[i][j] >= 0 && matriz[i][j] <= 9) {
                    System.out.print("0" + matriz[i][j] + " ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }

            }
            System.out.println();
        }

        System.out.print("Escolha um numero da Matriz acima: ");
        int num = scan.nextInt();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (matriz[i][j] == num) {
                    coluna = i;
                    linha = j;
                }
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if ((coluna == i - 1 || coluna == i + 1) && linha == j) {
                    System.out.print(matriz[i][j] + " ");
                } else if ((linha == j - 1 || linha == j + 1) && coluna == i) {
                    System.out.print(matriz[i][j] + " ");
                } else if (matriz[i][j] == num) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        scan.close();

    }

}
