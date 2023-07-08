
package com.mycompany.mediaalunos;


import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos na turma: ");
        int quantidadeAlunos = scanner.nextInt();

        for (int i = 1; i <= quantidadeAlunos; i++) {
            System.out.println("Aluno " + i);
            System.out.print("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();

            double media = (nota1 + nota2) / 2;

            System.out.println("Média do aluno: " + media);

            if (media >= 60) {
                System.out.println("Aluno APROVADO!");
            } else {
                System.out.println("Aluno REPROVADO!");
            }

            System.out.println();
        }
    }
}

