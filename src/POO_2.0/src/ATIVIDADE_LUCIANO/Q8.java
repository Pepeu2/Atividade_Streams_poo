package ATIVIDADE_LUCIANO;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q8 {
    static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Ana", 17),
                new Pessoa("Carlos", 25),
                new Pessoa("Maria", 18),
                new Pessoa("Pedro", 32),
                new Pessoa("Julia", 21)
        );

        List<String> nomes = pessoas.stream()
                .filter(pessoa -> pessoa.getIdade() > 18)
                .map(Pessoa::getNome)
                .collect(Collectors.toList());

        System.out.println(nomes);
    }

    static class Pessoa {
        private String nome;
        private int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }
    }

}
