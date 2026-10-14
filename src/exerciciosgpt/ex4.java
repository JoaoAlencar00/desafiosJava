package exerciciosgpt;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int number = scanner.nextInt();
        int numbersPares = 0;

        for(int i = 1; i <= number; i++){
            if (i % 2 == 0){
                numbersPares+=i;
                System.out.println(i);
            }
        }
        System.out.println("resultado = " + numbersPares);
    }
}
