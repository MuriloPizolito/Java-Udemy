package TelasJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JTable_Alterar_Dados {

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
					JTable_Alterar_Dados window = new JTable_Alterar_Dados();
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
	public JTable_Alterar_Dados() {
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
		
		// deixar a janela centralizada na tela quando executar
		frmTrabalhandoComJtable.setLocationRelativeTo(null);
		frmTrabalhandoComJtable.getContentPane().setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setBounds(26, 74, 168, 34);
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmTrabalhandoComJtable.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome: ");
		lblNewLabel.setBounds(26, 37, 149, 26);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmTrabalhandoComJtable.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sobrenome:");
		lblNewLabel_1.setBounds(218, 37, 149, 26);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmTrabalhandoComJtable.getContentPane().add(lblNewLabel_1);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setBounds(218, 74, 168, 34);
		txtSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmTrabalhandoComJtable.getContentPane().add(txtSobrenome);
		txtSobrenome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Idade:");
		lblNewLabel_2.setBounds(419, 37, 149, 24);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmTrabalhandoComJtable.getContentPane().add(lblNewLabel_2);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(419, 72, 168, 35);
		txtIdade.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmTrabalhandoComJtable.getContentPane().add(txtIdade);
		txtIdade.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 132, 561, 274);
		frmTrabalhandoComJtable.getContentPane().add(scrollPane);
		
		tabelaNomes = new JTable();
		tabelaNomes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//DefaultTableModel - biblioteca para trabalharmos com a tabela
				DefaultTableModel configuracoesTabela = (DefaultTableModel)tabelaNomes.getModel();
				
				// pega o numero da linha selecionada
				int selecionaNumeroLinha = tabelaNomes.getSelectedRow();
				
				// selecionaNumeroLinha- número da linha
				// 0 - número da coluna
				// getValueAt- pega o valor da linha
				// toString - converte o objeto para texto
				txtNome.setText(configuracoesTabela.getValueAt(selecionaNumeroLinha, 0).toString());
				txtSobrenome.setText(configuracoesTabela.getValueAt(selecionaNumeroLinha, 1).toString());
				txtIdade.setText(configuracoesTabela.getValueAt(selecionaNumeroLinha, 2).toString());
			}
		});
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
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(348, 417, 184, 48);
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
		frmTrabalhandoComJtable.getContentPane().add(btnSalvar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//DefaultTableModel - biblioteca para trabalharmos com a tabela
				DefaultTableModel modelo = (DefaultTableModel)tabelaNomes.getModel();
				
				// pega o número da linha que esta selecionada
				int linha = tabelaNomes.getSelectedRow();
				
				if (linha >= 0 ) {
					// modelo - tabela
					// setValueAt - Alterar/colocar uma informação 
					// txtNome.getText() - pegando o texto que esta no campo do txt
					// linha - número da linha que eu selecionei
					// 0 - número da coluna que vou alterar
					modelo.setValueAt(txtNome.getText(), linha, 0);
					modelo.setValueAt(txtSobrenome.getText(), linha, 1);
					modelo.setValueAt(txtIdade.getText(), linha, 2);
				}else {
					JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha para alterar a informação.");
				}
				
			}
		});
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnAlterar.setBounds(83, 417, 184, 48);
		frmTrabalhandoComJtable.getContentPane().add(btnAlterar);
		
	}
}
