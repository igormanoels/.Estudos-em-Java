package model;

public class Partido {

    private String cnpj;
    private String nome;
    private String representante;
  
    public Partido (String...str) {
        this.cnpj = str[0];
        this.nome = str[1];
        this.representante = str[2];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    
    
}
