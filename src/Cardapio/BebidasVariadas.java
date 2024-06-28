package Cardapio;
import java.util.Scanner;

import Util.Compra;

public class BebidasVariadas {
    public static void menuBebidas(Compra compra) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma bebida:");
        System.out.println("[1] Suco");
        System.out.println("[2] Água");
        System.out.println("[3] Refrigerante");
        System.out.println("[4] Soda Italiana");
        System.out.println("[5] Milkshake");

        int opcao = scanner.nextInt();
        switch(opcao) {
            case 1:
                menuSuco(compra);
                break;
            case 2:
                compra.adicionarItem("Água");
                break;
            case 3:
                menuRefrigerante(compra);
                break;
            case 4:
                compra.adicionarItem("Soda Italiana");
                break;
            case 5:
                menuMilkshake(compra);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
  
    private static void menuSuco(Compra compra) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um suco:");
        System.out.println("[1] Suco de Morango");
        System.out.println("[2] Suco de Uva");

        int opcao = scanner.nextInt();
        switch(opcao) {
            case 1:
                compra.adicionarItem("Suco de Morango");
                break;
            case 2:
                compra.adicionarItem("Suco de Uva");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    private static void menuRefrigerante(Compra compra) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um refrigerante:");
        System.out.println("[1] Coca Cola");
        System.out.println("[2] Fanta");

        int opcao = scanner.nextInt();
        switch(opcao) {
            case 1:
                compra.adicionarItem("Coca Cola");
                break;
            case 2:
                compra.adicionarItem("Fanta");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    private static void menuMilkshake(Compra compra) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um milkshake:");
        System.out.println("[1] Milkshake de Chocolate");
        System.out.println("[2] Milkshake de Morango");

        int opcao = scanner.nextInt();
        switch(opcao) {
            case 1:
                compra.adicionarItem("Milkshake de Chocolate");
                break;
            case 2:
                compra.adicionarItem("Milkshake de Morango");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}