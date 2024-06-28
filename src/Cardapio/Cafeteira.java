package Cardapio;
import java.util.Scanner;

import Util.Compra;

public class Cafeteira {

    public static void menuCafeteira(Compra compra) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um café:");
        System.out.println("[1] Capuccino");
        System.out.println("[2] Latte");
        System.out.println("[3] Caramel Macchiato");
        System.out.println("[4] Matcha Latte");

        int opcao = scanner.nextInt();
        switch(opcao) {
            case 1:
                customizarCapuccino(compra);
                break;
            case 2:
                customizarLatte(compra);
                break;
            case 3:
                customizarCaramelMacchiato(compra);
                break;
            case 4:
                customizarMatchaLatte(compra);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    private static void customizarCapuccino(Compra compra) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder item = new StringBuilder("Capuccino");

        System.out.println("Escolha as opções para personalizar o Capuccino:");
        System.out.println("[1] + Adicionar leite integral");
        System.out.println("[2] + Adicionar mais açúcar");
        System.out.println("[3] - Voltar");

        int opcao = scanner.nextInt();
        switch(opcao) {
            case 1:
                item.append(" + leite integral adicionado!");
                break;
            case 2:
                item.append(" + açúcar adicionado!");
                break;
            case 3:
                System.out.println("Voltando ao menu principal... :) ");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        compra.adicionarItem(item.toString());
    }

    private static void customizarLatte(Compra compra) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder item = new StringBuilder("Latte");

        System.out.println("Escolha as opções para personalizar o Latte:");
        System.out.println("[1] + Adicionar leite integral");
        System.out.println("[2] + Adicionar mais açúcar");
        System.out.println("[3] + Adicionar baunilha");
        System.out.println("[4] Voltar");

        int opcao = scanner.nextInt();
        switch(opcao) {
            case 1:
                item.append(" + leite integral adicionado! ");
                break;
            case 2:
                item.append(" + açúcar adicionado! ");
                break;
            case 3:
                item.append(" + baunilha adicionado! ");
                break;
            case 4:
                System.out.println("Voltando ao menu principal... :) ");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        compra.adicionarItem(item.toString());
    }

    private static void customizarCaramelMacchiato(Compra compra) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder item = new StringBuilder("Caramell Macchiato");

        System.out.println("Escolha as opções para personalizar o Caramel Macchiato:");
        System.out.println("[1] + Adicionar leite integral");
        System.out.println("[2] + Adicionar mais açúcar");
        System.out.println("[3] + Adicionar desenho de gatinho");
        System.out.println("[4] Voltar");

        int opcao = scanner.nextInt();
        switch(opcao) {
            case 1:
                item.append(" + leite integral adicionado! ");
                break;
            case 2:
                item.append(" + açúcar adicionado! ");
                break;
            case 3:
                item.append(" + desenho de gatinho adicionado! ");
                break;
            case 4:
                System.out.println("Voltando ao menu principal... :)");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        compra.adicionarItem(item.toString());
    }

    private static void customizarMatchaLatte(Compra compra) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder item = new StringBuilder("Matcha Latte");

        System.out.println("Escolha as opções para personalizar o Matcha Latte:");
        System.out.println("[1] + Adicionar leite integral");
        System.out.println("[2] + Adicionar mais açúcar");
        System.out.println("[3] + Adicionar caramelo");
        System.out.println("[4] Voltar");

        int opcao = scanner.nextInt();
        switch(opcao) {
            case 1:
                item.append(" + leite integral adicionado! ");
                break;
            case 2:
                item.append(" + açúcar adicionado! ");
                break;
            case 3:
                item.append(" + baunilha adicionado! ");
                break;
            case 4:
                System.out.println("Voltando ao menu principal... :)");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        compra.adicionarItem(item.toString());
    }
 
}