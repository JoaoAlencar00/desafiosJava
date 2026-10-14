package exerciciosgpt;

import java.util.ArrayList;
import java.util.Scanner;

public class AnalisadorDeNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> analisadorNumeros = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int contarPares = 0;
        int contarImpares = 0;
        for (int i = 0; i < 10; i++){
            int analisador;
            System.out.println("Digite um numero inteiro: ");
            analisador = scanner.nextInt();
            analisadorNumeros.add(analisador);

            if (analisador % 2 == 0){
                contarPares++;
            } else {
                contarImpares++;
            }
        }
        System.out.println("Pares: " + contarPares);
        System.out.println("Impares: " + contarImpares);

        int maiorNumero = analisadorNumeros.getFirst();
        for (int analisador : analisadorNumeros){
            if (analisador > maiorNumero){
                maiorNumero = analisador;
            }
        }
        System.out.println("Maior numero: " + maiorNumero);

        int menorNumero = analisadorNumeros.getFirst();
        for (int analisador : analisadorNumeros){
            if (analisador < menorNumero){
                menorNumero = analisador;
            }
        }
        System.out.println("Menor numero: " + menorNumero);

        int soma = 0;
        for (int analisador : analisadorNumeros){
            soma += analisador;
        }
        System.out.println("Soma de todos os numeros: " + soma);
    }
}
