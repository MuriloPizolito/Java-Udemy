package TelaPrincipal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import TelasJFrame.Pesquisa;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import Classes.Conectar_Ao_Banco_De_Dados;

public class Principal {

	private JFrame frmAgendaDeContatos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmAgendaDeContatos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAgendaDeContatos = new JFrame();
		frmAgendaDeContatos.setTitle("Agenda de Contatos");
		
		// maximiza a tela
		frmAgendaDeContatos.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
	//	frmAgendaDeContatos.setLocationRelativeTo(null); centraliza a tela
		
		JButton btnTestarConexaoBD = new JButton("Testar conexão com BD");
		btnTestarConexaoBD.setBounds(336, 219, 236, 64);
		btnTestarConexaoBD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Conectar_Ao_Banco_De_Dados().getConnection();
				JOptionPane.showMessageDialog(null, "Banco de dados conectado com sucesso!");
			}
		});
		frmAgendaDeContatos.getContentPane().setLayout(null);
		btnTestarConexaoBD.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmAgendaDeContatos.getContentPane().add(btnTestarConexaoBD);
		
		JMenuBar menuBar = new JMenuBar();
		frmAgendaDeContatos.setJMenuBar(menuBar);
		
		JMenu menuArquivo = new JMenu("Arquivo");
		menuArquivo.setIcon(new ImageIcon(Principal.class.getResource("/Imagens/arquivo.png")));
		menuBar.add(menuArquivo);
		
		JMenuItem subMenuContatos = new JMenuItem("Contatos");
		subMenuContatos.setIcon(new ImageIcon(Principal.class.getResource("/Imagens/contatos.png")));
		subMenuContatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Pesquisa telaPesquisa = new Pesquisa();// instanciando para ter acesso a tela
				telaPesquisa.setVisible(true);// deixando a tela de pesquisa visível 
				
			}
		});
		menuArquivo.add(subMenuContatos);
		
		JMenu menuAjuda = new JMenu("Ajuda");
		menuAjuda.setIcon(new ImageIcon(Principal.class.getResource("/Imagens/ajuda.png")));
		menuBar.add(menuAjuda);
		
		JMenuItem subMenuSair = new JMenuItem("Sair");
		subMenuSair.setIcon(new ImageIcon(Principal.class.getResource("/Imagens/sair.png")));
		subMenuSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				frmAgendaDeContatos.dispose();// fechando o formulário
			}
		});
		menuAjuda.add(subMenuSair);
	}
}
