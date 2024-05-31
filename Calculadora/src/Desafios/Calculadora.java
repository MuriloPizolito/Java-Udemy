package Desafios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculadora {

	private JFrame frmCalculadora;
	private JTextField txtResultado;
	// variaveis para as operações
	Double numero1, numero2;
	
	String tipoOperacao = "nada";
	private JTextField txtEtapas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 568, 489);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		// Centralizar a tela
		frmCalculadora.setLocationRelativeTo(null);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtResultado.setBounds(27, 73, 496, 55);
		frmCalculadora.getContentPane().add(txtResultado);
		txtResultado.setColumns(10);
		
		JButton btnSete = new JButton("7");
		btnSete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "7");
			}
		});
		btnSete.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSete.setBounds(27, 139, 81, 59);
		frmCalculadora.getContentPane().add(btnSete);
		
		JButton btnOito = new JButton("8");
		btnOito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "8");
			}
		});
		btnOito.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOito.setBounds(130, 139, 81, 59);
		frmCalculadora.getContentPane().add(btnOito);
		
		JButton btnNove = new JButton("9");
		btnNove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "9");
			}
		});
		btnNove.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNove.setBounds(229, 139, 81, 59);
		frmCalculadora.getContentPane().add(btnNove);
		
		JButton btnQuatro = new JButton("4");
		btnQuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "4");
			}
		});
		btnQuatro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnQuatro.setBounds(27, 220, 81, 59);
		frmCalculadora.getContentPane().add(btnQuatro);
		
		JButton btnCinco = new JButton("5");
		btnCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "5");
			}
		});
		btnCinco.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCinco.setBounds(130, 220, 81, 59);
		frmCalculadora.getContentPane().add(btnCinco);
		
		JButton btnSeis = new JButton("6");
		btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "6");
			}
		});
		btnSeis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSeis.setBounds(229, 220, 81, 59);
		frmCalculadora.getContentPane().add(btnSeis);
		
		JButton btnUm = new JButton("1");
		btnUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// pega os números já digitados e acrescenta o 0 no final
				txtResultado.setText(txtResultado.getText() + "1");				
			}
		});
		btnUm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnUm.setBounds(27, 304, 81, 59);
		frmCalculadora.getContentPane().add(btnUm);
		
		JButton btnDois = new JButton("2");
		btnDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "2");
			}
		});
		btnDois.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDois.setBounds(130, 304, 81, 59);
		frmCalculadora.getContentPane().add(btnDois);
		
		JButton btnTres = new JButton("3");
		btnTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "3");
			}
		});
		btnTres.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTres.setBounds(229, 304, 81, 59);
		frmCalculadora.getContentPane().add(btnTres);
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// pega os números já digitados e acrescenta o 0 no final
				txtResultado.setText(txtResultado.getText() + "0");
			}
		});
		btnZero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnZero.setBounds(27, 374, 81, 59);
		frmCalculadora.getContentPane().add(btnZero);
		
		JButton btnPonto = new JButton(".");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + ".");
			}
		});
		btnPonto.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnPonto.setBounds(130, 374, 81, 57);
		frmCalculadora.getContentPane().add(btnPonto);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//quando clicar no igual, o txt de etapas vai receber o que ja tinha nele mais o que estava no resultado
				txtEtapas.setText(txtEtapas.getText() + txtResultado.getText());
				
				// pega o texto do resultado, transforma pra double e armazena na variavel
				numero2 = Double.parseDouble(txtResultado.getText());

				txtResultado.setText("");// limpando o campo do txt resultado	
				
				if (tipoOperacao.equals("Adição")){
					txtResultado.setText(String.valueOf(numero1 + numero2));// convertendo de double para string e colocando no resultado
					
				} else if (tipoOperacao.equals("Subtração")){
					txtResultado.setText(String.valueOf(numero1 - numero2));
					
				} else if (tipoOperacao.equals("Divisão")){
					txtResultado.setText(String.valueOf(numero1 / numero2));
					
				} else if (tipoOperacao.equals("Multiplicação")){
					txtResultado.setText(String.valueOf(numero1 * numero2));
					
				} else {
					JOptionPane.showMessageDialog(null, "Por favor, selecione uma operação");
				}

				
			}
		});
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnIgual.setBounds(229, 374, 183, 57);
		frmCalculadora.getContentPane().add(btnIgual);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// c - limpar
				txtEtapas.setText("");
				txtResultado.setText("");
				tipoOperacao = "nada";
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnC.setBounds(331, 138, 81, 59);
		frmCalculadora.getContentPane().add(btnC);
		
		JButton btnMais = new JButton("+");
		btnMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// junta o texto de etapas com o de resultado
				if (tipoOperacao.equals("nada")) {
					txtEtapas.setText(txtEtapas.getText() + txtResultado.getText());
				} else {
					
				}
				//pega as etapas e coloca o sinal de mais no final
				txtEtapas.setText(txtEtapas.getText() + " + ");
				
				// pega o texto de resultado e converte para double
				numero1 = Double.parseDouble(txtResultado.getText());
				
				// apagando o texto do campo de resultado
				txtResultado.setText("");
				
				tipoOperacao = "Adição";
				
			}
		});
		btnMais.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnMais.setBounds(331, 220, 81, 143);
		frmCalculadora.getContentPane().add(btnMais);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CE - cancel entry, cancela a ultima etapa
				txtResultado.setText("");
				
			}
		});
		btnCe.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnCe.setBounds(435, 138, 81, 59);
		frmCalculadora.getContentPane().add(btnCe);
		
		JButton btnMenos = new JButton("-");
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// junta o texto de etapas com o de resultado
				if (tipoOperacao.equals("nada")) {
					txtEtapas.setText(txtEtapas.getText() + txtResultado.getText());
				} else {
					
				}
				//pega as etapas e coloca o sinal de menos no final
				txtEtapas.setText(txtEtapas.getText() + " - ");
				
				// pega o texto de resultado e converte para double
				numero1 = Double.parseDouble(txtResultado.getText());
				
				// apagando o texto do campo de resultado
				txtResultado.setText("");
				
				tipoOperacao = "Subtração";


			}
		});
		btnMenos.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnMenos.setBounds(435, 219, 81, 59);
		frmCalculadora.getContentPane().add(btnMenos);
		
		JButton btnMultiplicacao = new JButton("x");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// junta o texto de etapas com o de resultado
				if (tipoOperacao.equals("nada")) {
					txtEtapas.setText(txtEtapas.getText() + txtResultado.getText());
				} else {
					
				}
				//pega as etapas e coloca o sinal de mais no final
				txtEtapas.setText(txtEtapas.getText() + " x ");
				
				// pega o texto de resultado e converte para double
				numero1 = Double.parseDouble(txtResultado.getText());
				
				// apagando o texto do campo de resultado
				txtResultado.setText("");
				
				tipoOperacao = "Multiplicação";
				
			}
		});
		btnMultiplicacao.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnMultiplicacao.setBounds(435, 303, 81, 59);
		frmCalculadora.getContentPane().add(btnMultiplicacao);
		
		JButton btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// junta o texto de etapas com o de resultado
				if (tipoOperacao.equals("nada")) {
					txtEtapas.setText(txtEtapas.getText() + txtResultado.getText());
				} else {
					
				}
				//pega as etapas e coloca o sinal de mais no final
				txtEtapas.setText(txtEtapas.getText() + " / ");
				
				// pega o texto de resultado e converte para double
				numero1 = Double.parseDouble(txtResultado.getText());
				
				// apagando o texto do campo de resultado
				txtResultado.setText("");
				
				tipoOperacao = "Divisão";
				
			}
		});
		btnDivisao.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnDivisao.setBounds(435, 373, 81, 59);
		frmCalculadora.getContentPane().add(btnDivisao);
		
		txtEtapas = new JTextField();
		txtEtapas.setEditable(false);
		txtEtapas.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtEtapas.setColumns(10);
		txtEtapas.setBounds(27, 7, 496, 55);
		frmCalculadora.getContentPane().add(txtEtapas);
	}
}
