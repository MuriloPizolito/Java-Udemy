package ComandoDecisaoJava;

import javax.swing.JOptionPane;

public class Funcao_IF_ELSEIF_ELSE_OU_E {
	
	public static void main(String[] args) {
		/*
		 || - Ou
		 && - E 
		 */
		/*
		USANDO O OU ||
		String fruta;
		
		fruta = JOptionPane.showInputDialog("Digite o nome da fruta: ");
		//|| - APENAS UMA CONDIÇÃO PRECISA SER VERDADEIRA
		if (fruta.equals("Maça") || fruta.equals("Banana")) {
			JOptionPane.showMessageDialog(null, "A fruta é: "+fruta);
		}else {
			JOptionPane.showMessageDialog(null, "Fruta inválida");
		} 
		*/
		
		//USANDO O E &&
		
		String fruta_1, fruta_2;
		
		// Recebendo o nome das frutas e armazenando nas variáveis
		fruta_1 = JOptionPane.showInputDialog("Digite o nome da primeira fruta: ");
		fruta_2 = JOptionPane.showInputDialog("Digite o nome da segunda fruta: ");
		//&& - AS DUAS CONDIÇÕES PRECISAM SER VERDADEIRAS
		if (fruta_1.equals("Maça") && fruta_2.equals("Banana")) {
			JOptionPane.showMessageDialog(null, "Fruta 1: "+ fruta_1);
			JOptionPane.showMessageDialog(null, "Fruta 2: "+ fruta_2);
			//System.out.println("A fruta 1 é Maça e a Fruta 2 é Banana");
		}else {
			JOptionPane.showMessageDialog(null, "Fruta 1 ou fruta 2 inválida.");
			// System.out.println("Você não digitou as duas frutas corretamente");
		}
	}
	
	
}
