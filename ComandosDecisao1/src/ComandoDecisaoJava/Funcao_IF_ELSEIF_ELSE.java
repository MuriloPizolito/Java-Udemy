package ComandoDecisaoJava;

import java.util.Scanner;

public class Funcao_IF_ELSEIF_ELSE {
	
	public static void main(String[] args) {
		
		/*
		// System.in - Lê as informações do teclado
		// Scanner - Objeto da classe java.util
		Scanner objetoIdade = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		// nextInt - Lê e retorna um número inteiro
		idade = objetoIdade.nextInt();
		
		// if - Se
		if (idade >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
		*/
		
		// Exemplo Média aluno
		
		Scanner objetoNota = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("Digite a nota 1: ");
		nota1 = objetoNota.nextDouble();
		
		System.out.println("Digite a nota 2: ");
		nota2 = objetoNota.nextDouble();
		
		System.out.println("Digite a nota 3: ");
		nota3 = objetoNota.nextDouble();
		
		System.out.println("Digite a nota 4: ");
		nota4 = objetoNota.nextDouble();
		
		// Calcula a média
		media = (nota1 + nota2 + nota3+ nota4) /4;
		
		if (media >= 7) {
			System.out.println("Média: " + media + " - Situação: Aprovado(a).");
		// else if - Senão se
		} else if (media >= 2) {
			System.out.println("Média: " + media +" - Situação: Recuperação.");
		// else - Senão
		} else {
			System.out.println("Média: " + media +" - Situação: Reprovado(a).");
		}
	}
	
}
