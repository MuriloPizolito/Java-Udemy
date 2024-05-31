package MetodosClasses;

public class Celular_teste {

	boolean ligacao = false;
	
	
	void ligar() {
		
		if(ligacao == true) {
			System.out.println("Você já está em uma ligação.");
		}else {
			ligacao = true;
			System.out.println("Ligação iniciada com sucesso!");
		}
		
	}
	
	void desligar() {
		
		if(ligacao == true) {
			System.out.println("Ligação encerrada.");
			ligacao = false;
		}else {
			System.out.println("Você não está em ligação.");
		}
		
	}
	
	
}
