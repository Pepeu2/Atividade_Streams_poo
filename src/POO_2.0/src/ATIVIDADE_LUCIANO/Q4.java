package ATIVIDADE_LUCIANO;

import java.util.Arrays;
import java.util.List;

public class Q4 {
    static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(4, 25, 32, 5, 45, 13, 8, 77, 58, 2, 52);

        long quantidade = numeros.stream()
                .filter(n -> n > 10)
                .count();
        System.out.println(quantidade);


        }
    }

