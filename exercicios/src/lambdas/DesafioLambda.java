package lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioLambda {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));

        Produto p1 = new Produto("Notebook", 3780.80, 0.16);

        Function<Produto, Double> precoReal = produto -> {
            return produto.preco * (1 - produto.desconto);
        };
        UnaryOperator<Double> precoMuniciapal = preco -> {
            return preco >= 2500 ? (preco * (1.085)) : preco;
        };
        UnaryOperator<Double> frete = preco -> {
            return preco >= 3000.0 ? preco + 100.0 : preco + 50.0;
        };
        UnaryOperator<Double> arredondar = preco -> {
            return Double.parseDouble(String.format("%.2f", preco));
        };
        Function<Double, String> formatar = preco -> {
            return ("R$" + preco).replace(".", ",");
        };

        var precoFinal = precoReal.andThen(precoMuniciapal).andThen(frete).andThen(arredondar).andThen(formatar)
                .apply(p1);

        System.out.printf("O %s custa %s no preço final \n", p1.nome, precoFinal);

    }

}
