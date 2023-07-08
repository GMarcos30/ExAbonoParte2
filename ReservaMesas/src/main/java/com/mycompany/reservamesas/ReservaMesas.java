

package com.mycompany.reservamesas;

import java.util.Scanner;

public class ReservaMesas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int totalMesas = 50;
        final int mesasPorArea = totalMesas / 2;
        int mesasFumantes = mesasPorArea;
        int mesasNaoFumantes = mesasPorArea;

        while (mesasFumantes > 0 || mesasNaoFumantes > 0) {
            System.out.print("Digite a área da reserva (Fumantes ou Não Fumantes): ");
            String areaReserva = scanner.nextLine();

            if (areaReserva.equalsIgnoreCase("Fumantes")) {
                if (mesasFumantes > 0) {
                    mesasFumantes--;
                    System.out.println("Reserva realizada com sucesso na área de Fumantes.");
                    System.out.println("Mesas restantes na área de Fumantes: " + mesasFumantes);
                } else {
                    System.out.println("Não há mais mesas disponíveis na área de Fumantes.");
                }
            } else if (areaReserva.equalsIgnoreCase("NãoFumantes") || areaReserva.equalsIgnoreCase("nao fumantes")) {
                if (mesasNaoFumantes > 0) {
                    mesasNaoFumantes--;
                    System.out.println("Reserva realizada com sucesso na área de Não Fumantes.");
                    System.out.println("Mesas restantes na área de Não Fumantes: " + mesasNaoFumantes);
                } else {
                    System.out.println("Não há mais mesas disponíveis na área de Não Fumantes.");
                }
            } else {
                System.out.println("Área de reserva inválida. Digite Fumantes ou Não Fumantes.");
            }

            System.out.println();
        }

        System.out.println("Todas as mesas foram reservadas. Encerrando a execução.");
    }
}
