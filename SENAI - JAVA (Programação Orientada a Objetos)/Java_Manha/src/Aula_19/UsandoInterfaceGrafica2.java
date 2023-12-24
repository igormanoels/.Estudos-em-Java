package Aula_19;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class UsandoInterfaceGrafica2 extends JFrame {

    private JButton btnVerificar, btnMarcar, btnDesmarcar;
    private JCheckBox ckIngles, ckInformatica;

    public UsandoInterfaceGrafica2() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setTitle("Caixa de Opção");
        setBounds(0, 0, 350, 300);
        setLayout(null);

        btnVerificar = new JButton("Verificar");
        btnMarcar = new JButton("Marcar");
        btnDesmarcar = new JButton("Desmarcar");
        ckIngles = new JCheckBox("Inglês");
        ckInformatica = new JCheckBox("Informática");

        btnVerificar.setBounds(20, 70, 100, 25);
        btnMarcar.setBounds(20, 100, 100, 25);
        btnDesmarcar.setBounds(20, 130, 100, 25);
        ckIngles.setBounds(150, 15, 100, 25);
        ckInformatica.setBounds(150, 45, 100, 25);

        add(btnVerificar);
        add(btnMarcar);
        add(btnDesmarcar);
        add(ckIngles);
        add(ckInformatica);
    }

    private void definirEventos() {
        btnMarcar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ckInformatica.setSelected(true);
                ckIngles.setSelected(true);
            }
        });
        btnDesmarcar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ckInformatica.setSelected(false);
                ckIngles.setSelected(false);
            }
        });
        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selecao = "Selecionado: ";

                if (ckIngles.isSelected()) {
                    selecao += "\nInglês";
                }
                if (ckInformatica.isSelected()) {
                    selecao += "\nInformática";
                }

                JOptionPane.showMessageDialog(null, selecao);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                UsandoInterfaceGrafica2 frame = new UsandoInterfaceGrafica2();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation((tela.width - frame.getSize().width) / 2,
                        (tela.height - frame.getSize().height) / 2);
                frame.setVisible(true);

            }
        });

    }
}
