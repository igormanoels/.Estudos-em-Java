package edu.dio.exercicio01;

import javax.swing.JOptionPane;

public class Principal {
    static String nome;
    static double preco;
    static int quant;

    public static void main(String[] args) 
    {
        boolean finalizar = true;
        int op;
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        while (finalizar) 
        {
            op = Integer.parseInt(JOptionPane.showInputDialog("Carrinho de compras\n"
                    + "1 - Adicionar Item ao carrinho. \n"
                    + "2 - Remover Item do carrinho. \n"
                    + "3 - Calcular valor total. \n"
                    + "4 - Exibir Itens. \n"
                    + "0 - Finalizar."));
            switch (op) 
            {
                case 0:
                    JOptionPane.showMessageDialog(null, "Obrigado por finalizar a compra!", "Fim da Aplicação.", JOptionPane.CLOSED_OPTION);
                    finalizar = false;
                    break;
                case 1:
                    nome = JOptionPane.showInputDialog("Informe o nome do produto");
                    preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto: "));
                    quant = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade: "));
                    carrinho.adicionarItem(nome, preco, quant);
                    break;
                case 2:
                    nome = JOptionPane.showInputDialog("Informe o nome do produto que será removido: ");
                    carrinho.removerItem(nome);
                    break;
                case 3:
                    double total = carrinho.calcularValorTotal();
                    JOptionPane.showMessageDialog(null, "R$ " + total, "Total do Carrinho: ", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    carrinho.exibirItens();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite uma opção conforme o menu a seguir","Opção inválida!", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
}
