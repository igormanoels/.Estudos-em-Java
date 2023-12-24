package Aula_15_Heranca;

public class PessoaJuridica extends TrabalhandoComHeranca{
/*
 * Objetos da Classe filha (PessoaJuridica)
 */
	private String cnpj;
	private String inscEstadual;
	private String cnae;
	private String tempoOperacao;
	private String inscMunicipal;
	private String regimeTributario;
	private String tipoAtividade;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getInscEstadual() {
		return inscEstadual;
	}
	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}
	public String getCnae() {
		return cnae;
	}
	public void setCnae(String cnae) {
		this.cnae = cnae;
	}
	public String getTempoOperacao() {
		return tempoOperacao;
	}
	public void setTempoOperacao(String tempoOperacao) {
		this.tempoOperacao = tempoOperacao;
	}
	public String getInscMunicipal() {
		return inscMunicipal;
	}
	public void setInscMunicipal(String inscMunicipal) {
		this.inscMunicipal = inscMunicipal;
	}
	public String getRegimeTributario() {
		return regimeTributario;
	}
	public void setRegimeTributario(String regimeTributario) {
		this.regimeTributario = regimeTributario;
	}
	public String getTipoAtividade() {
		return tipoAtividade;
	}
	public void setTipoAtividade(String tipoAtividade) {
		this.tipoAtividade = tipoAtividade;
	}

	
}
