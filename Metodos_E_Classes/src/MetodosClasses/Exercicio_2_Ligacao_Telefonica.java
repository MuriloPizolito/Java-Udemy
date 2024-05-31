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

public class Exercicio_2_Ligacao_Telefonica {

	public static void main(String[] args) {
		
		// instanciando para ter acesso a classe
		Telefone ligando = new Telefone();
		
		ligando.ligar();
		ligando.ligar();
		ligando.desligar();
		ligando.desligar();
		
		ligando.ligar();
		ligando.desligar();

	}

}
