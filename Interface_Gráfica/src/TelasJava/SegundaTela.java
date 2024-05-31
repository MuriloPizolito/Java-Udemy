package TelasJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SegundaTela {

	private JFrame frmUnindoNomeE;
	private JTextField txtNomeSobrenome;
	private JTextField txtSobrenome;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SegundaTela window = new SegundaTela();
					window.frmUnindoNomeE.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SegundaTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUnindoNomeE = new JFrame();
		frmUnindoNomeE.setTitle("Unindo Nome e Sobrenome");
		frmUnindoNomeE.setBounds(100, 100, 577, 544);
		frmUnindoNomeE.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUnindoNomeE.getContentPane().setLayout(null);
		
		// Centralizar a tela
		frmUnindoNomeE.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(98, 31, 87, 54);
		frmUnindoNomeE.getContentPane().add(lblNewLabel);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSobrenome.setBounds(98, 142, 118, 54);
		frmUnindoNomeE.getContentPane().add(lblSobrenome);
		
		JLabel lblNomeCompleto = new JLabel("Nome completo");
		lblNomeCompleto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNomeCompleto.setBounds(98, 263, 170, 54);
		frmUnindoNomeE.getContentPane().add(lblNomeCompleto);
		
		txtNomeSobrenome = new JTextField();
		txtNomeSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtNomeSobrenome.setColumns(10);
		txtNomeSobrenome.setBounds(98, 312, 367, 38);
		frmUnindoNomeE.getContentPane().add(txtNomeSobrenome);
		
		JButton btnUnir = new JButton("Unir nome e sobrenome");
		btnUnir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	txtNome.getText - pegando o texto que tem no campo Nome
				txtNomeSobrenome.setText(txtNome.getText() + " " + txtSobrenome.getText());	
			}
		});
		btnUnir.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnUnir.setBounds(98, 402, 367, 47);
		frmUnindoNomeE.getContentPane().add(btnUnir);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtSobrenome.setColumns(10);
		txtSobrenome.setBounds(98, 192, 367, 38);
		frmUnindoNomeE.getContentPane().add(txtSobrenome);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtNome.setColumns(10);
		txtNome.setBounds(98, 79, 367, 38);
		frmUnindoNomeE.getContentPane().add(txtNome);
	}
}
