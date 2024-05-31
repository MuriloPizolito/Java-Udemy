package ComandoDecisaoJava;

import javax.swing.JOptionPane;

public class Switch_Exemplo_2 {
	
	public static void main(String[] args) {
		
		int mes;
		// Recebendo o mes e armazenando na variável
		// Integer.parseInt() - Para converter uma String para um número inteiro
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um mês entre 1 e 12: "));
				
		// switch - Avalia o valor de uma variável e dependendo do resultado ele entra em um caso e executa a ação
		// switch - Selecione Caso
		switch (mes) {
			case 1: case 2: case 3: case 4: case 5: {
				System.out.println("O mês está entre 1 e 5");
				break;
			}
			case 6:
			case 7:
			case 8:
			case 9:
			case 10: {
				System.out.println("O mês está entre 6 e 10");
				break;
			}
			case 11:
			case 12: {
				System.out.println("Mês é 11 ou 12");
				break;
			}
			// default - Usado para caso o valor recebido não seja compatível com nenhuma opção disponível
			default:
				System.out.println("Você não digitou um mês válido");
		}
		
	}
	
}
