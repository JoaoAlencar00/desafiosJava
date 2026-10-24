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

        System.out.println("Nome do produto: " + produtos.get(indiceMaisCaro) + " , "
                + " Preço do produto mais caro: " + produtos.get(indiceMaisCaro));

        System.out.println("Nome do produto: " + produtos.get(indiceMaisBarato) + " , "
                + " Preço do produto mais barato: " + produtos.get(indiceMaisBarato));

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
