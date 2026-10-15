package exerciciosgpt;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleDeEstoque {
    public static void main (String[] args) {
        ArrayList<Integer> listaQuantidade = new ArrayList<>();
        int quantidade;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            do{
                System.out.println("Digite a quantidade do produto: ");
                quantidade = scanner.nextInt();
            }while(quantidade < 0);
            listaQuantidade.add(quantidade);
        }

        int totalEstoque = 0;
        int maiorQuantidade = 0;
        int contaEstoque = 0;
        for (int quantidades : listaQuantidade){
            totalEstoque += quantidades;

            if(quantidades > maiorQuantidade){
                maiorQuantidade = quantidades;
            }

            if (quantidades < 10){
                contaEstoque++;
            }

        }
        System.out.println("Maior quantidade de estoque: " + maiorQuantidade);
        System.out.println("Total de itens em estoque: " + totalEstoque);
        System.out.println("Existem " + contaEstoque + " produtos com estoque abaixo de 10 unidades");
    }
}
