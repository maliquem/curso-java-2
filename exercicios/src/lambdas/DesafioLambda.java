package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioLambda {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 3780.80, 0.16);

        Function<Produto, Double> precoReal = p -> {
            return p.preco * (1 - p.desconto);
        };
        UnaryOperator<Double> precoMuniciapal = n -> {
            return n >= 2500 ? (n * (1.085)) : n;
        };
        UnaryOperator<Double> frete = n1 -> {
            return n1 >= 3000.0 ? n1 + 100.0 : n1 + 50.0;
        };

        var precoFinal = precoReal.andThen(precoMuniciapal).andThen(frete).apply(p1);

        System.out.printf("O %s custa %.2f no preço final \n", p1.nome, precoFinal);

    }

}
