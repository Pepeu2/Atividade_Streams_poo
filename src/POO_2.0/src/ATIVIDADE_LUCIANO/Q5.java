package ATIVIDADE_LUCIANO;

import java.util.Arrays;
import java.util.List;

public class Q5 {
    static void main(String[] args) {
        List<String> nomes = Arrays.asList("Pedro", "Ana", "Jose", "Maria", "Antonia", "Augusto", "Carlos", "Francisco");

        List<String> resultado = nomes.stream()
                .filter(nome -> nome.startsWith("A"))
                .sorted()
                .toList();
        System.out.println(resultado);

    }

}
