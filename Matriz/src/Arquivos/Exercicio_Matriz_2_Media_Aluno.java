/*
 
 Crie um algoritmo com uma matriz 3 x 3 que permita
  a entrada de 3 notas de 3 alunos digitadas pelo usuário,
   na sequência, imprima todos as notas que foram digitadas
    e imprima também a média de cada aluno e a 
    situação 
    Aprovado (>=6), 
    Recuperação (>=2) ou 
    Reprovado (<2). 
 
 */

package Arquivos;

import java.util.Scanner;

public class Exercicio_Matriz_2_Media_Aluno {
	
	public static void main(String[] args) {
		Scanner objetoNumero = new Scanner(System.in);
		
		float [][] notas = new float [3][3]; 
		
		for (int linha = 0; linha < 3; linha++) {
			System.out.println("");
			for (int coluna = 0; coluna < 3; coluna++ ) {
				
				int numeroNota = 0;
				numeroNota = coluna + 1;
				System.out.print("Digite a nota " + numeroNota+ ": ");
				notas[linha][coluna] = objetoNumero.nextFloat();
				//System.out.println("");
				
			}
		}
		
		for (int linha = 0; linha < 3; linha++) {
			
			for (int coluna = 0; coluna < 3; coluna++ ) {
				
				System.out.print(notas[linha][coluna]+"  ");
				
			}
			
			System.out.println("");
		}
		
		System.out.println("\nCalculando a media de cada aluno\n");
		
		float somaNotas, mediaAluno;
		
		for (int linha = 0; linha < 3; linha++) {
			
			somaNotas = 0;
			
			for (int coluna = 0; coluna < 3; coluna++) {
				//somaNotas += notas[linha][coluna];
				somaNotas = somaNotas + notas[linha][coluna];
				
			}
			
			int numeroAluno = 0;
			numeroAluno = linha + 1;
			
			mediaAluno = somaNotas/3;
			
			System.out.println("Média do aluno "+ numeroAluno + " = "+ mediaAluno);
			
			if (mediaAluno >= 6) {
				System.out.println("Aluno aprovado");
			} else if (mediaAluno >= 2) {
				System.out.println("Aluno de recuperação");
			} else {
				System.out.println("Aluno reprovado");
			}
			
			System.out.println("");
			
		}
		

		
	}
	
}
