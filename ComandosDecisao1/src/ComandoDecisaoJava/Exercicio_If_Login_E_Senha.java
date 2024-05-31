/*
 	CRIE UM ALGORITMO QUE SOLICITE AO USUÁRIO O NOME E A SENHA E NA SEQUÊNCIA,
 	VERIFIQUE SE O NOME É ROGER
*/

package ComandoDecisaoJava;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class Exercicio_If_Login_E_Senha {
	
	public static void main(String[] args) {
		
		Scanner objetoLogin = new Scanner(System.in);
		
		String nome, senha;
		
		System.out.println("Digite o nome de usuário: ");
		nome = objetoLogin.nextLine();
		
		System.out.println("Digite a senha: ");
		senha = objetoLogin.nextLine();
		
		if (nome.equals("Roger") && senha.equals("123")) {
			System.out.println("Logado com sucesso!");
		}else {
			System.out.println("Usuário ou senha inválidos.");
		}
		
		
		/*
		String nome, senha;
		
		
		nome = JOptionPane.showInputDialog("Digite o nome de usuário: ");
		senha = JOptionPane.showInputDialog("Digite a senha: ");
		
		if(nome.equals("Roger") && senha.equals("123")) {
			JOptionPane.showMessageDialog(null,"Logado com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null,"Usuário ou senha inválidos");
		}
		*/
	}
	
}
