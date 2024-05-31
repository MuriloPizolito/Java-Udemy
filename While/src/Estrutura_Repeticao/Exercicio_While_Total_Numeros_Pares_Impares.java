/*
CRIE UM ALGORITMO USANDO WHILE QUE SOLICITE AO USUÁRIO A ENTRADA DE 
N NÚMERO INTEIROS POSITIVOS, E EXIBA O TOTAL DE NÚMEROS PARES E O TOTAL
DE NÚMEROS ÍMPARES.
ENCERRE O PROGRAMA QUANDO O USUÁRIO DIGITAR UM NÚMERO NEGATIVO
 */

package Estrutura_Repeticao;

import javax.swing.JOptionPane;

public class Exercicio_While_Total_Numeros_Pares_Impares {
	
	public static void main(String[] args) {
		
		int numero, par, impar;
		numero = 0;
		par = 0;
		impar = 0;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número inteiro positivo: ", "Leia com atenção", JOptionPane.QUESTION_MESSAGE));	
		
		System.out.println(numero);
		
		// while - enquanto
		while(numero >= 0) {
			
			//if - se
			if (numero % 2 == 0) {
					par++; 
			}else {
					impar++;
				}
			
			numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número inteiro positivo: ", "Leia com atenção", JOptionPane.QUESTION_MESSAGE));
			
			System.out.println(numero);
			
		}
		
		System.out.println("Quantidade de números pares: "+par);
		System.out.println("Quantidade de números ímpares: "+impar);
		
	}
	
}
