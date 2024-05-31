package TelasJFrame;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GraphicsEnvironment;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Classes.Dados_agenda;
import Classes.Operacoes_no_Banco_de_Dados;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Pesquisa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtConsulta;
	private JTextField txtQuantidadeItens;
	private JTable tabelaAgenda;
	
	Alterar enviaTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pesquisa frame = new Pesquisa();
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
	public Pesquisa() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				
				carregarItens();
				
			}
		});
		
		setTitle("Pesquisa");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		// point - representa o local no espaço de coordenada x e y
		Point centro = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
		
		int largura = 800;
		int altura = 500;
		
		// centralizar no meio da tela
		setBounds(centro.x - largura / 2, centro.y - altura / 2, 889, 610);
		
		setContentPane(contentPane);
		
		JButton btnNovo = new JButton(" Novo");
		btnNovo.setBounds(672, 29, 180, 41);
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cadastro abreTela = new Cadastro();
				abreTela.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		btnNovo.setIcon(new ImageIcon(Pesquisa.class.getResource("/Imagens/registro 2.0.png")));
		btnNovo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		contentPane.add(btnNovo);
		
		JLabel lblNewLabel = new JLabel("Pesquise pelo nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(39, 40, 284, 38);
		contentPane.add(lblNewLabel);
		
		txtConsulta = new JTextField();
		txtConsulta.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				
				String nome = "%" + txtConsulta.getText() + "%";
				
				Operacoes_no_Banco_de_Dados itens = new Operacoes_no_Banco_de_Dados();
				List<Dados_agenda> itensLista = itens.FiltrarDados(nome);
				
				DefaultTableModel dados = (DefaultTableModel) tabelaAgenda.getModel();
				
				dados.setNumRows(0);// limpa os dados da tabela
				
				for (Dados_agenda linha : itensLista) {
					
					dados.addRow(new Object[] {
							
							linha.getId(),
							linha.getNome(),
							linha.getTelefone(),
							linha.getEmail(),
							linha.getEndereco(),
							linha.getDataNascimento()
							
					});
				}
				
				contarLinhasTabela();
				
 			}
		});
		txtConsulta.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtConsulta.setBounds(39, 89, 472, 38);
		contentPane.add(txtConsulta);
		txtConsulta.setColumns(10);
		
		txtQuantidadeItens = new JTextField();
		txtQuantidadeItens.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtQuantidadeItens.setBounds(39, 138, 369, 33);
		contentPane.add(txtQuantidadeItens);
		txtQuantidadeItens.setColumns(10);
		
		txtQuantidadeItens.setBorder(new LineBorder(Color.white, 1));
		txtQuantidadeItens.setBackground(new Color(255,255, 255));
		txtQuantidadeItens.setEditable(false);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 200, 813, 338);
		contentPane.add(scrollPane);
		
		tabelaAgenda = new JTable();
		tabelaAgenda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
				if (e.getClickCount() == 2) { // se der dois cliques
					DefaultTableModel model = (DefaultTableModel) tabelaAgenda.getModel();
					
					int selecionaNumeroLinha = tabelaAgenda.getSelectedRow();// seleciona o numero da linha
					
					if (enviaTexto == null) {
						
						enviaTexto = new Alterar();
						enviaTexto.setVisible(true);
						enviaTexto.recebendo(model.getValueAt(selecionaNumeroLinha, 0).toString(),
								model.getValueAt(selecionaNumeroLinha, 1).toString(),
								model.getValueAt(selecionaNumeroLinha, 2).toString(),
								model.getValueAt(selecionaNumeroLinha, 3).toString(),
								model.getValueAt(selecionaNumeroLinha, 4).toString(),
								model.getValueAt(selecionaNumeroLinha, 5).toString());
					}else {
						
						// passa uma constante
						enviaTexto.setState(Alterar.NORMAL);
						enviaTexto.setVisible(true);
						enviaTexto.recebendo(model.getValueAt(selecionaNumeroLinha, 0).toString(),
								model.getValueAt(selecionaNumeroLinha, 1).toString(),
								model.getValueAt(selecionaNumeroLinha, 2).toString(),
								model.getValueAt(selecionaNumeroLinha, 3).toString(),
								model.getValueAt(selecionaNumeroLinha, 4).toString(),
								model.getValueAt(selecionaNumeroLinha, 5).toString());
					}
				}
				
			}
		});
		tabelaAgenda.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrollPane.setViewportView(tabelaAgenda);
		tabelaAgenda.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nome", "Telefone", "Email", "Endere\u00E7o", "Data Nascimento"
			}
		));
		
		tabelaAgenda.setRowHeight(30); // aumentandpo a altura da linha
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel dados = (DefaultTableModel) tabelaAgenda.getModel();
				
				try {
					
					int selecionNumeroLinha = tabelaAgenda.getSelectedRow();// seleciona o numero da linha
					
					Dados_agenda objeto = new Dados_agenda();
					
					int id = Integer.parseInt(dados.getValueAt(selecionNumeroLinha, 0).toString());
					objeto.setId(id);
					
					Operacoes_no_Banco_de_Dados excluirDados = new Operacoes_no_Banco_de_Dados();
					excluirDados.Excluir(objeto);
					
					carregarItens(); // vai recarregar as informações da lista
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Não há nenhum registro selecionado.");
				}
				
			}
		});
		btnExcluir.setIcon(new ImageIcon(Pesquisa.class.getResource("/Imagens/excluir.png")));
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExcluir.setBounds(672, 84, 180, 41);
		contentPane.add(btnExcluir);
		
		JButton btnExportar = new JButton(" Exportar");
		btnExportar.setIcon(new ImageIcon(Pesquisa.class.getResource("/Imagens/excel.png")));
		btnExportar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExportar.setBounds(672, 140, 180, 41);
		contentPane.add(btnExportar);
		
		// tirando a seleção da tela, quando houver dois cliques
		tabelaAgenda.setDefaultEditor(Object.class, null);
		
		carregarItens();

	}
	
	// método para carregar as informações
	public void carregarItens() {
		
		//instanciando para acessar todos os itens
		Operacoes_no_Banco_de_Dados itens = new Operacoes_no_Banco_de_Dados();
		
		List<Dados_agenda> itensLista = itens.listarItens();
		
		// criando objeto que vai passar os dados da lista para a tabela
		DefaultTableModel dados = (DefaultTableModel) tabelaAgenda.getModel();
		
		
		dados.setNumRows(0);// limpar os dados da tabela
		
		for (Dados_agenda linha : itensLista) {
			dados.addRow(new Object[] {
					
					linha.getId(),
					linha.getNome(),
					linha.getTelefone(),
					linha.getEmail(),
					linha.getEndereco(),
					linha.getDataNascimento()
					
			});
		}
		
		tabelaAgenda.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			
		// Ajustando a largura das colunas
		tabelaAgenda.getColumnModel().getColumn(0).setPreferredWidth(25); //id
		tabelaAgenda.getColumnModel().getColumn(1).setPreferredWidth(200);// nome
		tabelaAgenda.getColumnModel().getColumn(2).setPreferredWidth(200);// telefone
		tabelaAgenda.getColumnModel().getColumn(3).setPreferredWidth(300);// email 
		tabelaAgenda.getColumnModel().getColumn(4).setPreferredWidth(200);// endereco
		tabelaAgenda.getColumnModel().getColumn(5).setPreferredWidth(150);// nascimento
		
		contarLinhasTabela();
		
	}
	
	public void contarLinhasTabela() {
		
		int qtdLinhas = 0;
		
		qtdLinhas = tabelaAgenda.getRowCount();
		
		txtQuantidadeItens.setText("Total de registros: "+ Integer.toString(qtdLinhas));
		
	}
}
