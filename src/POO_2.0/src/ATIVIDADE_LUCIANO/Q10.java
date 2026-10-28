package ATIVIDADE_LUCIANO;

import java.util.Arrays;
import java.util.List;

public class Q10 {
    static void main(String[] args) {
        List<Pedido> pedidos = Arrays.asList(
                new Pedido(1, 120.00),
                new Pedido(2, 75.50),
                new Pedido(3, 200.00)
        );

        double total = pedidos.stream()
                .mapToDouble(Pedido::getValor)
                .sum();

        System.out.printf("Valor total: R$ %.2f%n", total);
    }

    static class Pedido {
        private int id;
        private double valor;

        public Pedido(int id, double valor) {
            this.id = id;
            this.valor = valor;
        }

        public int getId() {
            return id;
        }

        public double getValor() {
            return valor;
        }
    }
    }

