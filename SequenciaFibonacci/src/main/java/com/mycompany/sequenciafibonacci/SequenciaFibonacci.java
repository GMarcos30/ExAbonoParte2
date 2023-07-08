
package com.mycompany.sequenciafibonacci;


import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");
        int numero = scanner.nextInt();

        System.out.println("Sequência Fibonacci até o primeiro número superior a " + numero + ":");
        for (int i = 0; fibonacci(i) <= numero; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
