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

public class JTable_Deletando_Itens {

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
					JTable_Deletando_Itens window = new JTable_Deletando_Itens();
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
	public JTable_Deletando_Itens() {
		initialize();
		
		// popular as informacoes
		populaInfoJTable();
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
		btnSalvar.setBounds(224, 417, 162, 48);
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
				}else {
					JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha para alterar a informação.");
				}
				
			}
		});
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		frmTrabalhandoComJtable.getContentPane().add(btnAlterar);
		
		JButton btnDeletar = new JButton("Deletar");
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
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Não há nenhuma linha selecionada.");
					}
				}
			});
		btnDeletar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnDeletar.setBounds(419, 417, 168, 48);
		frmTrabalhandoComJtable.getContentPane().add(btnDeletar);
		
	}
	
	// Classe de clientes
	public class Cliente{
		
		// Atributos
		public String nome;
		public String sobrenome;
		public String idade;
		
		public Cliente (String n, String sn, String i) {
			this.nome = n;
			this.sobrenome = sn;
			this.idade = i;

		}
		
	}
	
	//ArrayList
	// E - extend 
	public <E> ArrayList<E> listaClientes(){
		
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		Cliente cliente1 = new Cliente ("Murilo", "Silva", "19");
		Cliente cliente2 = new Cliente ("Carlos", "Pires", "35");
		Cliente cliente3 = new Cliente ("Viviane", "Gomes", "51");
		Cliente cliente4 = new Cliente ("Pedro", "Silva", "22");
		Cliente cliente5 = new Cliente ("Lionel", "Messi", "36");
		Cliente cliente6 = new Cliente ("ALice", "Almeida", "18");
		Cliente cliente7 = new Cliente ("Wellington", "Rato", "32");
		Cliente cliente8 = new Cliente ("Carla", "Nunes", "53");
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
		Object linha [] = new Object [3];
		
		for (int coluna = 0; coluna < lista.size(); coluna++) {
			
			linha [0] = lista.get(coluna).nome; 
			linha [1] = lista.get(coluna).sobrenome; 
			linha [2] = lista.get(coluna).idade; 
			
			// adiciono as infos de cada coluna na linha
			informacao.addRow(linha);
		}
	}
}
