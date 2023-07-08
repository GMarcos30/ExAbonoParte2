
package com.mycompany.caixamercado;

import java.util.Scanner;

public class CaixaMercado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos produtos o cliente comprou? ");
        int quantidadeProdutos = scanner.nextInt();

        double totalPagar = 0.0;

        for (int i = 1; i <= quantidadeProdutos; i++) {
            System.out.print("Informe o preço do produto " + i + ": ");
            double precoProduto = scanner.nextDouble();
            totalPagar += precoProduto;
        }

        System.out.println("O cliente deve pagar: R$" + totalPagar);
    }
}
