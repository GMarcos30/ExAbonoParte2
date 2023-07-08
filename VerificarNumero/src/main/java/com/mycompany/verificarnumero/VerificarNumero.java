
package com.mycompany.verificarnumero;


import java.util.Scanner;

public class VerificarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (estaEntre100e200(numero)) {
            System.out.println("Você digitou um número entre 100 e 200.");
        } else {
            System.out.println("Você digitou um número fora da faixa entre 100 e 200.");
        }
    }

    public static boolean estaEntre100e200(int numero) {
        return (numero >= 100 && numero <= 200);
    }
}
