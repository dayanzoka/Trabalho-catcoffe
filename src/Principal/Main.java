package Principal;

import Cardapio.*;
import Efeito.*;
import Util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Compra compra = new Compra();

        while (true) {
            System.out.println(" > Bem vindo à Cat Coffee :D! < ");
            System.out.println("Fique à vontade, dê uma olhada em nosso cardápio :)");
            System.out.println("[1] Cafés");
            System.out.println("[2] Bebidas variadas");
            System.out.println("[3] Sobremesas");
            System.out.println("[4] Salgados");
            System.out.println("[5] Gatos");
            System.out.println("[6] Cafeteira");
            System.out.println("[7] Fotografias");
            System.out.println("[8] Finalizar Compra");
            System.out.println("[9] ~ opção Secreta... O_O?? ");
            int opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    Cafes.menuCafe(compra);
                    break;
                case 2:
                    BebidasVariadas.menuBebidas(compra);
                    break;
                case 3:
                    Sobremesas.menuSobremesas(compra);
                    break;
                case 4:
                    Salgados.menuSalgados(compra);
                    break;
                case 5:
                    Gatos.menuGatos(compra);
                    break;
                case 6:
                    Cafeteira.menuCafeteira(compra);
                    break;
                case 7:
                    Fotos.menuFotos(compra);
                    break;
                case 8:
                    compra.mostrarRecibo();
                    avaliarCafeteria(scanner);
                    compra = new Compra();
                    break;
                case 9:
                    opcaoSecreta(scanner);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    private static void avaliarCafeteria(Scanner scanner) {
        System.out.println("Por favor, avalie a nossa cafeteria com uma nota de 1 a 10 :D :");
        int nota = 0;

        while (true) {
            nota = scanner.nextInt();
            if (nota >= 1 && nota <= 10) {
                break;
            } else {
                System.out.println("Nota inválida. Por favor, insira uma nota entre 1 e 10:");
            } 
        }

        scanner.nextLine(); 
        System.out.println("Deseja deixar algum comentário?");
        String comentario = scanner.nextLine();

        Nota avaliacao = new Nota(nota, comentario);
        System.out.println("Obrigado pela sua avaliação ^^!");
        System.out.println(avaliacao);
    }

    private static void opcaoSecreta(Scanner scanner) {
        System.out.println("Tem certeza que deseja prosseguir? Será por sua conta e risco... >:)");
        System.out.println("[1] Sim!");
        System.out.println("[2] Não! Amarelei hehe");
        int confirmacao = scanner.nextInt();

        if (confirmacao == 2) {
            System.out.println("Opção secreta cancelada.");
            return;
        }

        System.out.println("--- Opção Secreta ---");
        System.out.println("[1] Substância 1");
        System.out.println("[2] Substância 2");
        System.out.println("[3] Substância 3");
        System.out.println("[4] Substância 4");
        System.out.println("[5] Substância 5");
        
        int escolha = scanner.nextInt();

        EfeitoColateral efeito = null;
        switch (escolha) {
            case 1:
                efeito = new Sub1();
                break;
            case 2:
                efeito = new Sub2();
                break;
            case 3:
                efeito = new Sub3();
                break;
            case 4:
                efeito = new Sub4();
                break;
            case 5:
                efeito = new Sub5();
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }
        
        efeito.aplicarEfeito();
    }
}