package TelasJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;

public class Mascara_Data_Cpf_Cnpj_Telefone {

	private JFrame frame;
	private JLabel lblCpf;
	private JLabel lblCnpj;
	private JLabel lblTelefone;
	
	// private - tipo privado
	// static - espaço fixo, único na memória
	private static MaskFormatter mascaraData;
	private static MaskFormatter mascaraCPF;
	private static MaskFormatter mascaraCNPJ;
	private static MaskFormatter mascaraTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mascara_Data_Cpf_Cnpj_Telefone window = new Mascara_Data_Cpf_Cnpj_Telefone();
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
	public Mascara_Data_Cpf_Cnpj_Telefone() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 574, 572);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Data");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(25, 44, 402, 25);
		frame.getContentPane().add(lblNewLabel);
		
		lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCpf.setBounds(25, 146, 402, 25);
		frame.getContentPane().add(lblCpf);
		
		lblCnpj = new JLabel("CNPJ");
		lblCnpj.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCnpj.setBounds(25, 245, 402, 25);
		frame.getContentPane().add(lblCnpj);
		
		lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTelefone.setBounds(25, 346, 402, 25);
		frame.getContentPane().add(lblTelefone);
		
		JFormattedTextField txtData = new JFormattedTextField( arrumaMarcaraData() );
		txtData.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtData.setBounds(25, 80, 402, 33);
		frame.getContentPane().add(txtData);
		
		JFormattedTextField txtCPF = new JFormattedTextField( arrumaMarcaraCPF() );
		txtCPF.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtCPF.setBounds(25, 182, 402, 33);
		frame.getContentPane().add(txtCPF);
		
		JFormattedTextField txtCNPJ = new JFormattedTextField( arrumaMarcaraCNPJ() );
		txtCNPJ.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtCNPJ.setBounds(25, 281, 402, 33);
		frame.getContentPane().add(txtCNPJ);
		
		JFormattedTextField txtTelefone = new JFormattedTextField( arrumaMarcaraTelefone() );
		txtTelefone.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtTelefone.setBounds(25, 382, 402, 33);
		frame.getContentPane().add(txtTelefone);
	}
	
	//Método que cria a máscara
	public static MaskFormatter arrumaMarcaraData() {
		// # - significa que o java vai pegar um número entre 0 e 9
		// try catch = Tratamento de erro
		try {
			mascaraData = new MaskFormatter("##/##/####");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Substituir tudo que é # por _ (underline)
		mascaraData.setPlaceholderCharacter('_');
		
		return mascaraData;
	}
	
	public static MaskFormatter arrumaMarcaraCPF() {
		// # - significa que o java vai pegar um número entre 0 e 9
		// try catch = Tratamento de erro
		try {
			mascaraCPF = new MaskFormatter("###.###.###-##");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Substituir tudo que é # por _ (underline)
		mascaraCPF.setPlaceholderCharacter('_');
		
		return mascaraCPF;
	}
	
	public static MaskFormatter arrumaMarcaraCNPJ() {
		// # - significa que o java vai pegar um número entre 0 e 9
		// try catch = Tratamento de erro
		try {
			mascaraCNPJ = new MaskFormatter("##.###.###/####-##"); 
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Substituir tudo que é # por _ (underline)
		mascaraCNPJ.setPlaceholderCharacter('_');
		
		return mascaraCNPJ;
	}
	
	public static MaskFormatter arrumaMarcaraTelefone() {
		// # - significa que o java vai pegar um número entre 0 e 9
		// try catch = Tratamento de erro
		try {
			mascaraTelefone = new MaskFormatter("(##) # ####-####"); 
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Substituir tudo que é # por _ (underline)
		mascaraTelefone.setPlaceholderCharacter('_');
		
		return mascaraTelefone;
	}
}
