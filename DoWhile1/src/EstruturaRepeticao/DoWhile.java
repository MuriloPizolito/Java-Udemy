package EstruturaRepeticao;

public class DoWhile {
	
	public static void main(String[] args) {
		// EXEMPLO 1 
		/*
		int contador = 1;
		
		// do - FAÇA
		// executa o código pelo menos uma vez e depois ele testa a condição
		do {
			
			System.out.println("Número: "+contador);
			
			//contador++ = contador + 1;
			contador++;
			
		// while - enquanto	
		} while (contador <= 10);
		*/
		
		
		// EXEMPLO 2
		/*
		// conta de 10 a 1
		int contador = 10;
		
		// do - FAÇA
		// executa o código pelo menos uma vez e depois ele testa a condição
		do {
			
			System.out.println("Número: "+contador);
			
			//contador-- = contador - 1;
			contador--;
			
		// while - enquanto	
		} while (contador >= 1);
		*/
		
		
		// EXEMPLO 3
		// conta do 0 a 100 de 5 em 5
		int contador = 0;
		
		// do - FAÇA
		// executa o código pelo menos uma vez e depois ele testa a condição
		do {
			
			System.out.println("Número: "+contador);
			
			//contador+=5 = contador + 5;
			// conta de 5 em 5
			contador+=5;
			
		// while - enquanto	
		} while (contador <= 100);
	}
	
}
