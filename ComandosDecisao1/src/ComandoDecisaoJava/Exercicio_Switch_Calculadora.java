/*
 CRIE UM ALGORITMO COM SWITCH QUE EXIBA AS SEGUINTES OPÇÕES
 E REALIZE A OPERAÇÃO DE DOIS NÚMEROS CONFORME A ESCOLHA DO
 USUÁRIO: 1- ADIÇÃO 2- SUBTRAÇÃO 3- MULTIPLICAÇÃO 4- DIVISÃO
 */

package ComandoDecisaoJava;

import javax.swing.JOptionPane;

//import java.util.Scanner;

public class Exercicio_Switch_Calculadora {
	
	public static void main(String[] args) {
		
		int numero1, numero2, resultado;
		int escolha;
		
		escolha = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha uma das opções a seguir: \n1 - Adição \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão", "Leia com atenção" , JOptionPane.QUESTION_MESSAGE));
		numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro número: ", "Exercício java" , JOptionPane.QUESTION_MESSAGE));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo número: ", "Exercício java" , JOptionPane.QUESTION_MESSAGE));
		
		switch (escolha) {
			case 1: {
				// 1 - ADIÇÃO
				resultado = numero1 + numero2;
			//	System.out.printf("%d + %d = %d", numero1, numero2, resultado);
				JOptionPane.showMessageDialog(null,""+numero1+" + "+numero2+" = "+resultado);
				break;
			}
			case 2: {
				// 2 - SUBTRAÇÃO
				resultado = numero1 - numero2;
			//	System.out.printf("%d - %d = %d", numero1, numero2, resultado);
				JOptionPane.showMessageDialog(null,""+numero1+" - "+numero2+" = "+resultado);
				break;
			}	
			case 3: {
				// 3 - MULTIPLICAÇÃO
				resultado = numero1 * numero2;
			//	System.out.printf("%d x %d = %d", numero1, numero2, resultado);
				JOptionPane.showMessageDialog(null,""+numero1+" x "+numero2+" = "+resultado);
				break;
			}	
			case 4: {
				// 4 - DIVISÃO
				resultado = numero1 / numero2;
			//	System.out.printf("%d / %d = %d", numero1, numero2, resultado);
				JOptionPane.showMessageDialog(null,""+numero1+" / "+numero2+" = "+resultado);
				break;
			}	
			default:
				System.out.println("Escolha inválida.");		
		}
		
		
		// OUTRA MANEIRA 
		/*
		Scanner objetoNumeros = new Scanner(System.in);
		
		int escolha, numero1, numero2;
		
		System.out.println("----MENU----");
		System.out.println("1. Adição");
		System.out.println("2. Subtração");
		System.out.println("3. Multiplicação");
		System.out.println("4. Divisão\n");
		
		System.out.println("Escolha uma opção: ");
		escolha = objetoNumeros.nextInt();
		
		System.out.println("Digite o primeiro número: ");
		numero1 = objetoNumeros.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2 = objetoNumeros.nextInt();
		
		switch (escolha) {
			case 1: {
				System.out.println("ADIÇÃO:");
				System.out.println(""+numero1+" + "+numero2+" = "+(numero1 + numero2));
				break;
			}	
			case 2: {
				System.out.println("SUBTRAÇÃO:");
				System.out.println(""+numero1+" - "+numero2+" = "+(numero1 - numero2));
				break;
			}	
			case 3: {
				System.out.println("MULTIPLICAÇÃO:");
				System.out.println(""+numero1+" x "+numero2+" = "+(numero1 * numero2));
				break;
			}	
			case 4: {
				System.out.println("DIVISÃO:");
				System.out.println(""+numero1+" / "+numero2+" = "+(numero1 / numero2));
				break;
			}	
			default:
				System.out.println("Escolha inválida.");
		}
		*/
		
	}
	
}
