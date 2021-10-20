package classe;

public class Pessoa {

    String nome;
    double peso;

    Pessoa (String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    double jantar(double comida){
        return this.peso += comida;
    }
}
