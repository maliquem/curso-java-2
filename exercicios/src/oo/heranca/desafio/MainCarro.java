package oo.heranca.desafio;

public class MainCarro {

    public static void main(String[] args) {
        Carro ferrari = new Ferrari();
        Carro fiat = new Fiat();

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
