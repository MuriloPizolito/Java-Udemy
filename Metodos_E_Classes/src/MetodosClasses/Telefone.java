/*
 Crie um algoritmo com 2 status: Ligar e Desligar. 
 
�	Ao chamar o status Ligar, verifique se Você
 já está em uma ligação e exiba uma mensagem
  de ligação Iniciada ou Você já está em uma ligação.
  
�	Ao chamar o status Desligar, verifique se 
você já está em uma ligação e exiba uma mensagem
 de Você não pode desligar por que não está em uma
  ligação ou ligação Encerrada com sucesso.

 */
package MetodosClasses;

public class Telefone {
	
	// boolean -Verdadeiro ou falso
	boolean ligacao = false;
	
	void ligar () {
			
		if(ligacao == true) {
			System.out.println("Você já está em uma ligação.");
		} else {
			// mudando o status para true e iniciando a ligação
			ligacao = true;
			System.out.println("Ligação iniciada.");
		}
		
	}
	
	void desligar() {
		// true significa que estou em ligação e o false não
		if(ligacao == true) {
			System.out.println("Ligação encerrada com sucesso!");	
			ligacao = false;
		} else {
			System.out.println("Você não pode desligar por que não está em uma ligação.");
		}
	}
	
}	
