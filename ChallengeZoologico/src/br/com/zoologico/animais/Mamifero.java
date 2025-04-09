package br.com.zoologico.animais;

public class Mamifero extends Animal {
	private String corPredominanteDoPelo;
	private String tipoDoPelo;
	
	//construtor
	public Mamifero(String nome, String especie, String familia, String expectativaDeVida, String alimentacao,
			String corPredominanteDoPelo, String tipoDoPelo) {
		super(nome, especie, familia, expectativaDeVida, alimentacao);
		this.corPredominanteDoPelo = corPredominanteDoPelo;
		this.tipoDoPelo = tipoDoPelo;
	}


	//metodos
	public void exibirInfoPelagem() {
    	System.out.println(" - Cor predominante das penas: " +corPredominanteDoPelo);
    	System.out.println(" - Tipo da plumagem: " +tipoDoPelo);
	}
	
	public void amamentar() {
		System.out.println(nome+ " está amamentando o seu filhote...");
	}

}
