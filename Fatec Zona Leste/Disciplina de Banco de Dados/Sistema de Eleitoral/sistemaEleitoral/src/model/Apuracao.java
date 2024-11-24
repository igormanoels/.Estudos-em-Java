package model;

import java.time.LocalDate;

public class Apuracao {

    private int numero;
    private String nome;
    private String cpf;
    private LocalDate nascimento;
    private String estado;
    private String nomePartido;
    private int quantidadeVotos;
    private LocalDate dataApuracao; 

    public Apuracao(Integer numero, String nome, String cpf, LocalDate nascimento, 
        String estado, String partido, Integer votos) {
        this.numero = numero;
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.estado = estado;
        this.nomePartido = partido;
        this.quantidadeVotos = votos;
        this.dataApuracao = LocalDate.now();
    }

    public Apuracao(Integer numero, String nome, String cpf, LocalDate nascimento, 
    String estado, String partido, Integer votos, LocalDate dataApuracao) {
    this.numero = numero;
    this.nome = nome;
    this.cpf = cpf;
    this.nascimento = nascimento;
    this.estado = estado;
    this.nomePartido = partido;
    this.quantidadeVotos = votos;
    this.dataApuracao = dataApuracao;
}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNomePartido() {
        return nomePartido;
    }

    public void setNomePartido(String nomePartido) {
        this.nomePartido = nomePartido;
    }

    public int getQuantidadeVotos() {
        return quantidadeVotos;
    }

    public void setQuantidadeVotos(int quantidadeVotos) {
        this.quantidadeVotos = quantidadeVotos;
    }

    public LocalDate getDataApuracao() {
        return dataApuracao;
    }

    public void setDataApuracao(LocalDate dataApuracao) {
        this.dataApuracao = dataApuracao;
    }

    
    

}
