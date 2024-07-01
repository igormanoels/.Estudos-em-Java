package edu.dio.aula13.Set;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class ConjuntoConvidados 
{
	private Set<Convidado> convidadosSet;
	
	public ConjuntoConvidados() 
	{
		this.convidadosSet = new HashSet<>();
	}
	
	public void AdcionarConvidado(String nome, int cvt)
	{
		convidadosSet.add(new Convidado(nome, cvt));
	}
	
	public void RemoverConvidadoPorConvite(int cvt)
	{
		Convidado removerConvidado = null;
		
		for (Convidado c : convidadosSet) 
		{
			if (c.getCodigoConvite() == cvt) 
			{
				removerConvidado = c;
				break;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Não existe convidado para este convite.", 
						"Convidado " + cvt + ": não encontrado!", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		convidadosSet.remove(removerConvidado);
	}
	
	public void ContarConvidados()
	{
		JOptionPane.showMessageDialog(null,"Número de Candidatos: " + convidadosSet.size());
	}
	
	public void MostrarCondidatos()
	{
		for (Convidado c :convidadosSet) 
		{
			System.out.println(c);
		}
	}
	
}
