package br.com.larissa.academia;

public class Aulas {
	private String tipoDaAula;
	private double duracaoDaAula;
	
	
	public Aulas(String tipoDaAula, double duracaoDaAula) {
		super();
		this.tipoDaAula = tipoDaAula;
		this.duracaoDaAula = duracaoDaAula;
	}

	

	public void exibirAulas() {
		System.out.println(" - Tipo da Aula: " +tipoDaAula);
		System.out.println(" - Duração da aula: " +duracaoDaAula);
	}

	
	
	
}
