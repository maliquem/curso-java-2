package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DesafioStreams {

    public static void main(String[] args) {

        Consumer<Object> println = System.out::println;

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        nums.stream().map(Utilitarios.toBinary).forEach(println);

        nums.stream().map(Utilitarios.toBinary).map(Utilitarios.inverterString).forEach(println);

        nums.stream().map(Utilitarios.toBinary).map(Utilitarios.inverterString).map(Utilitarios.toInteger)
                .forEach(println);

    }

}
