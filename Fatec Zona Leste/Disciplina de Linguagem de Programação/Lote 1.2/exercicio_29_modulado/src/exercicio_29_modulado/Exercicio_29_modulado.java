package exercicio_29_modulado;


import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  29. Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
 *  Calcule e mostre o valor corrigido em 30 dias sabendo que a 
 *  poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
 */

public class Exercicio_29_modulado {

    public static void main(String[] args) 
    {
        String rdmtFormatado, aplica = "";
	double rend = 0.00, invest;
	
	DecimalFormat formatar = new DecimalFormat("###,###,###.00");
		
	int op = Integer.parseInt(JOptionPane.showInputDialog("Seja bem vindo ao sistema de aplicação."
	+ "\nDigite 1 para Poupança: "
	+ "\nDigite 2 para Renda Fixa: "));
		
		
	if (op == 1 || op == 2) 
	{
            invest = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor que você deseja aplicar: "));
			
            switch (op) 
            {
                case 1:
                    aplica = "Poupança";
                    rend = poup(invest);
		break;
		
                case 2 :
                    aplica = "Renda Fixa";
                    rend = rendFx(invest);
		break;
            }	
	
                rdmtFormatado = formatar.format(rend);
                JOptionPane.showMessageDialog(null, "O Rendimento na " + aplica + ", daqui a 30 dias será de R$ " + rend);
        }
	else 
	{
            JOptionPane.showMessageDialog(null, "Opção Inválida");
	}
		
    }

    /**************************************************************
     * Função para cálcular o valor do investimento pela Poupança.
     */ 
    static double poup(double inv)
    {
        double rend = inv * 1.03;
	return rend;
    }
	
    /***************************************************************
     * Função para cálcular o valor do investimento pela Renda Fixa.
     */ 
    static double rendFx(double inv)
    {
        double rend = inv * 1.05;
	return rend;
    }
    
}
