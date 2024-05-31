/*
 
 Crie um algoritmo de um caixa eletr�nico 
 que aceite apenas o nome do cliente, dep�sitos e saques.
 
 */

package MetodosClasses;

public class Exercicio_1_Caixa_Eletronico {

	public static void main(String[] args) {
		
		Conta_bancaria operacao = new Conta_bancaria();
		
		operacao.nome = "Murilo";
		operacao.saldo = 100.0;
		
		System.out.println("Cliente: "+operacao.nome);
		System.out.println("Saldo atual: "+operacao.saldo);
		System.out.println("--------------------------");
		
		//---------------------------------------------------
		
		operacao.depositar(200); 

		System.out.println("Saldo atual: "+operacao.saldo);
		System.out.println("--------------------------");

		//---------------------------------------------------
		
		operacao.sacar(20); 

		System.out.println("Saldo atual: "+operacao.saldo);
		System.out.println("--------------------------");
		
		//---------------------------------------------------
		
		operacao.sacar(80); 

		System.out.println("Saldo atual: "+operacao.saldo);
		System.out.println("--------------------------");
		
		//---------------------------------------------------
		
		operacao.depositar(40.75); 

		System.out.println("Saldo atual: "+operacao.saldo);
		System.out.println("--------------------------");
	}

}
