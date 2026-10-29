package exerciciosgpt;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeCadastroProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Produto> produtos = new ArrayList<>();

        for (int i = 0; i < 4; i++) {

            String nome = lerNomeValido(scanner);
            double preco = lerPrecoValido(scanner);

            Produto produto = new Produto(nome, preco);
            produtos.add(produto);

        }

        exibirProdutos(produtos);

        int indiceMaisCaro = indiceDoProdutoMaisCaro(produtos);
        int indiceMaisBarato = indiceDoProdutoMaisBarato(produtos);

        Produto maisCaro = produtos.get(indiceMaisCaro);
        Produto maisBarato = produtos.get(indiceMaisBarato);

        System.out.println("Nome do produto: " + maisCaro.getNome()
                + ", Preço do produto mais caro: " + maisCaro.getPreco());

        System.out.println("Nome do produto: " + maisBarato.getNome()
                + ", Preço do produto mais barato: " + maisBarato.getPreco());

        int quantidadeAcimaDe50 = contarPrecoAcimaDe50(produtos);
        System.out.println("Preço acima de 50: " + quantidadeAcimaDe50);

        double media = calcularMedia(produtos);
        System.out.println("Média de preços: " + media);

        scanner.close();
    }

    static double calcularMedia(ArrayList<Produto> produtos) {
        double soma = 0;

        for (Produto produto : produtos) {
            soma += produto.getPreco();
        }
        return soma / produtos.size();
    }

    static void exibirProdutos(ArrayList<Produto> produtos) {

        for (int i = 0; i < produtos.size(); i++) {
            Produto produtoAtual = produtos.get(i);
            System.out.println("nome: " + produtoAtual.getNome() + " , "
                    + "preco: " + produtoAtual.getPreco());
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
        while (true) {
            System.out.println("Digite o preço do produto:");

            if (!scanner.hasNextDouble()) {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.nextLine();
                continue;
            }

            double preco = scanner.nextDouble();
            scanner.nextLine();

            if (Double.isFinite(preco) && preco > 0) {
                return preco;
            }

            System.out.println("Digite um preço válido maior que zero.");
        }
    }

    static int contarPrecoAcimaDe50(ArrayList<Produto> produtos) {
        int quantidadeAcimaDe50 = 0;

        for (Produto produto : produtos) {
            if (produto.getPreco() > 50) {
                quantidadeAcimaDe50++;
            }
        }
        return quantidadeAcimaDe50;
    }

    static int indiceDoProdutoMaisCaro(ArrayList<Produto> produtos) {
        int indiceMaisCaro = 0;

        for (int i = 0; i < produtos.size(); i++) {
            Produto produtoAtual = produtos.get(i);
            if (produtoAtual.getPreco() > produtos.get(indiceMaisCaro).getPreco()){
                indiceMaisCaro = i;
            }
        }
        return indiceMaisCaro;
    }

    static int indiceDoProdutoMaisBarato(ArrayList<Produto> produtos) {
        int indiceMaisBarato = 0;

        for (int i = 0; i < produtos.size(); i++) {
            Produto produtoAtual = produtos.get(i);
            if (produtoAtual.getPreco() < produtos.get(indiceMaisBarato).getPreco()) {
                indiceMaisBarato = i;
            }
        }
        return indiceMaisBarato;
    }
}
