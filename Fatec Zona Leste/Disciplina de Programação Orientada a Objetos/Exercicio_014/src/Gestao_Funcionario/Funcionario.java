package Gestao_Funcionario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario {

	private long id;
    private String nome;
    private LocalDate admissao;
    private LocalDate demissao;
    private float salario;
    private String horario;
    
    
    public Funcionario(String...str) {
    	this.id = Long.parseLong(str[0]);
        this.nome = str[1];
        this.admissao = converterData(str[2]);
        this.demissao = converterData(str[3]);
        this.salario = Float.parseFloat(str[4]);
        this.horario = str[5];
	}
    

    public Funcionario() {}


	private LocalDate converterData(String data) {
        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(data, formatarData);
    }


    // Getters and Setters
    public void setId(String id) {
        this.id = Long.parseLong(id);
    }

    public long getId() {
        return this.id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setAdmissao(String data) {
        this.admissao = converterData(data);
    }

    public String getAdmisso() {
        return String.valueOf(this.admissao);
    }

    public void setDemissao(String data) {
        this.demissao = converterData(data);
    }

    public String getDemissao() {
        return String.valueOf(this.demissao);
    }

    public void setSalario(String salario) {
        this.salario = Float.parseFloat(salario);
    }

    public Float getSalario() {
        return this.salario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getHorario() {
        return this.horario;
    }

    @Override
    public String toString() {
        return "Funcionario: " + this.nome + ", Salario: " + this.salario + ", Admissao: " + admissao + ", Demissao: " + demissao + ", Horario: " + horario;
    }

}
