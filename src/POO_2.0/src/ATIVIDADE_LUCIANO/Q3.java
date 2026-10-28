package ATIVIDADE_LUCIANO;

import java.util.Arrays;
import java.util.List;

public class Q3 {
    static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(2, 4, 6, 8, 10);

        numeros.stream()
                .map (n -> n * 2)
                .forEach(System.out::println);
    }
}
