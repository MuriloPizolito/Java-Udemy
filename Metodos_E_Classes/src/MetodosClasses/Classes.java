package MetodosClasses;

/*
  Tudo em Java é uma classe
  
  Classe é um conjunto de regras que um valor / objeto / imagem / vídeo vai seguir
  Quando instanciamos dentro de outros programas usaremos esse conjunto de regras
  para tratar alguma coisa (API)
  
  Dentro da classe temos:
  Métodos - São as funcionalidades
  Atributos - Características (Variáveis)
 */

public class Classes {

	public static void main(String[] args) {
		
		Escola aluno1 = new Escola(50);
		Escola aluno2 = new Escola(2);
		Escola aluno3 = new Escola(3);
		
		aluno1.imprimirNumeros(10, 70);

	}

}
