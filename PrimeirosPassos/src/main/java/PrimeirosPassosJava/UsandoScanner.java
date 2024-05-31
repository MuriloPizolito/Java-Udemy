package PrimeirosPassosJava;

import java.util.Scanner;

public class UsandoScanner {
	
	public static void main(String[] args) {
		
		//new Scanner - Instancia um objeto da classe
		// System.in - Lê as informações do teclado
		// Scanner - Objeto da classe Scanner
		Scanner objetoNome = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		
		// Ler o que o usuario digitar e armazenar na variavel nome
		String nome = objetoNome.nextLine();
		
		//----------------------------------------------
		
		System.out.println("Digite sua idade: ");
		
		// Ler o que o usuario digitar e armazenar na variavel nome
		int idade = objetoNome.nextInt();
		
		System.out.println("Nome digitado: "+ nome);
		System.out.println("Idade: "+ idade);
		
		/*
		 nextline - Armazena textos
		 */
		
		// -------------------------------------------------
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite: ");
		
		int numeroInteiro = scanner.nextInt(); // Numeros inteiros
		byte numeroByte = scanner.nextByte();  // Aceita apenas um digito
		long numeroLong = scanner.nextLong();  // Numeros longos, aceita números gigantes
		boolean numeroBoleano = scanner.nextBoolean(); // Aceita verdadeiro ou falso
		float numeroFloat = scanner.nextFloat(); // Aceita casas decimais     
		double numeroDouble = scanner.nextDouble(); // Tambem aceita casas decimais  
		// O float tem uma precisão de 6 casas decimais e o double tem uma precisão de 10 casas decimais.
		
		System.out.println("Digitado 1(Inteiro): "+ numeroInteiro);
		System.out.println("Digitado 2(Byte): "+ numeroByte);
		System.out.println("Digitado 3(Long): "+ numeroLong);
		System.out.println("Digitado 4(Boolean): "+ numeroBoleano);
		System.out.println("Digitado 5(Float): "+ numeroFloat);
		System.out.println("Digitado 6(Double): "+ numeroDouble);
		
	}
	
}
