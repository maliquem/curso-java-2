package oo.heranca.desafio;

public class Fiat extends Carro {

    public Fiat(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    public void acelerar() {
        if (velocidade <= 180) {
            velocidade += 7;
        }
    }

    public void frear() {
        if (velocidade >= 0) {
            velocidade -= 7;
        }
    }

}
