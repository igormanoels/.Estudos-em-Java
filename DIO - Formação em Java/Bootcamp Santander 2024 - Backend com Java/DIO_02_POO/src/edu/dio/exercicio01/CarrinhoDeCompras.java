package edu.dio.exercicio01;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CarrinhoDeCompras 
{
    private List<Itens> carrinho;

    public CarrinhoDeCompras() 
    {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) 
    {
        carrinho.add(new Itens(nome, preco, quantidade));
    }

    public void removerItem(String nomeRem) 
    {
        if (carrinho.size() != 0) 
        {
            List<Itens> remover = new ArrayList<>();
            for (Itens item : carrinho) 
            {
                if (item.getNome().equalsIgnoreCase(nomeRem)) 
                {
                    remover.add(item);
                }
            }
            if (remover.size() != 0) 
            {
                carrinho.removeAll(remover);
                JOptionPane.showMessageDialog(null, "Item removido com sucesso.", "Remoção de Item", JOptionPane.INFORMATION_MESSAGE);
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Item não encontrado no carrinho.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Seu carrinho está vazio.\nAdicione itens à lista!", "Opção inválida!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public double calcularValorTotal() 
    {
        double totalCarrinho = 0.00;
        for (Itens item : carrinho) 
        {
            totalCarrinho += (item.getPreco() * item.getQuantidade());
        }
        return totalCarrinho;
    }

    public void exibirItens() 
    {
        if (carrinho.size() != 0) 
        {
            StringBuilder itens = new StringBuilder();
            for (Itens item : carrinho) 
            {
                itens.append(item.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(null, itens.toString(), "Itens no Carrinho", JOptionPane.INFORMATION_MESSAGE);
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Seu carrinho está vazio.\nAdicione itens à lista!", "Opção inválida!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
