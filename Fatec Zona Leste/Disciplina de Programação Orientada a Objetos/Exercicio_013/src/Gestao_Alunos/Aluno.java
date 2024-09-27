package Gestao_Alunos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aluno {

	private long id;
	private LocalDate data; 
	private String ra;
	private String nome;


	public Aluno(String...str) {
		this.id = Long.parseLong(str[0]);
		this.data = converteData(str[1]); 
		this.ra = str[2];
		this.nome = str[3];
	}
	
	private LocalDate converteData(String data) {
		DateTimeFormatter formatData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return LocalDate.parse(data, formatData);
	}
	
	// Getters and Setters
	public void setData(String data) {
		this.data = converteData(data); 
	}
	
	public LocalDate getData() {
		return this.data; 
	}
	
	public void setRa(String ra) {
		this.ra = ra;
	}
	
	public String getRA() {
		return this.ra;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setId(String id) {
		this.id = Long.parseLong(id);
	}
	
	public Long getId() {
		return this.id;
	}
	
	
	public String toString() {
		return "RA: " + this.ra + ", Aluno: " + this.nome + ", Data: " + this.data;
	}
	


}
