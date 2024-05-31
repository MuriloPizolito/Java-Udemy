/*
	CRIE UM ALGORITMMO QUE LEIA DOIS NÚMEROS E IMPRIMA EM ORDEM DECRESCENTE
*/

package ComandoDecisaoJava;

import javax.swing.JOptionPane;

public class Exercicio_If_Ordem_Decrescente {
	
	public static void main(String[] args) {
		
		int numero1, numero2;
		
		//Recebe os números e armazena nas variáveis
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
		
		if(numero1 >= numero2) {
			System.out.println(""+numero1);
			System.out.println(""+numero2);
		}else {
			System.out.println(""+numero2);
			System.out.println(""+numero1);
		//  System.out.println(numero2 + "\n" + numero1);	
		}
	}
	
}
