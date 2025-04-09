//Modele classes para representar, instrutores, aulas, equipamentos. 
//Faça a abstração e identifique possíveis métodos, características de cada classe.

//pacote
package br.com.larissa.academia;

//classe - forma
public class Instrutor {
	//atributos
	private String nome;
	private String aulasPorSemana;
	private String diasDasAulas;
	
	//construtor - inicializando os atributos
	public Instrutor(String nome, String aulasPorSemana, String diasDasAulas) {
		super();
		this.nome = nome;
		this.aulasPorSemana = aulasPorSemana;
		this.diasDasAulas = diasDasAulas;
	}
	//ENCAPSULAMENTO - nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	//ENCAPSUAMENTO - aulasPorSemana
	public String getAulasPorSemana() {
		return aulasPorSemana;
	}
	public void setAulasPorSemana(String aulasPorSemana) {
		this.aulasPorSemana = aulasPorSemana;
	}

	//ENCAPSULAMENTO - diasDasAulas
	public String getDiasDasAulas() {
		return diasDasAulas;
	}
	public void setDiasDasAulas(String diasDasAulas) {
		this.diasDasAulas = diasDasAulas;
	}
	
	
	//método para exibir as informações
	public void exibirFichaInstrutor() {
		System.out.println(" - Nome: " +nome);
		System.out.println(" - Aulas por semana: " +aulasPorSemana);
		System.out.println(" - Dias das aulas: " +diasDasAulas);
	}
	
	//método de status
	public boolean verificarSeEstaDandoAula(boolean dandoAula) {
		if (dandoAula == true) {
			System.out.println(" - O instrutor está dando aula...");
		}
		else {
			System.out.println(" - O instrutor NÃO está dando aula...");
		}
		return dandoAula;
	}
}
