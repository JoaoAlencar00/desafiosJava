package exerciciosgpt;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeNotasAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();

        ArrayList<Double> notas = new ArrayList<>();

        for (int i = 0; i < 5; i++){

            String nome;
            boolean temNumero;

            do {
                System.out.println("Digite o nome do aluno: ");
                nome = scanner.nextLine();
                temNumero = false;

                for (int j = 0; j < nome.length(); j++){
                    if (Character.isDigit(nome.charAt(j))){
                        temNumero = true;
                        break;
                    }
                }

                if(temNumero){
                    System.out.println("Digite um nome sem números.");
                }

            } while (temNumero);

            double nota;

            do {
                    System.out.println("Digite a nota do aluno: ");
                    nota = scanner.nextDouble();

                    if (nota < 0 || nota > 10){
                        System.out.println("Digite uma nota válida de 0 a 10.");
                    }
            } while (nota < 0 || nota > 10);

            scanner.nextLine(); //consome o enter que ficou depois do nextDouble()
           
            nomes.add(nome);
            notas.add(nota);
        }

        for (int i = 0; i < nomes.size(); i++){
            System.out.println("nome: " + nomes.get(i) + " nota: " + notas.get(i));
        }

        double somaNotas = 0;
        double maiorNota = notas.getFirst();
        int contaNotas = 0;
        for (double nota : notas){
            somaNotas += nota;

            if (nota > maiorNota){
                maiorNota = nota;
            }
            if (nota >= 7){
                contaNotas++;
            }
        }

        double mediaDeNotas = somaNotas / notas.size();
        System.out.println("A media da turma: " + mediaDeNotas);
        System.out.println("A maior nota: " + maiorNota);
        System.out.println("Quantidade de alunos aprovados: " + contaNotas);

        scanner.close();
    }
}
