package Util;

public class Avaliacao {
    private int nota;
    
    public Avaliacao(int nota) {
        setNota(nota);
    }
    
    public int getNota() {
        return nota;
    }
    
    public void setNota(int nota) {
        if (nota < 1 || nota > 10) {
            throw new IllegalArgumentException("Desculpe mas sua nota deve estar entre 1 e 10 D: .");
        }
        this.nota = nota;
    }
    
    @Override
    public String toString() {
        return "Avaliação: " + nota + "/10";
    }
}