package MetodosClasses;

public class Materias {
	
	//Atributos
	// public - Modificador de acesso
	// private - Só pode ser lido ou alterado dentro da própria classe
	public String nomeMateria;
	public int quantidadeHoras = 0;
	public int quantidadeAlunos = 0;
//	private int quantidadeAlunos = 0;
	
	public Materias(String nMateria, int qtdHoras, int qtdAlunos) {
		
		System.out.println("Matéria: "+nMateria);
		System.out.println("Carga horária: "+qtdHoras);
		System.out.println("Alunos matriculados: "+qtdAlunos);
		System.out.println("-----------------------\n");
		
		
	}
	
	
	int somaHoras = 0;
	int somaAlunos = 0;
	 
	//Método para somar a quantidade de alunos e carga horária de todos os cursos
	public void soma (int turma, int qtdHoras, int qtdAlunos ) {
		
		somaHoras = somaHoras + qtdHoras;
		somaAlunos = somaAlunos + qtdAlunos;
				
		System.out.println("Turma: "+turma);
		System.out.println("Horas: "+qtdHoras+" - Alunos: "+qtdAlunos);
		System.out.println("Acumulado horas: "+somaHoras + " - Acumulado alunos: "+somaAlunos);
		System.out.println("-----------------------\n");
	}
	
}
