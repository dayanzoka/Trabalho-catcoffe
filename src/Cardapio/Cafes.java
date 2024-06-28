package Cardapio;
import java.util.Scanner;

import Util.Compra;
public class Cafes {
    public static void menuCafe(Compra compra) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um café:");
        System.out.println("[1] Capuccino");
        System.out.println("[2] Latte");
        System.out.println("[3] Caramel Macchiato");
        System.out.println("[4] Matcha Latte");

        int opcao = scanner.nextInt();
        switch(opcao) {
            case 1:
                compra.adicionarItem("Capuccino");
                break;
            case 2:
                compra.adicionarItem("Latte");
                break;
            case 3:
                compra.adicionarItem("Caramel Macchiato");
                break;
            case 4:
                compra.adicionarItem("Matcha Latte");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}