package MetodosClasses;

public class Metodos_Get_e_Set {
	
	public static void main(String[] args) {
		
		// Instanciando - usando todas as propriedades e tudo que tem na classe
		ItensLoja produto1 = new ItensLoja("Celular", 50, "Motorola");
		
		// Aqui podemos alterar os atributos de fora da classe, porque ele está definido como público
		produto1.nomeProduto = "Sapato";
		produto1.quantidadeProduto = 30;
		System.out.println(produto1.nomeProduto);
		System.out.println(produto1.quantidadeProduto);
		
	// Para alterar o valor private, alteramos pelo método set	
		produto1.setFabricanteProduto("Loja");
	// Para acessar os itens de um atributo private fora da classe, precisamos usar o método Get 
		System.out.println(produto1.getFabricanteProduto());
		
		//produto1.
		
	}
	
}
