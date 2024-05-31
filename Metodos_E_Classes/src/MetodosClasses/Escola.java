package MetodosClasses;


// Classe
// public - Modificador de acesso - public / private / protected
// class - Identifica para o Java que é uma classe
// Nome da classe - Escola
public class Escola {
	
	public Escola(int aluno) {
		
		/*
		 Dentro da classe eu posso criar quantos objetos / atributo eu quiser
		 
		 
		 Exemplo:
		 - Posso criar outras escolas com objetos e cada objeto será um objeto separado
		 possuindo suas próprias características, mas todos vão seguir as regras da classe

		 */
		
		System.out.println("Aluno: "+aluno);
		
	}
	
	public void imprimirNumeros(int valorInicio, int valorFinal) {
		
		for (int contador = valorInicio; contador <= valorFinal; contador+=20) {
			
			System.out.println("Número: "+contador);
			
		}
		
	}
	
}
