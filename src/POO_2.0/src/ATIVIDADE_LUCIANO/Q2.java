package ATIVIDADE_LUCIANO;

import java.util.Arrays;
import java.util.List;

public class Q2 {
    static void main(String[] args) {
        List<String> nomes = Arrays.asList("Lucas", "Maria", "Pedro");

        List<String> resultado = nomes.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(resultado);
    }


}
