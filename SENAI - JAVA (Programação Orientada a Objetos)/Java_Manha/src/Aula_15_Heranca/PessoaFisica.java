package Aula_15_Heranca;

public class PessoaFisica extends TrabalhandoComHeranca {
/* 
 * A palavra reservada extends direciona o uso dos atributos de uma classe para outra,
 * sendo uma classe mãe com atributos comuns, que serão utilizados por outras classes.
 * 
 * Para este exemplo, a classe PessoaFisica faz uso de atributos que estão contidos em TrabalhandoComHerancas
 *
*/
	
// Objetos da Classe filha (PessoaFisica)
	private String genero;
	private String cor;
	private String cpf;
	private String rg;
	private String idioma;
	private int idade;
	private double altura;
	private double peso;
	private boolean dormindo;
	private boolean acordado;
	
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public boolean isDormindo() {
		return dormindo;
	}
	public void setDormindo(boolean dormindo) {
		this.dormindo = dormindo;
	}
	public boolean isAcordado() {
		return acordado;
	}
	public void setAcordado(boolean acordado) {
		this.acordado = acordado;
	}

}
