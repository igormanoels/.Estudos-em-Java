package model;

import java.sql.Date;

public class Apuracao {

    private int quantidadeVotos;
    private Candidato candidato;
    private Date dataApuracao;

    public int getQuantidadeVotos() {
        return quantidadeVotos;
    }
    
    public void setQuantidadeVotos(int quantidadeVotos) {
        this.quantidadeVotos = quantidadeVotos;
    }
    
    public Candidato getCandidato() {
        return candidato;
    }
    
    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
    
    public Date getDataApuracao() {
        return dataApuracao;
    }
    
    public void setDataApuracao(Date dataApuracao) {
        this.dataApuracao = dataApuracao;
    }

    

}
