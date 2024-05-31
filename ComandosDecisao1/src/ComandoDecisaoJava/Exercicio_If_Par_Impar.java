/*
 CRIE UM ALGORITMO QUE LEIA UM NÚMERO E VERIFIQUE SE ELE É PAR OU ÍMPAR 
*/

package ComandoDecisaoJava;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class Exercicio_If_Par_Impar {
	
	public static void main(String[] args) {
		
		Scanner objetoNumero = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número inteiro: ");
		
		numero = objetoNumero.nextInt();
		
		// % - pega o resto da divisão
		if (numero % 2 == 0) {
			System.out.println("O número: "+ numero + ", é par.");
		} else {
			System.out.println("O número: "+ numero + ", é ímpar.");
		}
		
		
		/* 
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		
		if (numero % 2 == 0) {
			JOptionPane.showMessageDialog(null,"O número é par");
		}else {
			JOptionPane.showMessageDialog(null, "O número é ímpar");
		}
		*/
	}
	
}
