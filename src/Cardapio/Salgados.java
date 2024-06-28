package Cardapio;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import Util.Compra;

public class Salgados {
    private static final String FILE_PATH = "salgados.txt";
    
    public static void menuSalgados(Compra compra) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um salgado:");
        System.out.println("[1] Coxinha");
        System.out.println("[2] Croissant");
        System.out.println("[3] Pão de Queijo");
        System.out.println("[4] Misto Quente");
        System.out.println("[5] Pastel");

        int opcao = scanner.nextInt();
        String itemEscolhido = null;
        
        switch(opcao) {
            case 1:
                itemEscolhido = "Coxinha";
                break;
            case 2:
                itemEscolhido = "Croissant";
                break;
            case 3:
                itemEscolhido = "Pão de Queijo";
                break;
            case 4:
                itemEscolhido = "Misto Quente";
                break;
            case 5:
                itemEscolhido = "Pastel";
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        
        if (itemEscolhido != null) {
            compra.adicionarItem(itemEscolhido);
            salvarEmArquivo(itemEscolhido);
        }
    }

    private static void salvarEmArquivo(String item) {
        try (FileWriter fw = new FileWriter(FILE_PATH, true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(item);
        } catch (IOException e) {
            System.out.println("Erro ao salvar o item no arquivo: " + e.getMessage());
        }
    }
}