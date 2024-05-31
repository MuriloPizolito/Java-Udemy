/*
 
 Crie um algoritmo que solicite ao usuário a entrada
  de 3 números inteiros e imprima na tela os valores
   na ordem em que foram digitados, depois imprima
    também os números na ordem crescente.
 
 */


package ArrayJava;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio_Array_1_Ordem_Crescente {
	
	public static void main(String[] args) {
		Scanner objetoNumeros = new Scanner(System.in);
		
		int qtdvezes = 3;
		int [] numeros = new int [qtdvezes];
		
		for (int contador = 0; contador < qtdvezes;contador++) {
				
			numeros [contador] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
			
		}
		
		System.out.println("Números na ordem digitada: ");
		
		for (int linha:numeros) {
			
			System.out.println(linha);
			
		}
		
	// -------------------------------------------------------------	
		System.out.println("Números na ordem crescente: ");
		
	//Arrays.sort - Método para organizar os número em ordem crescente
		Arrays.sort(numeros);
		
		for (int linha:numeros) {
			
			System.out.println(linha);
			
		}
		
	}
	
}
