/*
 CRIE UM ALGORITMO QUE LEIA UM NÚMERO DIGITADO 
 PELO USUÁRIO E IMPRIMA A TABUADA DESSE NÚMERO. 
 */

package EstruturaRepeticao;

import javax.swing.JOptionPane;

//import java.util.Scanner;

public class Exercicio_For_Tabuada {
	
	public static void main(String[] args) {
		/*
		Scanner objetoNumero = new Scanner(System.in);
		
		int contador, numero;
		
		System.out.println("Digite um número: ");
		numero = objetoNumero.nextInt();
		
		for(contador = 1; contador <= 10; contador++) {
			System.out.printf("%d x %d = %d\n", numero, contador, numero * contador);
		}
		*/
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ", "Tabuada", JOptionPane.QUESTION_MESSAGE));
		
		for (int contador = 1; contador <= 10; contador++) {
			System.out.printf("%d x %d = %d\n", numero, contador, numero * contador);
		}
	}
	
	
}
