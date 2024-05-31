package TelasJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;

public class TelaLogin {

	private JFrame frmTelaLogin;
	private JTextField txtUsuario;
	private JPasswordField passwordField_Senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
					window.frmTelaLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaLogin = new JFrame();
		frmTelaLogin.setTitle("Tela Login");
		frmTelaLogin.setBounds(100, 100, 572, 566);
		frmTelaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTelaLogin.getContentPane().setLayout(null);
		
		//centralizar a janela(frame)
		frmTelaLogin.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Usuário: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(57, 139, 416, 39);
		frmTelaLogin.getContentPane().add(lblNewLabel);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUsuario.setBounds(57, 189, 416, 33);
		frmTelaLogin.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha: ");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSenha.setBounds(57, 244, 416, 39);
		frmTelaLogin.getContentPane().add(lblSenha);
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//getText - pega o texto que está no campo Nome
				if(txtUsuario.getText().equals("Murilo") && passwordField_Senha.getText().equals("123")) {
					JOptionPane.showMessageDialog(null,"Usuário logado com sucesso!");
				}else {
					JOptionPane.showMessageDialog(null,"Usuário e/ou senha inválidos");
				}
			}
		});
		btnLogar.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnLogar.setBounds(57, 396, 416, 50);
		frmTelaLogin.getContentPane().add(btnLogar);
		
		passwordField_Senha = new JPasswordField();
		passwordField_Senha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField_Senha.setBounds(57, 294, 416, 33);
		frmTelaLogin.getContentPane().add(passwordField_Senha);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setIcon(new ImageIcon(TelaLogin.class.getResource("/Imagens/Usuario.png")));
		lblNewLabel_1.setBounds(206, 32, 93, 77);
		frmTelaLogin.getContentPane().add(lblNewLabel_1);
	}
}
