package Arquivos;

public class Matriz {
	
	public static void main(String[] args) {
		
		// [] - Array
		// [][] - Matriz
		// Matriz - representada por linhas e colunas
		// Primeiro índice - são as linhas
		// Segundo índice - são as colunas				
		// Cada linha da matriz é um Array
		// Nesse caso são 3 arrays
						// 3 linhas, 4 colunas
		int [][] numeros = new int [3][4];
		
		// Populando a matriz
		// para
		// esse for percorre as linhas
		for (int linha = 0; linha < 3; linha++) {
			
			// esse for percorre as colunas
			for (int coluna = 0; coluna < 4; coluna++) {
				
				// colocando o valor 5 em cada item da matriz
				numeros [linha][coluna] = 5;
				
			}
			
		}
		
		//Imprimindo a matriz
		// para
		// esse for percorre as linhas
		for (int linha = 0; linha < 3; linha++) {
					
			// esse for percorre as colunas
			for (int coluna = 0; coluna < 4; coluna++) {
						
				System.out.print(numeros[linha][coluna] + " ");
						
			}
			
			System.out.println(" ");
					
		}
		
		// -------------------------------------------------------------
		
		System.out.println(" ");
		
		int linhas = 3;
		int colunas = 4;
		
		String [][] matrizLetras = new String[linhas][colunas];
		String [] array_1 = {"A", "B", "C", "D"};
		String [] array_2 = {"E", "F", "G", "H"};
		String [] array_3 = {"I", "J", "K", "L"};
		
		matrizLetras[0] = array_1;
		matrizLetras[1] = array_2;
		matrizLetras[2] = array_3;
		
		
		for (int linha = 0; linha < linhas; linha++) {
			
			// esse for percorre as colunas
			for (int coluna = 0; coluna < colunas; coluna++) {
						
				System.out.print(matrizLetras[linha][coluna] + " ");
						
			}
			
			System.out.println(" ");
					
		}
	}
	
}
