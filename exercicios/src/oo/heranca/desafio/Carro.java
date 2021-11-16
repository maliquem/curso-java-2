package oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int aceleracao;
    int velocidade;

    Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() {
        if (velocidade + aceleracao > VELOCIDADE_MAXIMA) {
            velocidade = VELOCIDADE_MAXIMA;
        } else {
            velocidade += aceleracao;
        }
    }

    public void frear() {
        if (velocidade - aceleracao < 0) {
            velocidade = 0;
        } else {
            velocidade -= aceleracao;
        }
    }

}
