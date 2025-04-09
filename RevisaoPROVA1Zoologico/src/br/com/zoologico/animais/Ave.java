package br.com.zoologico.animais;

public class Ave extends Animal {
	private String corDaPena;

	public Ave(String nome, String especie, int idade, String corDaPena) {
		super(nome, especie, idade);
		this.corDaPena = corDaPena;
	}

	@Override
	public void exibirFicha() {
		super.exibirFicha();
		System.out.println(" - Cor da Pena: " +corDaPena);
	}
	
	public void aveCantando() {
		System.out.println(nome+ " está cantando...");
	}

	
}
