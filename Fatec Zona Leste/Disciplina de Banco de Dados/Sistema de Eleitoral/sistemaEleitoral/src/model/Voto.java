package model;

public class Voto {
    
    private Eleitor eleitor;
    private int numero;

    public Voto (String...str) {
        this.eleitor = new Eleitor(str[0]);
        this.numero = Integer.parseInt(str[1]);
    }

    public Eleitor getEleitor() {
        return eleitor;
    }
    
    public void setEleitor(Eleitor eleitor) {
        this.eleitor = eleitor;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    
}
