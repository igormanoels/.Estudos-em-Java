package br.edu.dio.Aula_002_HerancaEpolimorfismo.ex_003;

public non-sealed class RelogioBR extends Relogio{

	@Override
	public Relogio converter(Relogio relogio) {

		this.segundo = relogio.getSegundo();
		this.minuto = relogio.getMinuto();
		
		switch (relogio) {
			case RelogioUS relogioAmericano -> {
				this.hora = relogioAmericano.getIndicadorPeriodo().equals("pm") ? 
						relogioAmericano.getHora() + 12 : relogioAmericano.getHora();
			}
			case RelogioBR relogioBrasileiro -> {
				this.hora = relogioBrasileiro.getHora();
			}
		}
			
		return this;
	}
}
