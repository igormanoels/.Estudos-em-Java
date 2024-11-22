package model;

public class Partido {

    private String cnpj;
    private String nome;
    private String rep;
  
    public Partido (String...str) {
        this.cnpj = str[0];
        this.nome = str[1];
        this.rep = str[2];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRepresentante() {
        return rep;
    }

    public void setRepresentante(String rep) {
        this.rep = rep;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    
    
}
