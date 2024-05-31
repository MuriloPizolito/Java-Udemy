/*
CRIE UM ALGORITMO USANDO WHILE QUE SOLICITE AO USUÁRIO A ENTRADA DE 
N NÚMERO INTEIROS POSITIVOS, NO FINAL EXIBA O MENOR E O MAIOR NÚMERO
DIGITADO.
PARA ENCERRAR O PROGRAMA O USUÁRIO DEVE DIGITAR UM NÚMERO MENOR QUE 0.
 */

package Estrutura_Repeticao;

import javax.swing.JOptionPane;

public class Exercicio_While_Menor_Maior_Numero {
	
	public static void main(String[] args) {
		
		int numeroDigitado, maior, menor;
		
		numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número inteiro positivo: ", "Leia com atenção", JOptionPane.QUESTION_MESSAGE));
		
		maior = numeroDigitado;
		menor = numeroDigitado;
		
		// while - enquanto
		while(numeroDigitado >= 0) {
			
			System.out.println(numeroDigitado);
			
			numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número inteiro positivo: ", "Leia com atenção", JOptionPane.QUESTION_MESSAGE));
			
			if (numeroDigitado > maior) {
				maior = numeroDigitado;
			} 
			if (numeroDigitado < menor && numeroDigitado >= 0) {
				menor = numeroDigitado;
			}
			
		}
		
		System.out.println("Maior número digitado: "+maior);
		System.out.println("Menor número digitado: "+menor);
	}
	
}	
