/*
 Crie um algoritmo que percorra os itens de 2 Array
  de Strings/Texto e imprima todos os valores que 
  constam em ambos os Array. 
*/

package ArrayJava;

import java.util.Arrays;
import java.util.HashSet;

public class Exercicio_Array_4_Imprimir_Itens_Em_Ambos_Arrays {
	
	public static void main(String[] args) {
		
		String [] array1 = {"A", "B", "F", "G", "K", "L"};
		String [] array2 = {"L", "K", "J", "F"};
		
		System.out.println("Array 1:"+Arrays.toString(array1));
		System.out.println("Array 2:"+Arrays.toString(array2));
		
	  //HashSet - é uma coleção de itens, onde cada item é único
		HashSet<String> itensRepetidos = new HashSet<String>();

		for (int contadorArray1 = 0; contadorArray1 <= array1.length - 1; contadorArray1++) {	
			
			for (int contadorArray2 = 0; contadorArray2 <= array2.length - 1;contadorArray2++) {
				
				if(array1[contadorArray1].equals(array2[contadorArray2])) {
					
					itensRepetidos.add(array1[contadorArray1]);
					
				}
				
			}
				
		}
		
		
		System.out.println("Itens repetidos: "+itensRepetidos);
	
	}
	
}
