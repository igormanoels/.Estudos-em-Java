package br.edu.dio.Aula_002_HerancaEpolimorfismo.ex_003;

public final class RelogioUS extends Relogio{

	private String indicadorPeriodo;

	public String getIndicadorPeriodo() {
		return indicadorPeriodo;
	}
	
	public void posMeioDia() {
		this.indicadorPeriodo = "pm";
	}
	
	public void antesMeioDia() {
		this.indicadorPeriodo = "am";		
	}
	
	public void setHora(int hora) {
		antesMeioDia();
		if(hora >= 12 && hora <= 23) {
			posMeioDia();
			this.hora = hora - 12;
			return;
		} else if (hora >= 24){
			this.hora = 0;			
		} else {
			this.hora = hora;
		}
	}
	
	
	@Override
	Relogio converter(Relogio relogio) {

		this.segundo = relogio.getSegundo();
		this.minuto = relogio.getMinuto();
		
		switch (relogio) {
		case RelogioUS relogioAmericano -> {
			this.hora = relogioAmericano.getHora();
			this.indicadorPeriodo = relogioAmericano.getIndicadorPeriodo();
		}
		case RelogioBR relogioBrasileiro -> {
			this.setHora(relogioBrasileiro.getHora());
			//this.hora = relogioBrasileiro.getHora() > 12 ? relogioBrasileiro.getHora() - 12: relogioBrasileiro.getHora() ;
		}
	}
		
		return null;
	}
	
	@Override
	public String time() {
		return super.time() + this.indicadorPeriodo;
	}
	
	
}
