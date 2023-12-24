package Aula_18;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class UsandoInterfaceGrafica extends JFrame {
	
	private JLabel lbPeso;
	private JLabel lbAltura;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JButton btnCalcular;
	private static UsandoInterfaceGrafica frame;
	
	public UsandoInterfaceGrafica() {
// método construtor
		inicializarComponente();
		definirEventos();
	}
	
	private void inicializarComponente() {
// definindo propriedades da tela
		setTitle("Cálculo de IMC");
		setBounds(0, 0, 250, 200);
		setLayout(null);
// estanciando os componentes
		lbPeso = new JLabel("Peso: ");
		lbAltura = new JLabel("Altura: ");
		txtPeso = new JTextField(5);
// 5 é a quantidade de caracteres
		txtAltura = new JTextField(5);
		btnCalcular = new JButton("Cálcular");
// posicionando componentes
		lbPeso.setBounds(30, 30, 80, 25);
		lbAltura.setBounds(30, 75, 80, 25);
		txtPeso.setBounds(100, 30, 120, 25);
		txtAltura.setBounds(100, 75, 120, 25);
		btnCalcular.setBounds(125, 120, 100, 25);
// adcionar os componentes na tela
		add(lbPeso);
		add(lbAltura);
		add(txtPeso);
		add(txtAltura);
		add(btnCalcular);
		
	}
	
	private void definirEventos() {
		btnCalcular.addActionListener(new ActionListener() {
			double peso, altura, imc;
			@Override
			public void actionPerformed(ActionEvent e) {
				peso = Double.parseDouble(txtPeso.getText());
				altura = Double.parseDouble(txtAltura.getText());
				
				imc = peso / (Math.pow(altura, 2));
				
				JOptionPane.showMessageDialog(null, "Valor do seu IMC:" + imc);
			}
		});
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				frame = new UsandoInterfaceGrafica();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
				frame.setLocation((tela.width - frame.getSize().width/2), 
								  (tela.height - frame.getSize().height/2));
				frame.setVisible(true);
			}
		});
	}

}
