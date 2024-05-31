/*
 CRIE UM ALGORITMO USANDO DoWHILE QUE SOLICITE AO USUÁRIO 
 A ENTRADA DE N NÚMEROS INTEIROS E MOSTRE NA TELA SE ESTE 
 NÚMERO É POSITIVO OU NEGATIVO E SÓ ENCERRE O PROGRAMA 
 QUANDO O USUÁRIO DIGITAR O NÚMERO 0. 
 */

package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_DoWhile_Numero_Positivo_Negativo {
	
	public static void main(String[] args) {
		
		int numero;
		int contador = 0;
		
	//	numero = Integer.parseInt(JOptionPane.showInputDialog(null, ""));
		
		// FAÇA
		do {
			
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro (ou 0 para encerrar): ", "Leia com atenção", JOptionPane.QUESTION_MESSAGE));
			contador++;
			
			if (numero >= 1) {
			//	JOptionPane.showMessageDialog(null,numero+", número positivo");
				System.out.println(numero+", número positivo");
			} else if (numero <= -1){
			//	JOptionPane.showMessageDialog(null,numero+", número negativo");
				System.out.println(numero+", número negativo");
			}
			
		// ENQUANTO	
		} while (numero != 0);
			JOptionPane.showMessageDialog(null,"Programa encerrado. Até a próxima!");
		//	System.out.println("Programa encerrado. Até a próxima!");
		
	}
	
}
