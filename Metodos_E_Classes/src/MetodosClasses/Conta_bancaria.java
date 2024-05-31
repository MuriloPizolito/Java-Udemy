/*
 
 Crie um algoritmo de um caixa eletr�nico 
 que aceite apenas o nome do cliente, dep�sitos e saques.
 
 */

package MetodosClasses;

public class Conta_bancaria {
	
	public String nome;
	public double saldo;
	
	void sacar(double valor) {
		
	// apontar para o atributo da classe	
		this.saldo -= valor;
		
	}
	
	void depositar(double valor) {
		this.saldo += valor;
	}
	

}
