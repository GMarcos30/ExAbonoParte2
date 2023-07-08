/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculoxy;
import java.util.Scanner;

public class CalculoXY{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor para x: ");
        int x = scanner.nextInt();

        int y = calcularY(x);

        System.out.println("O valor de Y é: " + y);
    }

    public static int calcularY(int x) {
        if (x > 100) {
            return 0;
        }

        return (x + calcularY(x + 1));
    }
}
