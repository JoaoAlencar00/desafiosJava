package exerciciosgpt;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleFinanceiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade;
        do {
            System.out.println("Quantos gastos você deseja registrar ?");
            quantidade = scanner.nextInt();
        } while (quantidade < 0);

        ArrayList<Double> listaDeGastos = new ArrayList<>();
        double totalGasto = 0;
        double valorGasto;

        for (int i = 0; i < quantidade; i++) {
            do {
                System.out.println("Qual o valor do gasto ?");
                valorGasto = scanner.nextDouble();
            }
            while (valorGasto < 0);
            listaDeGastos.add(valorGasto);
            totalGasto += valorGasto;
        }
        System.out.println("total gasto: " + totalGasto);

        int contador = 0;
        if (quantidade > 0) {
            double maiorGasto = 0;
            for (double gasto : listaDeGastos) {
                if (gasto > maiorGasto) {
                    maiorGasto = gasto;
                }
                if (gasto > 100) {
                    contador++;
                }
            }
            System.out.println("Maior gasto: " + maiorGasto);
        } else {
            System.out.println("Não há gastos para identificar o maior.");
        }
        System.out.println("Gastos superiores a R$100,00: " + contador + " gastos");

        if (quantidade > 0) {
            double gastoMedio = totalGasto / quantidade;
            System.out.println("Gasto medio: " + gastoMedio);
        } else {
            System.out.println("Não há gastos para calcular a média!");
        }
        scanner.close();
    }
}
