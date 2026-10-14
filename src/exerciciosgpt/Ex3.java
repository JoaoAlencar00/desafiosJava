package exerciciosgpt;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int number = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
