
package com.mycompany.lojaanimais;


import java.util.Scanner;

public class LojaAnimais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de animais na loja: ");
        int quantidadeAnimais = scanner.nextInt();

        int quantidadeGatos = 0;
        int quantidadeCachorros = 0;

        for (int i = 1; i <= quantidadeAnimais; i++) {
            System.out.print("Digite a espécie do animal " + i + " (Gato ou Cachorro): ");
            String especie = scanner.next();

            if (especie.equalsIgnoreCase("Gato")) {
                quantidadeGatos++;
            } else if (especie.equalsIgnoreCase("Cachorro")) {
                quantidadeCachorros++;
            } else {
                System.out.println("Espécie inválida. Digite Gato ou Cachorro.");
                i--; // Decrementar o contador para repetir a leitura dessa animal
            }
        }

        System.out.println("Quantidade de gatos na loja: " + quantidadeGatos);
        System.out.println("Quantidade de cachorros na loja: " + quantidadeCachorros);
    }
}
