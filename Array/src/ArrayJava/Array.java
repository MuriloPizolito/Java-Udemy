package ArrayJava;

public class Array {
	
	public static void main(String[] args) {
		
		int n1, n2, n3, n4, n5;
		
		n1 = 10;
		n2 = 18;
		n3 = 31;
		n4 = 45;
		n5 = 52;
		
		System.out.println("Exemplo com variáveis.");
		System.out.println("Número 1: "+n1);
		System.out.println("Número 2: "+n2);
		System.out.println("Número 3: "+n3);
		System.out.println("Número 4: "+n4);
		System.out.println("Número 5: "+n5);
		
		/*
		O array é semelhante a criação de várias variáveis ele faz a mesma coisa/função 
		
		[] - Significa que estou criando um array
		new - Significa que vou instanciar da classe "int" (exemplo)
		*/
		
		//------------------------------------------------------------------
		System.out.println("------------------------------------------------------------------");
		// Criação de um array com 5 posições
		int [] numeros = new int [5];
		
		// Atribuindo valor para cada posição
		numeros[0] = 19;
		numeros[1] = 25;
		numeros[2] = 39;
		numeros[3] = 43;
		numeros[4] = 90;
		
		// array sempre começa na posição 0
		System.out.println("Imprimindo o array");
		System.out.println("Posição 0: "+numeros[0]);
		System.out.println("Posição 1: "+numeros[1]);
		System.out.println("Posição 2: "+numeros[2]);
		System.out.println("Posição 3: "+numeros[3]);
		System.out.println("Posição 4: "+numeros[4]);
		
		//------------------------------------------------------------------
		System.out.println("------------------------------------------------------------------");
		//Criando o array de letras e atribuindo valor direto de dentro do array
		String [] letras = {"A", "B", "C", "D", "E"};
		
		System.out.println("Imprimindo o array de Letras");
		System.out.println("Posição 0: "+letras[0]);
		System.out.println("Posição 1: "+letras[1]);
		System.out.println("Posição 2: "+letras[2]);
		System.out.println("Posição 3: "+letras[3]);
		System.out.println("Posição 4: "+letras[4]);
	
		//------------------------------------------------------------------
		System.out.println("------------------------------------------------------------------");
		//Criando o array string e atribuindo valor direto de dentro do array
		String [] animais = {"Ave", "Macaco", "Girafa", "Leão", "Cachorro"};
		
		System.out.println("Imprimindo o array animais");
		
	//	for - para
		for (int i = 0; i < 5; i++) {
			System.out.println("Animal posição "+i+" : "+animais[i]);
		}
	}
	
	
	
}
