// package (pacote) - Pasta do Projeto
package PrimeirosPassosJava;

//Todo o programa JAVA é uma classe
//O nome da classe é o nome do arquivo
public class ImpressaoTexto {
	// Precisamos criar um método
	// public - publico
	// static - estatico
	// void - Retorno / Vazio
	// main - Nome do método, ele é o principal
	// String - texto [ARRAY]
	// Args - Nome do array
	public static void main(String[] args) {
		// System.out - Sistema de saída - É o objeto de saída padrão
		// Print - Imprimir
		// \n - É um caracter de escape que faz a quebra de linha
		System.out.print("Teste!\n");
		
		// ln - posiciona o cursor na linha de baixo, pula uma linha
		System.out.println("Texto simples");
		System.out.println("Texto simples 2");
		
		/* f - Formatted, Formato que permite fazer impressão personalizada
		 	%s - String
		  	%d - Inteiro
		  	%f - Float
		  	%b - Booleano - True or false 
		 */
		System.out.printf("%s", "Nome: Ana Paula\n");
		System.out.printf("%s idade: %d", "Nome: Ana Paula", 25);
		
		// %n - No printf indica uma quebra de linha
		System.out.printf("%n%nNome: %s %nIdade: %d", "Ana Paula", 25);
		
		// Variavel - Espaço para armazenamento temporario 
		int numero1 = 5;
		int numero2 = 10;
		
		System.out.printf("\n\nSoma dos números: %d", (numero1 + numero2));
		
	
	}
	
	
	
}
