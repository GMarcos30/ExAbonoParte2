
package com.mycompany.calculoalturas;

import java.util.Scanner;

public class CalculoAlturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int quantidadePessoas = 15;

        double menorAltura = Double.MAX_VALUE;
        double maiorAltura = Double.MIN_VALUE;

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.print("Digite a altura da pessoa " + i + ": ");
            double altura = scanner.nextDouble();

            if (altura < menorAltura) {
                menorAltura = altura;
            }

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
        }

        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Maior altura: " + maiorAltura);
    }
}

