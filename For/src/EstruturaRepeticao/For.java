package EstruturaRepeticao;

public class For {
	
	public static void main(String[] args) {
		//Usamos o for quando soubermos quantas vezes o comando será executado
		// int contador = 1 - Configura a nossa variável para servir de contador
		// contador <= 10 - Condição para continuar a execuçãpo
		// contador++ - Incremento até o contador atingir o resultado esperado
		// 	INICIALIZAÇÃO; CONDIÇÃO; INCREMENTO	
		/*
		// for - para 
		for (int contador = 1; contador <= 10; contador++) {
			System.out.println("Número: "+contador);
		}
		*/
		
		/*
		// contador-- = decremento
		for (int contador = 10; contador >= 1; contador--) {
			System.out.println("Número: "+contador);
		}
		*/
		
		// incrementando de 2 em 2
		for (int contador = 2; contador <= 10; contador+=2) {
			System.out.println("Número: "+contador);
		}
		
	}
	
}
