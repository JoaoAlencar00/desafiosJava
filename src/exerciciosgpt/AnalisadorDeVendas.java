package exerciciosgpt;

import java.util.ArrayList;
import java.util.Scanner;

public class AnalisadorDeVendas {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int quantidade;

        do{
            System.out.println("Qual a quantidade de vendas?");
            quantidade = scanner.nextInt();

            if (quantidade <= 0){
                System.out.println("Informe uma quantidade maior que zero.");
            }
        } while (quantidade <= 0);

        ArrayList<Double> listaVendas = new ArrayList<>();

        for (int i = 0; i < quantidade; i++){
            double valor;

            do {
                    System.out.println("Digite o valor da venda: ");
                    valor = scanner.nextDouble();

                    if (valor < 0){
                        System.out.println("O valor não pode ser negativo.");
                    }
            }while (valor < 0);
            listaVendas.add(valor);
        }

        double totalVendas = 0;
        double maiorVenda = listaVendas.getFirst();
        int contaVendas = 0;

        for (double venda : listaVendas){
            totalVendas += venda;

            if (venda > maiorVenda) {
                maiorVenda = venda;
            }

            if (venda > 100){
                contaVendas++;
            }
        }
        double mediaDeVendas = totalVendas / listaVendas.size();

        System.out.println("Total de vendas: R$" + totalVendas);
        System.out.println("Média: R$ " + mediaDeVendas);
        System.out.println("Maior venda: R$ " + maiorVenda);
        System.out.println("Existem " + contaVendas + " venda acima de R$ 100");


        scanner.close();
    }
}
