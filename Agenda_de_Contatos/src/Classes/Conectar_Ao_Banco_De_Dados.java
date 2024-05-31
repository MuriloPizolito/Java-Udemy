package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conectar_Ao_Banco_De_Dados {
	
	public Connection getConnection() {
		
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/bdagenda", "root", "admin");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "O driver do Banco de dados não foi encontrado: " + e);
			
		}
		
		return null;
	}
	
	
}
