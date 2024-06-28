package Util;

public class Nota extends Avaliacao {
    private String comentario;
    
    public Nota(int nota, String comentario) {
        super(nota);
        this.comentario = comentario;
    }
    
    public String getComentario() {
        return comentario;
    }
    
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    @Override
    public String toString() {
        return super.toString() + " - Comentário: '" + comentario + "'";
    }
}