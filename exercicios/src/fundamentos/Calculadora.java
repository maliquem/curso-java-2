package fundamentos;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        System.out.print("Digite o primeiro n?mero: ");
        Double num1 = numero.nextDouble();

        System.out.print("Digite o segundo n?mero: ");
        Double num2 = numero.nextDouble();

        System.out.print("Digite o simbolo da opera??o (+ - / * %): ");
        String opera = numero.next();

        double res = 0.0;

        res = opera.equals("-") ? num1 - num2 : res;
        res = opera.equals("+") ? num1 + num2 : res;
        res = opera.equals("*") ? num1 * num2 : res;
        res = opera.equals("/") ? num1 / num2 : res;
        res = opera.equals("%") ? num1 % num2 : res;

        System.out.printf("%.2f %s %.2f = %.2f", num1, opera, num2, res);

        numero.close();
    }

}
