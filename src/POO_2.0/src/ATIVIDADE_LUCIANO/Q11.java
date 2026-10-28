package ATIVIDADE_LUCIANO;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Q11 {
    static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Sol", "Streams", "Pato", "Código", "Computador", "Ana");

        Map<Integer, List<String>> agrupadas = palavras.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.toList()
                ));

        System.out.println(agrupadas);
    }
}
