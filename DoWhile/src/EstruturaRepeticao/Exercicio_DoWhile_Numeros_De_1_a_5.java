/*
 CRIE UM ALGORITMO USANDO DoWHILE QUE SOLICITE AO USUÁRIO 
 A ENTRADA DE N NÚMEROS E SÓ ENCERRE O PROGRAMA QUANDO O 
 USUÁRIO DIGITAR UM NÚMERO ENTRE 1 E 5.
 */

package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_DoWhile_Numeros_De_1_a_5 {
	
	public static void main(String[] args) {
		
		int numero;
		int contador = 0;
		
	//	numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ", "Leia com atenção", JOptionPane.QUESTION_MESSAGE));
		
		// do - FAÇA
		do {
			
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número ou (1 a 5 para encerrar)", "Leia com atenção", JOptionPane.QUESTION_MESSAGE));
			contador++;
			
			
		// while - enquanto	
		}while(numero < 1 || numero > 5);
		//System.out.println("Programa encerrado.");
		JOptionPane.showMessageDialog(null, "Programa encerrado");
	}
	
}
