package MetodosClasses;

public class Metodos_E_Atributos_Static {

	public static void main(String[] args) {
		
		/*Quando crio um elemento Static eu posso instanciar vários objetos na classe, mas todos vão apontar
		  para o mesmo endereço na memória, é como se eu tivesse várias variáveis e quando eu altero o valor de 
		  uma, todas as outras que estão usando receberão o mesmo valor.*/
		
		Padaria pao1 = new Padaria("Frances", 20, "Pequeno");
		Padaria pao2 = new Padaria("Pão de forma", 10, "Médio");
		Padaria pao3 = new Padaria("Pão Australiano", 35, "Grande");
		
		
		/*Static - temos acesso sem ter que instanciar um objeto da classe, é só definir o valor sem instanciar*/
		Padaria.quantidadePao = 300;
		
		System.out.println("--------------------------\n\n");
		pao1.imprimir();
		pao2.imprimir();
		pao3.imprimir();
		
	}

}
