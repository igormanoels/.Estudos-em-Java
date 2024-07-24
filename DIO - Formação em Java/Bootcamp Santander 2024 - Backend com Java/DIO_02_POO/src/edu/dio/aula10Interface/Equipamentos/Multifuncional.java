package edu.dio.aula10Interface.Equipamentos;

// É preciso fazer o import caso a interface esteja em outro pacote
import edu.dio.aula10Interface.Funcoes.*;

// Com o uso de interface os métodos podem assinar mais de um método.
public class Multifuncional implements Copiadora, Digitalizadora, Impressora
{
	@Override
	public void copiar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void digitalizar() {
		// TODO Auto-generated method stub
		
	}
	
}
