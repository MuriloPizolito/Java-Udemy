package TelasJFrame;

import java.awt.EventQueue;
import java.awt.GraphicsEnvironment;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.Dados_agenda;
import Classes.Operacoes_no_Banco_de_Dados;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Alterar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAlterarDados_Id;
	private JTextField txtAlterarDados_Nome;
	private JTextField txtAlterarDados_Telefone;
	private JTextField txtAlterarDados_DataNascimento;
	private JTextField txtAlterarDados_Email;
	private JTextField txtAlterarDados_Endereco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alterar frame = new Alterar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Alterar() {
		setTitle("Alterar Dados");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		// point - representa o local no espaço de coordenada x e y
		Point centro = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
		
		int largura = 800;
		int altura = 500;
		
		// centralizar no meio da tela
		setBounds(centro.x - largura / 2, centro.y - altura / 2, 810, 614);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(36, 38, 230, 40);
		contentPane.add(lblNewLabel);
		
		txtAlterarDados_Id = new JTextField();
		txtAlterarDados_Id.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtAlterarDados_Id.setBounds(36, 89, 267, 33);
		contentPane.add(txtAlterarDados_Id);
		txtAlterarDados_Id.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNome.setBounds(36, 148, 230, 40);
		contentPane.add(lblNome);
		
		txtAlterarDados_Nome = new JTextField();
		txtAlterarDados_Nome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtAlterarDados_Nome.setColumns(10);
		txtAlterarDados_Nome.setBounds(36, 199, 580, 33);
		contentPane.add(txtAlterarDados_Nome);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTelefone.setBounds(36, 261, 230, 40);
		contentPane.add(lblTelefone);
		
		txtAlterarDados_Telefone = new JTextField();
		txtAlterarDados_Telefone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtAlterarDados_Telefone.setColumns(10);
		txtAlterarDados_Telefone.setBounds(36, 312, 267, 33);
		contentPane.add(txtAlterarDados_Telefone);
		
		JLabel lblNewLabel_3 = new JLabel("Data de Nascimento:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_3.setBounds(36, 460, 230, 40);
		contentPane.add(lblNewLabel_3);
		
		txtAlterarDados_DataNascimento = new JTextField();
		txtAlterarDados_DataNascimento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtAlterarDados_DataNascimento.setColumns(10);
		txtAlterarDados_DataNascimento.setBounds(36, 501, 267, 33);
		contentPane.add(txtAlterarDados_DataNascimento);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblEmail.setBounds(349, 261, 230, 40);
		contentPane.add(lblEmail);
		
		txtAlterarDados_Email = new JTextField();
		txtAlterarDados_Email.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtAlterarDados_Email.setColumns(10);
		txtAlterarDados_Email.setBounds(349, 312, 267, 33);
		contentPane.add(txtAlterarDados_Email);
		
		JLabel lblNewLabel_3_1 = new JLabel("Endereço:");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_3_1.setBounds(36, 367, 230, 40);
		contentPane.add(lblNewLabel_3_1);
		
		txtAlterarDados_Endereco = new JTextField();
		txtAlterarDados_Endereco.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtAlterarDados_Endereco.setColumns(10);
		txtAlterarDados_Endereco.setBounds(36, 407, 580, 33);
		contentPane.add(txtAlterarDados_Endereco);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Dados_agenda objeto = new Dados_agenda();
				objeto.setId(Integer.parseInt(txtAlterarDados_Id.getText()));
				objeto.setNome(txtAlterarDados_Nome.getText());
				objeto.setTelefone(txtAlterarDados_Telefone.getText());
				objeto.setEmail(txtAlterarDados_Email.getText());
				objeto.setEndereco(txtAlterarDados_Endereco.getText());
				objeto.setDataNascimento(txtAlterarDados_DataNascimento.getText());
				
				
				Operacoes_no_Banco_de_Dados salvarDados = new Operacoes_no_Banco_de_Dados();
				
				salvarDados.Alterar(objeto);
				
				dispose(); // fechando a tela
				
			}
		});
		btnAlterar.setIcon(new ImageIcon(Alterar.class.getResource("/Imagens/alterar.png")));
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnAlterar.setBounds(583, 38, 165, 51);
		contentPane.add(btnAlterar);
	}

	public void recebendo (String Id, String Nome, String Tel, String Email, String End, String Nasc) {
		
		txtAlterarDados_Id.setText(Id);
		txtAlterarDados_Nome.setText(Nome);
		txtAlterarDados_Telefone.setText(Tel);
		txtAlterarDados_Email.setText(Email);
		txtAlterarDados_Endereco.setText(End);
		txtAlterarDados_DataNascimento.setText(Nasc);
		
	}
}
