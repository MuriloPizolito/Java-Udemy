/*
 
 Crie um algoritmo com uma matriz de String/Texto
  onde será entrevistado pessoas, o algoritmo deverá
   perguntar ao usuário quantas pessoas deverão ser
    entrevistadas e quantos filhos cada pessoa tem. 
    Para cada pessoa, o algoritmo deverá armazenar o nome
     de cada filho e por último, imprima a pessoa, 
     a quantidade e o nome de cada filho que ela tem.
 
 */

package Arquivos;

import java.util.Scanner;

public class Exercicio_Matriz_3_Pessoas_Entrevistadas {
	
	public static void main(String[] args) {
		
		Scanner pessoa = new Scanner(System.in);
		
		int pessoasEntrevistadas = 0;
		int quantidadeFilhos = 0;
		
		System.out.println("Digite o número de pessoas que serão entrevistadas: ");
		pessoasEntrevistadas = pessoa.nextInt();
		
		//Matriz com apenas linhas
		String [][] nomeFilhos = new String [pessoasEntrevistadas][];
		
		//nomesFilhos.length - Tamanho da matriz
		for (int linha = 0; linha < nomeFilhos.length; linha++ ) {
			
			int numeroDaPessoa = 0;			
			numeroDaPessoa = linha + 1;
			
			System.out.println("Digite a quantidade de filhos que a pessoa "+numeroDaPessoa+" tem: ");
			quantidadeFilhos = pessoa.nextInt();
			
			//Matriz adiciona na linha atual a quantidade de colunas
			nomeFilhos[linha] = new String[quantidadeFilhos];
			
			//nomesFilhos[linha].length - Contando quantas colunas tem na linha
			for (int coluna = 0; coluna < nomeFilhos[linha].length ;coluna++) {
				
				int numeroDoFilho = 0;			
				numeroDoFilho = coluna + 1;
				
				System.out.println("Digite o nome do filho "+ numeroDoFilho +" da pessoa "+ numeroDaPessoa +" :");
				nomeFilhos[linha][coluna] = pessoa.next();
				
			}
			
		}
		
		// Imprimindo os itens da matriz
		
		for (int linha = 0; linha < nomeFilhos.length; linha++) {
			
			int numeroDaPessoa = 0;			
			numeroDaPessoa = linha + 1;
			
			System.out.println("\nPessoa "+ numeroDaPessoa +" tem "+ nomeFilhos[linha].length +" filho(s)");
			
			//nomeFilhos[linha].length - Total de colunas
			for (int coluna = 0; coluna < nomeFilhos[linha].length; coluna++) {
				
				System.out.println(nomeFilhos[linha][coluna]);
				
			}
			
		}
		
	}
	
}
