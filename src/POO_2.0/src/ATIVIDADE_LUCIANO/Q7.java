package ATIVIDADE_LUCIANO;

import java.util.Arrays;
import java.util.List;

public class Q7 {
    static void main(String[] args) {
        List<String> palavras = Arrays.asList(
                "Java", "Programacao", "Stream", "Sol",
                "Collections", "Codigo", "Computador"
        );

        long quantidade = palavras.stream()
                .filter(palavra -> palavra.length() > 5)
                .count();

        System.out.println("Palavras com mais de 5 letras: " + quantidade);
    }
}
