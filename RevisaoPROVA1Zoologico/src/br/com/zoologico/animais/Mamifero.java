package br.com.zoologico.animais;

public class Mamifero extends Animal {
	private String corDoPelo;

	public Mamifero(String nome, String especie, int idade, String corDoPelo) {
		super(nome, especie, idade);
		this.corDoPelo = corDoPelo;
	}

	@Override
	public void exibirFicha() {
		super.exibirFicha();
		System.out.println(" - Cor do pelo: " +corDoPelo);
	}
	
	public void mamiferoAmamentando() {
		System.out.println(nome+ " está amamentando...");
	}
	
	
}
