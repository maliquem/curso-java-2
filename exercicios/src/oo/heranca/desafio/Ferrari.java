package oo.heranca.desafio;

public class Ferrari extends Carro {

    public void acelerar() {
        if (velocidade <= 260) {
            velocidade += 15;
        }
    }

    public void frear() {
        if (velocidade >= 0) {
            velocidade -= 15;
        }
    }
}
