package exerciciosgpt;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = entradaUsuario.nextInt();
        int somaNumber = 0;

        for(int i = 1; i <= numero; i++){
            somaNumber += i;
        }
        System.out.println("N = " + somaNumber);
    }
}
