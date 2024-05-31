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
import java.lang.reflect.Array;
import java.util.ArrayList;

public class JTable_Soma_Itens_e_Conta_Linhas {

	private JFrame frmTrabalhandoComJtable;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JTextField txtIdade;
	private JTable tabelaNomes;
	private JButton btnSalvar;
	private JTextField txtSalarios;
	private JTextField txtQtdLinhas;
	private JLabel lblNewLabel_3;
	private JTextField txtSalario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTable_Soma_Itens_e_Conta_Linhas window = new JTable_Soma_Itens_e_Conta_Linhas();
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
	public JTable_Soma_Itens_e_Conta_Linhas() {
		initialize();
		
		// popular as informacoes
		populaInfoJTable();
		
		// chamo a função/método que soma os salários e conta as linhas da tabela
		Somar_Contar();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTrabalhandoComJtable = new JFrame();
		frmTrabalhandoComJtable.setTitle("Trabalhando com JTable");
		frmTrabalhandoComJtable.setBounds(100, 100, 869, 564);
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
		txtIdade.setBounds(419, 72, 164, 35);
		txtIdade.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmTrabalhandoComJtable.getContentPane().add(txtIdade);
		txtIdade.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 132, 557, 262);
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
				txtSalario.setText(configuracoesTabela.getValueAt(selecionaNumeroLinha, 3).toString());
			}
		});
		tabelaNomes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		scrollPane.setViewportView(tabelaNomes);;
		tabelaNomes.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "Sobrenome", "Idade", "Sal\u00E1rio"
			}
		));
		
		// definindo largura das linhas
		tabelaNomes.setRowHeight(30);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(224, 417, 162, 48);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//DefaultTableModel - biblioteca para trabalharmos com a tabela
				DefaultTableModel linha = (DefaultTableModel)tabelaNomes.getModel();
				
				// Adiciona uma nova linha para a tabela
				linha.addRow(new Object[] {txtNome.getText(), txtSobrenome.getText(), txtIdade.getText(), txtSalario.getText()});
				
				// limpando o texto depois que adiciona na tabela
				txtNome.setText("");
				txtSobrenome.setText("");
				txtIdade.setText("");
				txtSalario.setText("");
				
				// Recalcular tudo de novo
				Somar_Contar();
				
			}
		});
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		frmTrabalhandoComJtable.getContentPane().add(btnSalvar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(26, 417, 168, 48);
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
					modelo.setValueAt(txtSalario.getText(), linha, 3);
					
					// Recalcular tudo de novo
					Somar_Contar();
					
				}else {
					JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha para alterar a informação.");
				}
				
			}
		});
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		frmTrabalhandoComJtable.getContentPane().add(btnAlterar);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.setBounds(419, 417, 168, 48);
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DefaultTableModel - biblioteca para trabalharmos com a tabela
				DefaultTableModel linha = (DefaultTableModel)tabelaNomes.getModel();
				
				// tratamento de erro
				try {
					// pega o número da linha que esta selecionada
					int numeroLinhaItem = tabelaNomes.getSelectedRow();
					
					// removeRow - remove a linha selecionada
					linha.removeRow(numeroLinhaItem);
					
					// Recalcular tudo de novo
					Somar_Contar();
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Não há nenhuma linha selecionada.");
					}
				}
			});
		btnDeletar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		frmTrabalhandoComJtable.getContentPane().add(btnDeletar);
		
		JLabel lblNewLabel_2_1 = new JLabel("Soma Salários:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(623, 142, 149, 24);
		frmTrabalhandoComJtable.getContentPane().add(lblNewLabel_2_1);
		
		txtSalarios = new JTextField();
		txtSalarios.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSalarios.setColumns(10);
		txtSalarios.setBounds(623, 177, 168, 35);
		frmTrabalhandoComJtable.getContentPane().add(txtSalarios);
		
		JLabel lblNewLabel_2_2 = new JLabel("Linhas:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(623, 242, 149, 24);
		frmTrabalhandoComJtable.getContentPane().add(lblNewLabel_2_2);
		
		txtQtdLinhas = new JTextField();
		txtQtdLinhas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtQtdLinhas.setColumns(10);
		txtQtdLinhas.setBounds(623, 277, 168, 35);
		frmTrabalhandoComJtable.getContentPane().add(txtQtdLinhas);
		
		lblNewLabel_3 = new JLabel("Salário:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(623, 38, 149, 24);
		frmTrabalhandoComJtable.getContentPane().add(lblNewLabel_3);
		
		txtSalario = new JTextField();
		txtSalario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSalario.setColumns(10);
		txtSalario.setBounds(623, 73, 164, 35);
		frmTrabalhandoComJtable.getContentPane().add(txtSalario);
		
	}
	
	// Classe de clientes
	public class Cliente{
		
		// Atributos
		public String nome;
		public String sobrenome;
		public String idade;
		public double salario;
		
		public Cliente (String n, String sn, String i, double s) {
			this.nome = n;
			this.sobrenome = sn;
			this.idade = i;
			this.salario = s;

		}
		
	}
	
	//ArrayList
	// E - extend 
	public <E> ArrayList<E> listaClientes(){
		
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		Cliente cliente1 = new Cliente ("Murilo", "Silva", "19", 100);
		Cliente cliente2 = new Cliente ("Carlos", "Pires", "35", 200);
		Cliente cliente3 = new Cliente ("Viviane", "Gomes", "51", 300);
		Cliente cliente4 = new Cliente ("Pedro", "Silva", "22", 400);
		Cliente cliente5 = new Cliente ("Lionel", "Messi", "36", 500);
		Cliente cliente6 = new Cliente ("ALice", "Almeida", "18", 600);
		Cliente cliente7 = new Cliente ("Wellington", "Rato", "32", 700);
		Cliente cliente8 = new Cliente ("Carla", "Nunes", "53", 800);
		lista.add(cliente1);
		lista.add(cliente2);
		lista.add(cliente3);
		lista.add(cliente4);
		lista.add(cliente5);
		lista.add(cliente6);
		lista.add(cliente7);
		lista.add(cliente8);
		
		return (ArrayList<E>) lista;
		
	}
	
	public void populaInfoJTable () {
		// DefaultTableModel - Implementa a interface da table
		DefaultTableModel informacao  = (DefaultTableModel) tabelaNomes.getModel();
		
		ArrayList<Cliente> lista = listaClientes();
		Object linha [] = new Object [4];
		
		for (int coluna = 0; coluna < lista.size(); coluna++) {
			
			linha [0] = lista.get(coluna).nome; 
			linha [1] = lista.get(coluna).sobrenome; 
			linha [2] = lista.get(coluna).idade; 
			linha [3] = lista.get(coluna).salario; 
			
			// adiciono as infos de cada coluna na linha
			informacao.addRow(linha);
		}
	}
	
	public void Somar_Contar () {
		
		double soma = 0;
		int qtdLinhas = 0;
		
		// tabelaNomes.getRowCount()- Contar a quantidade de linhas da tabelas
		for (int linha = 0; linha < tabelaNomes.getRowCount(); linha++) {
			
			// pegando do tipo string e convertendo para double e depois armazenando na variavel soma
			soma = soma + Double.parseDouble(tabelaNomes.getValueAt(linha, 3).toString());

		}
		
		// imprimir como texto no campo de salario
		txtSalarios.setText(Double.toString(soma));
		
		// conto quantas linha tem na tabela
		qtdLinhas = tabelaNomes.getRowCount();
		
		// imprimir como texto no campo de salario
		txtQtdLinhas.setText(Integer.toString(qtdLinhas));
		
	}
	
}
