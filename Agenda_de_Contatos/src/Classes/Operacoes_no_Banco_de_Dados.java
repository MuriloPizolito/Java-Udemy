package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Operacoes_no_Banco_de_Dados {
	
	private Connection conexao;
	
	public Operacoes_no_Banco_de_Dados() {
		
		// nosso atributo conexao vai receber uma nova conexao com o banco de dados
		this.conexao = new Conectar_Ao_Banco_De_Dados().getConnection();
	}
	
	public void Cadastrar(Dados_agenda objeto) {
		try {
			// inserir os valores na tabela
			String informacoesSql = "insert into tabela_cadastro(nome, telefone, email, endereco, data_nascimento) values(?, ?, ?, ?, ?)";
		
			// Tratando a execução dos comando sql
		
			PreparedStatement gravarInformacao = conexao.prepareStatement(informacoesSql);
			gravarInformacao.setString(1, objeto.getNome());
			gravarInformacao.setString(2, objeto.getTelefone());
			gravarInformacao.setString(3, objeto.getEmail());
			gravarInformacao.setString(4, objeto.getEndereco());
			gravarInformacao.setString(5, objeto.getDataNascimento());	
			
			gravarInformacao.execute();// executa os comandos sql
			
			gravarInformacao.close(); // fecha
			
			JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso.");
			
		} catch (SQLException e) {
			
			JOptionPane.showMessageDialog(null, "Erro ao cadastrar os dados.");
			
		}
		
	}
	//método para listar todos os registros da agenda
	public List<Dados_agenda> listarItens() {
		
		try {
			List<Dados_agenda> lista = new ArrayList<Dados_agenda>();
			
			String sqlBancoDados = "Select * from tabela_cadastro";
			
			PreparedStatement lerInformacao = conexao.prepareStatement(sqlBancoDados);
			
			ResultSet resultado = lerInformacao.executeQuery();// a variavel resultado vai receber o resultado da execução da query
			
			while (resultado.next()) {
				
				Dados_agenda linha	= new Dados_agenda();
				linha.setId(resultado.getInt("id"));
				linha.setNome(resultado.getString("nome"));
				linha.setTelefone(resultado.getString("telefone"));
				linha.setEmail(resultado.getString("email"));
				linha.setEndereco(resultado.getString("endereco"));
				linha.setDataNascimento(resultado.getString("data_nascimento"));
				
				lista.add(linha);
			}
			
			return lista;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Erro ao carregar os dados: " + e);
		}
		
		return null;
	}
	
	public List<Dados_agenda> FiltrarDados(String nome) {
		
		try {
			List<Dados_agenda> lista = new ArrayList<Dados_agenda>();
			
			String sqlBancoDados = "Select * from tabela_cadastro where nome like ?";
			
			PreparedStatement lerInformacao = conexao.prepareStatement(sqlBancoDados);
			
			lerInformacao.setString(1, nome);
			
			ResultSet resultado = lerInformacao.executeQuery();// a variavel resultado vai receber o resultado da execução da query
			
			while (resultado.next()) {
				
				Dados_agenda linha	= new Dados_agenda();
				linha.setId(resultado.getInt("id"));
				linha.setNome(resultado.getString("nome"));
				linha.setTelefone(resultado.getString("telefone"));
				linha.setEmail(resultado.getString("email"));
				linha.setEndereco(resultado.getString("endereco"));
				linha.setDataNascimento(resultado.getString("data_nascimento"));
				
				lista.add(linha);
			}
			
			return lista;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Erro ao carregar os dados: " + e);
		}
		
		
		return null;
	}
	
	public void Alterar(Dados_agenda objeto) {
		
		try {
			// atualizando os dados
			// set - define os campos
			// recebendo atraves do id
			String informacoesSql = "update	tabela_cadastro set nome=?, telefone=?, email=?, endereco=?, data_nascimento=? "
					+ "where id=?";
		
			// Tratando a execução dos comando sql
		
			PreparedStatement gravarInformacao = conexao.prepareStatement(informacoesSql);
			gravarInformacao.setString(1, objeto.getNome());
			gravarInformacao.setString(2, objeto.getTelefone());
			gravarInformacao.setString(3, objeto.getEmail());
			gravarInformacao.setString(4, objeto.getEndereco());
			gravarInformacao.setString(5, objeto.getDataNascimento());	
			gravarInformacao.setInt(6, objeto.getId());
			
			gravarInformacao.execute();// executa os comandos sql
			
			gravarInformacao.close(); // fecha
			
			JOptionPane.showMessageDialog(null, "Dados alterados com sucesso.");
			
		} catch (SQLException e) {
			
			JOptionPane.showMessageDialog(null, "Erro ao alterar os dados.");
			
		}
		
		
	}
	
	public void Excluir(Dados_agenda objeto) {
		
		try {
			// deletando os dados
			// recebendo atraves do id
			String informacoesSql = "delete from tabela_cadastro where id = ?";
		
			// Tratando a execução dos comando sql
		
			PreparedStatement excluirInformacao = conexao.prepareStatement(informacoesSql);
			excluirInformacao.setInt(1, objeto.getId());
			
			excluirInformacao.execute();// executa os comandos sql
			
			excluirInformacao.close(); // fecha
			
			JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso.");
			
		} catch (SQLException e) {
			
			JOptionPane.showMessageDialog(null, "Erro ao excluir os registros.");
			
		}
		
	}
	
}	
