
package com.mycompany.pesquisacanaltv;

import java.util.Scanner;

public class PesquisaCanalTV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de casas participantes da pesquisa: ");
        int quantidadeCasas = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado

        int[] canais = new int[quantidadeCasas];
        int[] quantidades = new int[quantidadeCasas];
        int totalPessoas = 0;

        for (int i = 0; i < quantidadeCasas; i++) {
            System.out.println("Casa " + (i + 1));
            System.out.print("Informe o número do canal assistido (3, 5, 8, 11 ou 13): ");
            canais[i] = scanner.nextInt();
            System.out.print("Informe o número de pessoas assistindo: ");
            quantidades[i] = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado
            System.out.println();

            totalPessoas += quantidades[i];
        }

        int[] contagemCanais = new int[11]; // 11 canais possíveis (índices 0 a 10)
        double[] porcentagemAudiencia = new double[11];

        for (int i = 0; i < quantidadeCasas; i++) {
            int canal = canais[i];
            int quantidade = quantidades[i];
            contagemCanais[canal - 3] += quantidade;
        }

        System.out.println("Audiência por canal:");
        for (int i = 0; i < 11; i++) {
            int canal = i + 3;
            double porcentagem = (double) contagemCanais[i] / totalPessoas * 100;
            System.out.println("Canal " + canal + ": " + porcentagem + "% de audiência");
        }
    }
}
