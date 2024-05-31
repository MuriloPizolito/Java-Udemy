/*
CRIE UM ALGORITMO QUE SOME TODOS OS ITENS DE UM 
 ARRAY E NO FINAL CALCULE A MÉDIA DESSES ITENS
*/

package ArrayJava;

public class Exercicio_Array_2_Soma_E_Media {
	
	public static void main(String[] args) {
		/*
		int numeros [] = {10, 52, 35, 48};
		int soma = 0;
		int media = 0;
		
		//length - atributo do array que vai retornar o tamanho do array
		for (int i = 0; i < numeros.length;i++) {
			soma = soma + numeros[i];// soma += numeros[i];
		//	System.out.println("Soma total: "+soma);
			
		}
		
		System.out.println("Soma: "+soma);
		//length - atributo do array que vai retornar o tamanho do array
		System.out.println("Total itens: "+numeros.length);
		
	//	media = soma / 4;
		media = soma / numeros.length;
		System.out.println("Média: "+media);
		*/
		
		double numeros [] = {10, 52, 35, 48};
		double soma = 0;
		double media = 0;
		
		//length - atributo do array que vai retornar o tamanho do array
		for (int i = 0; i < numeros.length;i++) {
			soma = soma + numeros[i];// soma += numeros[i];
		//	System.out.println("Soma total: "+soma);
			
		}
		
		System.out.println("Soma: "+soma);
		//length - atributo do array que vai retornar o tamanho do array
		System.out.println("Total itens: "+numeros.length);
		
	//	media = soma / 4;
		media = soma / numeros.length;
		System.out.println("Média: "+media);
	}
	
}
