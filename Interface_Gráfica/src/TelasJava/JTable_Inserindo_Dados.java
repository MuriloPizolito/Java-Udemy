package TelasJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JTable_Inserindo_Dados {

	private JFrame frmTrabalhandoComJtable;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JTextField txtIdade;
	private JTable tabelaNomes;
	private JButton btnSalvar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTable_Inserindo_Dados window = new JTable_Inserindo_Dados();
					window.frmTrabalhandoComJtable.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JTable_Inserindo_Dados() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTrabalhandoComJtable = new JFrame();
		frmTrabalhandoComJtable.setTitle("Trabalhando com JTable");
		frmTrabalhandoComJtable.setBounds(100, 100, 638, 564);
		frmTrabalhandoComJtable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTrabalhandoComJtable.getContentPane().setLayout(null);
		
		// deixar a janela centralizada na tela quando executar
		frmTrabalhandoComJtable.setLocationRelativeTo(null);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNome.setBounds(26, 74, 168, 34);
		frmTrabalhandoComJtable.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(26, 37, 149, 26);
		frmTrabalhandoComJtable.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sobrenome:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(218, 37, 149, 26);
		frmTrabalhandoComJtable.getContentPane().add(lblNewLabel_1);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSobrenome.setBounds(218, 74, 168, 34);
		frmTrabalhandoComJtable.getContentPane().add(txtSobrenome);
		txtSobrenome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Idade:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(419, 37, 149, 24);
		frmTrabalhandoComJtable.getContentPane().add(lblNewLabel_2);
		
		txtIdade = new JTextField();
		txtIdade.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtIdade.setBounds(419, 72, 168, 35);
		frmTrabalhandoComJtable.getContentPane().add(txtIdade);
		txtIdade.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 132, 561, 274);
		frmTrabalhandoComJtable.getContentPane().add(scrollPane);
		
		tabelaNomes = new JTable();
		tabelaNomes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		scrollPane.setViewportView(tabelaNomes);;
		tabelaNomes.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "Sobrenome", "Idade"
			}
		));
		
		// definindo largura das linhas
		tabelaNomes.setRowHeight(30);
		
		btnSalvar = new JButton("Inserir Linha");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//DefaultTableModel - biblioteca para trabalharmos com a tabela
				DefaultTableModel linha = (DefaultTableModel)tabelaNomes.getModel();
				
				// Adiciona uma nova linha para a tabela
				linha.addRow(new Object[] {txtNome.getText(), txtSobrenome.getText(), txtIdade.getText()});
				
				// limpando o texto depois que adiciona na tabela
				txtNome.setText("");
				txtSobrenome.setText("");
				txtIdade.setText("");
				
			}
		});
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnSalvar.setBounds(403, 417, 184, 48);
		frmTrabalhandoComJtable.getContentPane().add(btnSalvar);
		
	}
}
