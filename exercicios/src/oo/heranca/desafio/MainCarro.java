package oo.heranca.desafio;

public class MainCarro {

    public static void main(String[] args) {
        Carro ferrari = new Ferrari(280);
        Carro fiat = new Fiat(160);

        fiat.acelerar();
        fiat.acelerar();
        fiat.acelerar();
        fiat.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();

        System.out.println(fiat.velocidade);
        System.out.println(ferrari.velocidade);
    }

}
