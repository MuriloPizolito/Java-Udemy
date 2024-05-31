package MetodosClasses;

public class ItensLoja {
	
	// public - Modificador de acesso
	// Quando definido como público posso acessar de qualquer lugar
	// private - Só pode ser acessado dentro da própria classe ou através do Get e Set
	public String nomeProduto;
	public int quantidadeProduto = 0;
	private String fabricanteProduto;
	
	//Get - Obtem os valores das variáveis / atributos de uma classe
	public String getNomeProduto() {
		return nomeProduto;// return - Retorna o valor do atributo nomeProduto
	 // return this.nomeProduto	
	}

	// Set - Para atribuir/mudar valores de uma variável de uma classe
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto; 
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public String getFabricanteProduto() {
		return fabricanteProduto;
	}

	public void setFabricanteProduto(String fabricanteProduto) {
		this.fabricanteProduto = fabricanteProduto;
	}

	public ItensLoja(String nProduto, int qtdProduto, String fProduto) {
		
		System.out.println("Nome: "+nProduto);
		System.out.println("Quantidade: "+qtdProduto);
		System.out.println("Fabricante: "+fProduto);
		System.out.println("-----------------------\n");
		
	}
}
