package ComandoDecisaoJava;

import javax.swing.JOptionPane;

public class Switch {
	
	public static void main(String[] args) {
		
		String fruta;
		
		// Recebendo o nome da fruta e armazenando na variável
		fruta = JOptionPane.showInputDialog("Digite o nome de uma fruta: ");
		
		// switch - Avalia o valor de uma variável e dependendo do resultado ele entra em um caso e executa a ação
		// switch - Selecione Caso
		switch (fruta) {
		   //case - caso 
			case "Banana": {
				System.out.println("Você digitou Banana!");
				
				// break - encerrar o programa
				break;
			}	
			case "Laranja": {
				System.out.println("Você digitou Laranja!");
				
				break;
			}	
			case "Uva": {
				System.out.println("Você digitou Uva!");
				
				break;
			}	
			// default - Usado para caso o valor recebido não seja compatível com nenhuma opção disponível
			default: {
				System.out.println("Você não digitou uma fruta válida!");
			}	
		}
	}
	
}
