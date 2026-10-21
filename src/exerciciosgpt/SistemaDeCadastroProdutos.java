package exerciciosgpt;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeCadastroProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nomeProduto = new ArrayList<>();

        ArrayList<Double> precoProduto = new ArrayList<>();

        for (int i = 0; i < 4; i++) {

            String nome = lerNomeValido(scanner);
            double preco = lerPrecoValido(scanner);

            nomeProduto.add(nome);
            precoProduto.add(preco);
        }

        int quantidadeAcimeDe50 = 0;
        int indiceMaisCaro = 0;
        int indiceMaisBarato = 0;

        for (int i = 0; i < precoProduto.size(); i++) {
            double preco = precoProduto.get(i);

            if (preco > precoProduto.get(indiceMaisCaro)) {
                indiceMaisCaro = i;
            }
            if (preco < precoProduto.get(indiceMaisBarato)) {
                indiceMaisBarato = i;
            }
            if (preco > 50){
                quantidadeAcimeDe50++;
            }
        }

        System.out.println("Nome do produto: " + nomeProduto.get(indiceMaisCaro) + " , "
                + " Preço do produto mais caro: " + precoProduto.get(indiceMaisCaro));

        System.out.println("Nome do produto: " + nomeProduto.get(indiceMaisBarato) + " , "
                + " Preço do produto mais barato: " + precoProduto.get(indiceMaisBarato));

        System.out.println("Preço acima de 50: " + quantidadeAcimeDe50);

        double media = calcularMedia(precoProduto);
        System.out.println("Média de preços: " + media);

        exibirProdutos(nomeProduto, precoProduto);
        scanner.close();
    }

    static double calcularMedia(ArrayList<Double> precos) {
        double soma = 0;

        for (double preco : precos) { //pega cada preço da lista
            soma += preco;  //adiciona soma
        }
        return soma / precos.size(); //devolve a média
    }

    static void exibirProdutos(ArrayList<String> nomes, ArrayList<Double> precos) {
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("nome: " + nomes.get(i) + " , "
                    + "preco: " + precos.get(i));
        }
    }

    static String lerNomeValido(Scanner scanner) {
        String nome;
        boolean temNumero;

        do {
            System.out.println("Digite o nome do Produto:");
            nome = scanner.nextLine();
            temNumero = false;

            for (int j = 0; j < nome.length(); j++) {
                if (Character.isDigit(nome.charAt(j))) {
                    temNumero = true;
                    break;
                }
            }
            if (temNumero || nome.isBlank()) {
                System.out.println("O nome não pode estar vazio nem conter números");
            }
        } while (temNumero || nome.isBlank());

        return nome;
    }

    static double lerPrecoValido(Scanner scanner) {
        double preco;

        do {
            System.out.println("Digite o preço do produto:");
            preco = scanner.nextDouble();

            if (preco <= 0) {
                System.out.println("Digite um preço maior que zero.");
            }
        } while (preco <= 0);

        scanner.nextLine();

        return preco;
    }

}