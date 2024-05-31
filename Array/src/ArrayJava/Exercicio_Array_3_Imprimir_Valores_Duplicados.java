/*
CRIE UM ALGORITMO QUE PERCORRA OS ITENS DE UM ARRAY DE 
NÚMEROS INTEIROS E IMPRIMA TODOS OS VALORES DUPLICADOS, 
TODOS OS VALORES QUE SE REPETEM.
*/

package ArrayJava;

public class Exercicio_Array_3_Imprimir_Valores_Duplicados {
	
	public static void main(String[] args) {

		int [] numeros = {10, 13, 10, 43, 52, 43, 55, 56, 52, 13, 91};
		
		System.out.println(numeros.length);
		
		//Contador começa a partir da posição 1 do array - x + 1
		//Assim compara a posição 0 no x com todos os itens do Array a partir da primeira posição
		//O segundo For vai comparar a posição do primeiro For com todos os itens do Array através do segundo For
		for (int x = 0; x < numeros.length - 1; x++) {
			
			for (int y = x + 1;y < numeros.length; y++) {
				
			//Compara se a posição 0 é igual a posição 1 && se a posição 0 é diferente da posição 1
				if ((numeros[x] == numeros[y]) && (x != y)) {
					System.out.println("Item duplicado: "+numeros[y]);
				}
				
			}
			
		}
	}
	
}	
