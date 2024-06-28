package Util;
import java.util.ArrayList;
import java.util.List;

public class Compra {
    private List<String> itens;
    private List<String> gatosSelecionados;
    private List<String> fotosSelecionadas;

    public Compra() {
        this.itens = new ArrayList<>();
        this.gatosSelecionados = new ArrayList<>();
        this.fotosSelecionadas = new ArrayList<>();
    }

    public void adicionarItem(String item) {
        itens.add(item);
    }

    public void adicionarGatosSelecionados(List<String> gatos) {
        gatosSelecionados.addAll(gatos);
    }

    public void adicionarFoto(String foto) {
        fotosSelecionadas.add(foto);
    }

    public void mostrarRecibo() {
        System.out.println("Itens comprados:");
        for (String item : itens) {
            System.out.println(item);
        }

        System.out.println("Gatinhos selecionados:");
        for (String gato : gatosSelecionados) {
            System.out.println(gato);
        }

        System.out.println("Fotografias tiradas:");
        for (String foto : fotosSelecionadas) {
            System.out.println(foto); }

        System.out.println("Obrigado por comprar em nossa loja, volte sempre :D!.");
    }
}