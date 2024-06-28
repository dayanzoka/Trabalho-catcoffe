package Cardapio;
import java.util.Scanner;

import Util.Compra;

public class Sobremesas {
    public static void menuSobremesas(Compra compra) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma sobremesa:");
        System.out.println("[1] Torta");
        System.out.println("[2] Bolo");
        System.out.println("[3] Brigadeiro");
        System.out.println("[4] Donnut");

        int opcao = scanner.nextInt();
        switch(opcao) {
            case 1:
                menuTorta(compra);
                break;
            case 2:
                menuBolo(compra);
                break;
            case 3:
                compra.adicionarItem("Brigadeiro");
                break;
            case 4:
                compra.adicionarItem("Donnut");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    private static void menuTorta(Compra compra) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma torta:");
        System.out.println("[1] Torta de Banana");
        System.out.println("[2] Torta de Maçã");

        int opcao = scanner.nextInt();
        switch(opcao) {
            case 1:
                compra.adicionarItem("Torta de Banana");
                break;
            case 2:
                compra.adicionarItem("Torta de Maçã");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    private static void menuBolo(Compra compra) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um bolo:");
        System.out.println("[1] Bolo de Coco");
        System.out.println("[2] Bolo de Cenoura");

        int opcao = scanner.nextInt();
        switch(opcao) {
            case 1:
                compra.adicionarItem("Bolo de Coco");
                break;
            case 2:
                compra.adicionarItem("Bolo de Cenoura");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

}