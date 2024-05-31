/*
 CRIE UM ALGORITMO USANDO FOR QUE LEIA DUAS NOTAS DE 3 ALUNOS, E PARA CADA ALUNO, CALCULE A MÉDIA
 E EXIBA NA TELA A SITUAÇÃO APROVADO OU REPROVADO CONSIDERANDO A MÉDIA COMO 6 E NO FINAL, CALCULE
 A MÉDIA DA TURMA E EXIBA NA TELA. 
 */


package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_For_Media_Aluno_Turma {
	
	public static void main(String[] args) {
		
		String aluno;
		float nota1,nota2,media, somaMedias, mediaTurma;
		somaMedias = 0;
		int contador;
		
		for(contador = 1; contador <=3; contador++) {
			aluno = JOptionPane.showInputDialog("Digite o nome do aluno: ");
			
			nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
			nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));
			
			media = (nota1 + nota2) / 2;
			somaMedias = somaMedias + media;
			
			System.out.println("Aluno(a): "+aluno);
			System.out.println("Media: "+media);
			
			if(media >= 6) {
				System.out.println("Aluno(a) Aprovado(a)\n");
			}else {
				System.out.println("Aluno(a) provado(a)\n");
			}
		}
		
		mediaTurma = somaMedias/3;
		System.out.println("\nMédia da turma: "+mediaTurma);
		
	}
	
}
