import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();
        int contarImpares = 0;

        for (int i = 1; i <= numero; i++){
            if (i % 2 == 1) {
                System.out.println("Numeros impares: " + i);
                contarImpares++;
            }
        }
        System.out.println("Existem " + contarImpares + " numeros impares.");
    }
}