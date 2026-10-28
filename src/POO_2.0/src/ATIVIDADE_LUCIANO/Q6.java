package ATIVIDADE_LUCIANO;

import java.util.Arrays;
import java.util.List;

public class Q6 {
    static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(
                10, 45, 7, 82, 30, 15, 99, 24
        );

        int maior = numeros.stream()
                .max(Integer::compareTo)
                .orElseThrow();

        System.out.println("Maior número: " + maior);
    }
}
