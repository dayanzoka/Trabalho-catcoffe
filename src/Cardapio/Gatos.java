package Cardapio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Util.Compra;

public class Gatos {

    private static List<String> gatosSelecionados = new ArrayList<>();

    public static void menuGatos(Compra compra) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha seu gatinho :D! :");
        System.out.println("[1] Gatinho Preto");
        System.out.println("[2] Gatinho Branco");
        System.out.println("[3] Gatinho Amarelo");

        int opcao = scanner.nextInt();
        switch(opcao) {
            case 1:
                adicionarGato("Gatinho Preto");
                break;
            case 2:
                adicionarGato("Gatinho Branco");
                break;
            case 3:
                adicionarGato("Gatinho Amarelo");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        compra.adicionarGatosSelecionados(gatosSelecionados);
    }

    private static void adicionarGato(String gato) {
        gatosSelecionados.add(gato);
        System.out.println(gato + " selecionado.");
    }

    public static void exibirGatosSelecionados() {
        System.out.println("Gatinho selecionado:");
        for(String gato : gatosSelecionados) {
            System.out.println(gato);
        }
    }
}