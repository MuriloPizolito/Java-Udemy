package TelasJFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import Classes.Dados_agenda;
import Classes.Operacoes_no_Banco_de_Dados;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Point;

import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Cadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtEndereco;
	
	public static MaskFormatter txtTelefone;
	public static MaskFormatter txtDataNascimento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
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
	public Cadastro() {
		setTitle("Cadastrar Dados");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		// point - representa o local no espaço de coordenada x e y
		Point centro = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
		
		int largura = 800;
		int altura = 500;
		
		// centralizar no meio da tela
		setBounds(centro.x - largura / 2, centro.y - altura / 2, 877, 621);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(38, 36, 220, 33);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);
		
		txtId = new JTextField();
		txtId.setBounds(38, 80, 220, 33);
		txtId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtId.setEnabled(false);
		txtId.setEditable(false);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(38, 134, 220, 33);
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(38, 178, 517, 33);
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNome.setColumns(10);
		contentPane.add(txtNome);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(38, 232, 220, 33);
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblTelefone);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(286, 232, 220, 33);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(285, 276, 270, 33);
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtEmail.setColumns(10);
		contentPane.add(txtEmail);
		
		JFormattedTextField txtTelefone = new JFormattedTextField(  arrumaMascaraTelefone() );
		txtTelefone.setBounds(38, 276, 220, 33);
		txtTelefone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(txtTelefone);
		
		JLabel lblEndereol = new JLabel("Endereço:");
		lblEndereol.setBounds(38, 332, 220, 33);
		lblEndereol.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblEndereol);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(38, 376, 517, 33);
		txtEndereco.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtEndereco.setColumns(10);
		contentPane.add(txtEndereco);
		
		JFormattedTextField txtDataNascimento = new JFormattedTextField( arrumaMascaraDataNascimento() );
		txtDataNascimento.setBounds(38, 461, 220, 33);
		txtDataNascimento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(txtDataNascimento);
		
		JLabel lblDataNascimento = new JLabel("Data de Nascimento:");
		lblDataNascimento.setBounds(38, 420, 220, 30);
		lblDataNascimento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblDataNascimento);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(610, 453, 177, 49);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					// Instanciando a classe dados agenda
					Dados_agenda objeto = new Dados_agenda();
					objeto.setNome(txtNome.getText());
					objeto.setTelefone(txtTelefone.getText());
					objeto.setEmail(txtEmail.getText());
					objeto.setEndereco(txtEndereco.getText());
					objeto.setDataNascimento(txtDataNascimento.getText());
					
					// instanciando a classe operacoes no banco de dados, para usar os métodos dela
					Operacoes_no_Banco_de_Dados salvarDados = new Operacoes_no_Banco_de_Dados();
					salvarDados.Cadastrar(objeto);
					
					dispose();// fecha o formulario apos salvar os dados
					
				} catch (Exception trata) {
					JOptionPane.showMessageDialog(null, "Erro ao salvar os dados."+ trata);
				}
				

				
			}
		});
		btnSalvar.setIcon(new ImageIcon(Cadastro.class.getResource("/Imagens/salvar.png")));
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(btnSalvar);
	}
	
	public static MaskFormatter arrumaMascaraTelefone() {
		
		
		try {
			txtTelefone = new MaskFormatter("(##) #####-####");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		txtTelefone.setPlaceholderCharacter('_'); // substitui os # por um _
	
		return txtTelefone;
	}
	
	public static MaskFormatter arrumaMascaraDataNascimento() {
		
		
		try {
			txtDataNascimento = new MaskFormatter("##/##/####");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		txtDataNascimento.setPlaceholderCharacter('_'); // substitui os # por um _
	
		return txtDataNascimento;
	}
	
}
