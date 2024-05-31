/*
 Crie um algoritmo com uma matriz 3 x 3 que permita
  a entrada de números digitados pelo usuário, e na
   sequência, imprima todos os números que foram digitados
    e imprima também na linha de baixo apenas os números
     da Diagonal da Matriz e por último, imprima a soma
      da Diagonal. 
*/

package Arquivos;

import java.util.Scanner;

public class Exercicio_Matriz_1_Imprimir_Somar_Matriz_Diagonal_3_x_3 {
	
	public static void main(String[] args) {
		Scanner objetoNumero = new Scanner(System.in);
		
		// [][] - Matriz
		// Matriz - representada por linhas e colunas
		// 3 linhas, 3 colunas
		int numeros [][] = new int [3][3];
 		
		// percorre linha por linha
		for (int linha = 0; linha < 3; linha++) {
			
			//percorre coluna por coluna
			for (int coluna = 0; coluna < 3; coluna++) {
				
			//	System.out.println("Digite um número na linha: "+ linha + " - coluna "+coluna + ":");
				System.out.printf("Digite um número na linha %d: Coluna %d: ", linha, coluna);
				numeros [linha][coluna] = objetoNumero.nextInt();
				System.out.println("");
				
			}
			
		}
		
		int somaDiagonal = 0;
		
		// imprimindo os valores da matriz
		for (int linha = 0; linha < 3; linha++) {
			
			// percorre coluna por coluna e imprime as colunas
			for (int coluna = 0; coluna < 3; coluna++) {
				
				System.out.print(numeros[linha][coluna] + "  ");
				
				// somando os valores na diagonal da matriz
				somaDiagonal = numeros[0][0] + numeros[1][1] + numeros[2][2];
				
			}
			
			// pulando uma linha
			System.out.println("");
			
		}
		
		System.out.println("\nImprimindo números Diagonal");
		
		System.out.print(numeros[0][0] + "  ");
		System.out.print(numeros[1][1] + "  ");
		System.out.print(numeros[2][2] + "  \n");
		System.out.println("Soma da Diagonal: "+somaDiagonal);
		
	}
	
}
