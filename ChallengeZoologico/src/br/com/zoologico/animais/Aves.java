package br.com.zoologico.animais;

public class Aves extends Animal {
	private String corPredominanteDasPenas;
	private String tipoDaPlumagem;

//construtor
    public Aves(String nome, String especie, String familia, String expectativaDeVida,
			String alimentacao, String corPredominanteDasPenas, String tipoDaPlumagem) {
		super(nome, especie, familia, expectativaDeVida, alimentacao);
		this.corPredominanteDasPenas = corPredominanteDasPenas;
		this.tipoDaPlumagem = tipoDaPlumagem;
	}


//metodos
    public void exibirInfoPlumagem() {
    	System.out.println(" - Cor predominante das penas: " +corPredominanteDasPenas);
    	System.out.println(" - Tipo da plumagem: " +tipoDaPlumagem);
    
    }
    
	public void aveCantando() {
		System.out.println(nome+ " está cantando...");	
	}

}
