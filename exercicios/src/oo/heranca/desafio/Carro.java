package oo.heranca.desafio;

public class Carro {

    int velocidade;

    public void acelerar() {
        if (velocidade <= 160) {
            velocidade += 5;
        }
    }

    public void frear() {
        if (velocidade >= 0) {
            velocidade -= 5;
        }
    }

}
