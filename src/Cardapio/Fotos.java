package Cardapio;
import java.util.Scanner;

import Util.Compra;

public class Fotos {
    public static void menuFotos(Compra compra) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção de fotografia:");
        System.out.println("[1] Foto com gatinho :3 ");
        System.out.println("[2] Foto do lanche :P ");
        System.out.println("[3] Foto com tiara de gato e cenário :O ");

        int opcao = scanner.nextInt();
        switch(opcao) {
            case 1:
                compra.adicionarFoto("Foto com gatinho");
                break;
            case 2:
                compra.adicionarFoto("Foto do lanche");
                break;
            case 3:
                compra.adicionarFoto("Foto com tiara de gato e cenário");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}