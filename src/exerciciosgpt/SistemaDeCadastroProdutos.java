package exerciciosgpt;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeCadastroProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nomeProduto = new ArrayList<>();

        ArrayList<Double> precoProduto = new ArrayList<>();

        for (int i = 0; i < 4; i++){

            String nome;
            boolean temNumero;

            do {
                System.out.println("Digite o nome do Produto:");
                nome = scanner.nextLine();
                temNumero = false;

                for (int j = 0; j < nome.length(); j++){
                    if (Character.isDigit(nome.charAt(j))){
                        temNumero = true;
                        break;
                    }
                }
                if (temNumero || nome.isBlank()){
                    System.out.println("O nome não pode estar vazio nem conter números");
                }
            } while (temNumero || nome.isBlank());

            double preco;

            do {
                System.out.println("Digite o preço do produto:");
                preco = scanner.nextDouble();

                if (preco <= 0){
                    System.out.println("Digite um preço maior que zero.");
                }
            } while (preco <= 0);

            scanner.nextLine();

            nomeProduto.add(nome);
            precoProduto.add(preco);
        }

        double somaPreco = 0;
        for (double preco : precoProduto){
                somaPreco += preco;
        }

        double calculaMedia = somaPreco / precoProduto.size();

        for (int p = 0; p < nomeProduto.size(); p++) {
            System.out.println("nome: " + nomeProduto.get(p) + " , " + " preço: "
                    + precoProduto.get(p));
        }
        System.out.println("Média de preços: " + calculaMedia);
        scanner.close();
    }
}
