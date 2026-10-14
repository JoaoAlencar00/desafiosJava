package controleDeGastos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> receitas = new ArrayList<>();
        double valorReceita;

        ArrayList<Double> despesas = new ArrayList<>();
        double valorDespesa;

        ArrayList<String> categoriasDespesas = new ArrayList<>();
        String categorias;

        int opcao;
        do {
            System.out.println("1 - Registrar Receita");
            System.out.println("2 - Registrar Despesa");
            System.out.println("3 - Ver resumo do mês");
            System.out.println("4 - Sair");

            System.out.println("Digite uma opcao: ");
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
            } else {
                scanner.next();
                opcao = -1;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor da receita: ");

                    if (scanner.hasNextDouble()) {
                        valorReceita = scanner.nextDouble();

                        if (valorReceita > 0) {
                            receitas.add(valorReceita);
                            System.out.println("Receita registrada.");
                        } else {
                            System.out.println("O valor precisa ser maior que zero.");
                        }
                    } else {
                        scanner.next(); // descarta o texto que não é um número
                        System.out.println("Digite um número valido.");
                    }
                    break;
                case 2:
                    System.out.println("Digite o valor da despesa: ");

                    if (scanner.hasNextDouble()) {
                        valorDespesa = scanner.nextDouble();

                        if (valorDespesa > 0) {
                            System.out.println("Digite a categoria ?");
                            categorias = scanner.next();
                            despesas.add(valorDespesa);
                            categoriasDespesas.add(categorias);
                        } else {
                            System.out.println("O valor precisa ser maior que 0");
                        }
                    } else {
                        scanner.next();
                        System.out.println("Digite um numero valido");
                    }
                    break;
                case 3:
                    ArrayList<String> categoriasExibidas = new ArrayList<>();

                    for (String categoria : categoriasDespesas) {
                        if (!categoriasExibidas.contains(categoria)) {
                            double totalCategorias = 0;

                            for (int i = 0; i < despesas.size(); i++) {
                                if (categoria.equals(categoriasDespesas.get(i))) {
                                    totalCategorias += despesas.get(i);
                                }
                            }

                            System.out.printf("Categoria: %s | Total: R$ %.2f%n", categoria, totalCategorias);
                            categoriasExibidas.add(categoria);
                        }
                    }

                    double totalReceitas = 0;
                    double totalDespesas = 0;

                    for (double valor : receitas) {
                        totalReceitas += valor;
                    }
                    System.out.printf("Receitas: R$ %.2f%n", totalReceitas);

                    for (double valor : despesas) {
                        totalDespesas += valor;
                    }
                    System.out.printf("Despesas: R$ %.2f%n", totalDespesas);

                    if (totalDespesas > totalReceitas) {
                        System.out.println("Você ultrapassou o valor da receita! Valor: " + (totalDespesas - totalReceitas));
                    } else {
                        System.out.println("As despesas não ultrapassaram as receitas.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
    }
}
