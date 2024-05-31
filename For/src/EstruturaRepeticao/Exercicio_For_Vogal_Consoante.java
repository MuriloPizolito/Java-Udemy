package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_For_Vogal_Consoante {
	
	public static void main(String[] args) {
		
		String nome;
		int nomesVogal = 0;
		int nomesConsoante = 0;
		
		for (int contador = 1; contador <= 3; contador++) {
			
			nome = JOptionPane.showInputDialog(null, "Digite o nome "+ contador+" :", "Leia com atenção!", JOptionPane.QUESTION_MESSAGE);
			
			/*
tira os espaços em branco			-	System.out.println("nome.trim: " + nome.trim());
transforma tudo em letra minuscula	-	System.out.println("nome.toLowerCase: " + nome.toLowerCase());
pega a primeira letra				-	System.out.println("nome.charAt: " + nome.charAt(0));
			*/
			
			//trim - remove os espaços em branco do inicio do nome
			//toLowerCase - deixa todas as letras minusculas
			//charAt(0) - pega a primeira letra da variável nome
			if ( nome.trim().toLowerCase().charAt(0) == 'a' || nome.trim().toLowerCase().charAt(0) == 'e' || 
					nome.trim().toLowerCase().charAt(0) == 'i' ||
					nome.trim().toLowerCase().charAt(0) == 'o' || 
					nome.trim().toLowerCase().charAt(0) == 'u')  {
				
					nomesVogal = nomesVogal + 1; // nomesVogal++;
					
			}
			
		}
		
		nomesConsoante = 3 - nomesVogal;
		
		System.out.println("Total de nomes com vogais: "+nomesVogal);
		System.out.println("Total de nomes com consoante: "+nomesConsoante);
		
	}
	
}
