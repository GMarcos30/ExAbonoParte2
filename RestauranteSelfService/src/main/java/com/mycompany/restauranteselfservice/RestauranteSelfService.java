
package com.mycompany.restauranteselfservice;

import java.util.Scanner;

public class RestauranteSelfService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precoQuilo = 23.59;
        
        while (true) {
            System.out.print("Digite o peso do prato (em quilos): ");
            double pesoPrato = scanner.nextDouble();
            
            System.out.print("Digite o valor gasto com bebida: ");
            double valorBebida = scanner.nextDouble();
            
            if (pesoPrato == 0 && valorBebida == 0) {
                break;
            }
            
            double valorConta = valorBebida + (pesoPrato * precoQuilo);
            
            System.out.println("Valor total da conta: R$" + valorConta);
            System.out.println();
        }
        
        System.out.println("Encerrando a execução.");
    }
}
