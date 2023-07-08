
package com.mycompany.jornadabr101;

import java.util.Scanner;

public class JornadaBR101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quilometragemTotal = 0;
        int quilometragemCidade;

        while (quilometragemTotal < 4000) {
            System.out.print("Informe a quilometragem percorrida na cidade: ");
            quilometragemCidade = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            quilometragemTotal += quilometragemCidade;

            System.out.println("Quilometragem total percorrida: " + quilometragemTotal + " km");
            System.out.println();
        }

        System.out.println("A quilometragem total atingiu ou ultrapassou 4000 km. Encerrando a jornada.");
    }
}
