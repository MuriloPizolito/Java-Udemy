package TelasJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JRadioButton {

	private JFrame frame;
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JTextField txtResultado;
	private JTextField txtItem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioButton window = new JRadioButton();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JRadioButton() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 573, 573);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		javax.swing.JRadioButton rbAdicao = new javax.swing.JRadioButton("Adição");
		rbAdicao.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rbAdicao.setBounds(296, 92, 162, 30);
		frame.getContentPane().add(rbAdicao);
		
		javax.swing.JRadioButton rbSubtracao = new javax.swing.JRadioButton("Subtração");
		rbSubtracao.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rbSubtracao.setBounds(296, 141, 162, 30);
		frame.getContentPane().add(rbSubtracao);
		
		javax.swing.JRadioButton rbDivisao = new javax.swing.JRadioButton("Divisão");
		rbDivisao.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rbDivisao.setBounds(296, 192, 162, 30);
		frame.getContentPane().add(rbDivisao);
		
		javax.swing.JRadioButton rbMultiplicacao = new javax.swing.JRadioButton("Multiplicação");
		rbMultiplicacao.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rbMultiplicacao.setBounds(296, 243, 162, 30);
		frame.getContentPane().add(rbMultiplicacao);
		
		JLabel lblNmero = new JLabel("Número 1:");
		lblNmero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNmero.setBounds(37, 48, 129, 39);
		frame.getContentPane().add(lblNmero);
		
		txtNumero1 = new JTextField();
		txtNumero1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtNumero1.setBounds(37, 88, 162, 39);
		frame.getContentPane().add(txtNumero1);
		txtNumero1.setColumns(10);
		
		JLabel lblNmero_4 = new JLabel("Número 2:");
		lblNmero_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNmero_4.setBounds(37, 165, 129, 39);
		frame.getContentPane().add(lblNmero_4);
		
		txtNumero2 = new JTextField();
		txtNumero2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtNumero2.setColumns(10);
		txtNumero2.setBounds(37, 204, 162, 39);
		frame.getContentPane().add(txtNumero2);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblResultado.setBounds(37, 272, 129, 39);
		frame.getContentPane().add(lblResultado);
		
		txtResultado = new JTextField();
		txtResultado.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtResultado.setColumns(10);
		txtResultado.setBounds(37, 311, 162, 39);
		frame.getContentPane().add(txtResultado);
		
		JLabel lblItemSelecionado = new JLabel("Item selecionado");
		lblItemSelecionado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblItemSelecionado.setBounds(37, 383, 162, 39);
		frame.getContentPane().add(lblItemSelecionado);
		
		txtItem = new JTextField();
		txtItem.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtItem.setColumns(10);
		txtItem.setBounds(37, 419, 162, 39);
		frame.getContentPane().add(txtItem);
		
		// ação botao de adição
		rbAdicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rbAdicao.setSelected(true);
				rbSubtracao.setSelected(false);
				rbDivisao.setSelected(false);
				rbMultiplicacao.setSelected(false);
				
				double numero1 = Double.parseDouble(txtNumero1.getText());
				double numero2 = Double.parseDouble(txtNumero2.getText());
				
				txtResultado.setText(String.valueOf(numero1 + numero2));
				txtItem.setText("Adição");
				
			}
		});

		// ação botao de subtração
		rbSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rbAdicao.setSelected(false);
				rbSubtracao.setSelected(true);
				rbDivisao.setSelected(false);
				rbMultiplicacao.setSelected(false);
				
				double numero1 = Double.parseDouble(txtNumero1.getText());
				double numero2 = Double.parseDouble(txtNumero2.getText());
				
				txtResultado.setText(String.valueOf(numero1 - numero2));
				txtItem.setText("Subtração");
				
			}
		});
		
		// ação botao de divisão
		rbDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rbAdicao.setSelected(false);
				rbSubtracao.setSelected(false);
				rbDivisao.setSelected(true);
				rbMultiplicacao.setSelected(false);
				
				double numero1 = Double.parseDouble(txtNumero1.getText());
				double numero2 = Double.parseDouble(txtNumero2.getText());
				
				txtResultado.setText(String.valueOf(numero1 / numero2));
				txtItem.setText("Divisão");
				
			}
		});
		
		// ação botao de multiplicação
		rbMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rbAdicao.setSelected(false);
				rbSubtracao.setSelected(false);
				rbDivisao.setSelected(false);
				rbMultiplicacao.setSelected(true);
				
				double numero1 = Double.parseDouble(txtNumero1.getText());
				double numero2 = Double.parseDouble(txtNumero2.getText());
				
				txtResultado.setText(String.valueOf(numero1 * numero2));
				txtItem.setText("Multiplicação");
				
			}
		});
	}
}
