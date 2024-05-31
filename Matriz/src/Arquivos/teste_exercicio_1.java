package Arquivos;

import java.util.Scanner;

public class teste_exercicio_1 {
	
	public static void main(String[] args) {
		Scanner objetoNumero = new Scanner(System.in);
		
		int [][] numeros = new int [3][3];
		
		for (int linha = 0; linha < 3; linha++) {
			
			for (int coluna = 0; coluna < 3; coluna++) {
				
				System.out.printf("Digite um número na linha %d: Coluna %d: ", linha, coluna);
				numeros[linha][coluna] = objetoNumero.nextInt();
			}
		}
		
		int somaDiagonal = 0;
		
		for (int linha = 0; linha < 3; linha++) {
			
			for (int coluna = 0; coluna < 3; coluna++) {
				
				System.out.print(+numeros[linha][coluna]+ " ");
				somaDiagonal = numeros [0][0] + numeros[1][1] + numeros[2][2];
			}
			
			System.out.println("  ");
			
		}
		
		System.out.println("Valores da diagonal: ");
		System.out.print(numeros[0][0]+" ");
		System.out.print(numeros[1][1]+" ");
		System.out.print(numeros[2][2]+" ");
		System.out.println("\nSoma dos números na Diagonal: "+somaDiagonal);
		
		
	}
	
}
