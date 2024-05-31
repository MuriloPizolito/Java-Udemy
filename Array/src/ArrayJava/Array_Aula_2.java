package ArrayJava;

import java.util.Arrays;

public class Array_Aula_2 {
	
	public static void main(String[] args) {
		
		// final - é uma constante / fixo e pode ser usado em diversas partes
		final int tamanho = 3;
		
		int [] precos = new int [tamanho];
		
		precos[0] = 18;
		precos[1] = 45;
		precos[2] = 90;
		
		System.out.println("Imprimindo array de preços\n");
		
		//for-para
		//length - atributo do array que vai retornar o tamanho do array
		for (int posicao = 0; posicao < precos.length; posicao++) {
			System.out.println("Preço "+posicao+" : "+precos[posicao]);
		}
		
		//-----------------------------------------------------------------------
		
		System.out.println("-------------------------------------------------");
		
		String [] letras = {"A", "B", "C", "D", "E", "F", "G", "H"};
		
		System.out.println(">>>>> For Array Letras <<<<<\n");
		
		// for especifico para usar em arrays
		// For utilizado como opção para ler itens do array
		/*
		for(String linha:letras) {
			System.out.println(linha);
		}*/
		// l -pode usar qualquer nome para criar
		for(String l:letras) {
			System.out.println(l);
		}
		
		//-------------------------------------------------------------------------
		
		System.out.println("-------------------------------------------------");
		
		int [] numeros = {18, 22, 47, 51, 86, 98, 150};
		
		System.out.println(">>>>> For Array Números <<<<<\n");
		
		// for especifico para usar em arrays
		// For utilizado como opção para ler itens do array
		// linha -pode usar qualquer nome para criar
		for(int linha:numeros) {
			System.out.println(linha);
		}
		
		//-------------------------------------------------------------------------
		
		System.out.println("-------------------------------------------------");
		
	//	Arrays.fill(nome da variável, tamanho/valor);
	// Fill - Preenche os array com um valor pré-determinado	
		Arrays.fill(numeros, 5);
	// Substituiu todos os valores da variável número por 5
		
		System.out.println(">>>>> For Array Números Fill <<<<<\n");
		
		// for especifico para usar em arrays
		// For utilizado como opção para ler itens do array
		// linha -pode usar qualquer nome para criar
		for(int linha:numeros) {
			System.out.println(linha);
		}
		
		//-------------------------------------------------------------------------
		
		System.out.println("-------------------------------------------------");
				
		//	Arrays.fill(nome da variável, tamanho/valor);
		// Fill - Preenche os array com um valor pré-determinado	
		Arrays.fill(letras, "W");
	// Substituiu todos os valores da variável letras por "W"
		
				
		System.out.println(">>>>> For Array Letras Fill <<<<<\n");
				
		// for especifico para usar em arrays
		// For utilizado como opção para ler itens do array
		// linha -pode usar qualquer nome para criar
		for(String linha:letras) {
			System.out.println(linha);
		}
	}
	
}	
