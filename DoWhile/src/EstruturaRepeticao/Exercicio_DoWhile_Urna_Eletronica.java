/*
 CRIE UM ALGORITMO USANDO DoWHILE, SWITCH CASE E IF QUE RECEBA 
 O NOME DE 3 CANDIDATOS E EM SEGUIDA SOLICITE N VOTOS A ESSES 
 CANDIDATOS, SÓ ENCERRE O PROGRAMA QUANDO DIGITAR 0 E EM SEGUIDA,
 IMPRIMA O TOTAL DE VOTOS QUE CADA CANDIDATO RECEBEU E APRESENTE 
 O VENCEDOR DA ELEIÇÃO.
 */

package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_DoWhile_Urna_Eletronica {
	
	public static void main(String[] args) {
		
		String candidato1, candidato2, candidato3;
		int votosCandidato1, votosCandidato2, votosCandidato3;
		int escolha, totalVotos, maiorVotacao;
		
		votosCandidato1 = votosCandidato2 = votosCandidato3 = 0;
		
		candidato1 = JOptionPane.showInputDialog(null,"Digite o nome do candidato 1: ", "Leia com atenção", JOptionPane.QUESTION_MESSAGE);
		candidato2 = JOptionPane.showInputDialog(null,"Digite o nome do candidato 2: ", "Leia com atenção", JOptionPane.QUESTION_MESSAGE);
		candidato3 = JOptionPane.showInputDialog(null,"Digite o nome do candidato 3: ", "Leia com atenção", JOptionPane.QUESTION_MESSAGE);
		
		totalVotos = 0;
		
		do {
			//escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do seu candidato para votar (e 0 para sair):" "\n1 - "+candidato1+"\n2 - "+candidato2+"\n3 - "+candidato3+" "));
			escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do seu candidato para votar (e 0 para sair):"
					+ "\n1 - "+candidato1+"\n2 - "+candidato2+"\n3 - "+candidato3+" "));
			
			switch (escolha) {
			// caso 1
			case 1: {
				//Somando 1 na variável votos
				votosCandidato1++;
				totalVotos++;
				break;
			}	
			case 2: {
				//Somando 1 na variável votos
				votosCandidato2++;
				totalVotos++;
				break;
			}	
			case 3: {
				//Somando 1 na variável votos
				votosCandidato3++;
				totalVotos++;
				break;
			} 
			default: {
				if(escolha != 0) {
					System.out.println("Voto inválido");
				}
			}
		}
			
			
		}while(escolha != 0);
		
		JOptionPane.showMessageDialog(null,candidato1 + " - " + votosCandidato1 + " votos!" );
		JOptionPane.showMessageDialog(null,candidato2 + " - " + votosCandidato2 + " votos!" );
		JOptionPane.showMessageDialog(null,candidato3 + " - " + votosCandidato3 + " votos!" );
		JOptionPane.showMessageDialog(null,"Total de votos da eleição: "+totalVotos);
		
		maiorVotacao = votosCandidato1;
		
		if(votosCandidato2 > maiorVotacao) {
			maiorVotacao = votosCandidato2;
		}
		
		if(votosCandidato3 > maiorVotacao) {
			maiorVotacao = votosCandidato3;
		}
		
		
		if(votosCandidato1 == maiorVotacao) {
			System.out.println(candidato1 + " ganhou a eleição com " + votosCandidato1 + " votos!");
			JOptionPane.showMessageDialog(null,candidato1 +" ganhou a eleição com: "+votosCandidato1+" votos!");
		}
		if(votosCandidato2 == maiorVotacao) {
			System.out.println(candidato2 + " ganhou a eleição com " + votosCandidato2 + " votos!");
			JOptionPane.showMessageDialog(null,candidato2 +" ganhou a eleição com: "+votosCandidato2+" votos!");
		}
		if(votosCandidato3 == maiorVotacao) {
			System.out.println(candidato3 + " ganhou a eleição com " + votosCandidato3 + " votos!");
			JOptionPane.showMessageDialog(null,candidato3 +" ganhou a eleição com: "+votosCandidato3+" votos!");
		}
		
	}
	
}
