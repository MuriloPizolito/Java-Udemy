/*
CRIE UM ALGORITMO QUE SOLICITE AO USUÁRIO UM NÚMERO INTEIRO POSITIVO AO
USUÁRIO E NO FINAL IMPRIMA OS NÚMEROS ÍMPARES DO 1 ATÉ O NÚMERO QUE O 
USUÁRIO DIGITOU. 
*/

package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_For_Numeros_Impares {

	public static void main(String[] args) {
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número inteiro positivo: ", "Leia com atenção", JOptionPane.QUESTION_MESSAGE));
		
		for (int contador = 1; contador <= numero; contador++) {
			if(contador % 2 != 0) {
				System.out.println("Impar: "+contador);
			} 
		}
		
	}
	
}
