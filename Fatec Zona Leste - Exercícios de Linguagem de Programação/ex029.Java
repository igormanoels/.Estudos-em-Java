package investimentos;
 /**
 * @author GitHub @igormanoels
 */
import javax.swing.JOptionPane;

public class Investimentos{
    public static void main (String[]args){
        Double tipoInv, poupanca, rendaFx;

            System.out.println("Algotimo: Cálcula o valor de renda a partir de um investimento na poupança e renda fixa.");
            System.out.println("Digite a seguir --> ");
            System.out.println(" 1 para Opção de Poupança");
            System.out.println(" 2 para Opção de Renda Fixa");

        tipoInv = Double.parseDouble(JOptionPane.showInputDialog("Favor informe a opção desejada"));

            if (tipoInv <= 0)
                {
                    System.out.println("Opção inválida");
                }
                    else if (tipoInv == 1)
                        {
                            poupanca = Double.parseDouble(JOptionPane.showInputDialog("Você escolheu Poupança, informe o valor do Investimento!"));
                            poupanca = (poupanca * 1.03);
                                System.out.println("O valor do montante é de R$ " + poupanca);
                        }
                            else if (tipoInv == 2)
                                {
                                    rendaFx = Double.parseDouble(JOptionPane.showInputDialog("Você escolheu Renda Fixa, informe o valor do Investimento"));
                                    rendaFx = (rendaFx * 1.05);
                                        System.out.println("O valor do montante é de R$ " + rendaFx);
                                }
                                    else
                                        {
                                            System.out.println("Opção inválida");
                                        }
    }
}