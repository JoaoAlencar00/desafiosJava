package exerciciosgpt;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int maior = scanner.nextInt(); // O primeiro número é o maior por enquanto

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite um numero: ");
            int numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero; // Atualiza o maior quando encontra um número maior
            }
        }

        System.out.println("Maior número: " + maior);
        scanner.close();
    }
}