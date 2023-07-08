
package com.mycompany.fatorial;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int fatorial = calcularFatorial(numero);

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }

    public static int calcularFatorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            int fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
}
