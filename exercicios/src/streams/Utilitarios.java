package streams;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Utilitarios {

    public final static Consumer<Object> println = System.out::println;
    public final static Function<Integer, String> toBinary = n -> Integer.toBinaryString(n);
    public final static Function<String, Integer> toInteger = n -> Integer.parseInt(n, 2);
    public final static UnaryOperator<String> inverterString = s -> new StringBuilder(s).reverse().toString();
    public final static Predicate<Aluno> feminino = aluno -> aluno.sexo == 'F';
    public final static Predicate<Aluno> masculino = aluno -> aluno.sexo == 'M';
    public final static Predicate<Aluno> maiorDeIdade = aluno -> aluno.idade >= 18;
    public final static Predicate<Aluno> passouDeAno = aluno -> aluno.nota >= 7;
    public final static Function<Aluno, String> imprimirAluno = aluno -> "Aluno(a) " + aluno.nome + " de " + aluno.idade
            + " anos, foi aprovado(a)";

}
