package ATIVIDADE_LUCIANO;

import java.util.Arrays;
import java.util.List;

public class Q9 {
    static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(
                3, 6, 1, 8, 10, -2);

        boolean todosPositivos = numeros.stream()
                .allMatch(numero -> numero > 0);

        System.out.println("Todos os números são positivos: " + todosPositivos);
    }
}
