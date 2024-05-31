/*
CRIE UM ALGORITMO QUE LEIA DOIS NÚMERO E APRESENTE A DIFERENÇA ENTRE ELES
*/

package ComandoDecisaoJava;

import javax.swing.JOptionPane;

//import java.util.Scanner;

public class Exercicio_If_Diferenca_Entre_Dois_Numeros {
	
	public static void main(String[] args) {
		
		int numero1, numero2, diferenca;
		
		// Recebe os números e armazena na variável
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		// Com essa condição o resultado nunca será negativo, sera fará a subtração com o número que for maior primeiro
		if (numero1 >= numero2) {
			
			diferenca = numero1 - numero2;
			
			System.out.println("Número 1: "+ numero1);
			System.out.println("Número 2: "+ numero2);
			System.out.println("Resultado: "+ numero1 +" - "+ numero2 +" = "+ diferenca);
			
		}else {
			
			diferenca = numero2 - numero1;
			
			System.out.println("Número 2: "+ numero2);
			System.out.println("Número 1: "+ numero1);
			System.out.println("Resultado: "+ numero2 +" - "+ numero1 +" = "+ diferenca);
		}
		
		
		
		/*
		Scanner objetoNumero1 = new Scanner(System.in);
		Scanner objetoNumero2 = new Scanner(System.in);
		
		int numero1, numero2, subtracao;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = objetoNumero1.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2 = objetoNumero2.nextInt();
		
		subtracao = numero1 - numero2;
		
		System.out.println("O resultado é: "+ subtracao);
		*/
	}
	
}
