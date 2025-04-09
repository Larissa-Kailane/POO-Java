package br.com.zoologico.animais;

//atributos
public class Animal {
	protected String nome;
	protected String especie;
	private String familia;
	private String expectativaDeVida;
	private String alimentacao; 
	

//construtor
public Animal(String nome, String especie, String familia, String expectativaDeVida,
			String alimentacao) {
		super();
		this.nome = nome;
		this.especie = especie;
		this.familia = familia;
		this.expectativaDeVida = expectativaDeVida;
		this.alimentacao = alimentacao;
	}


//métodos
public void informacoesBase(){
	System.out.println("\n============== Ficha do Animal ================\n");
	System.out.println(" - Nome: " +nome);
	System.out.println(" - Espécie: " +especie);
	System.out.println(" - Família: " +familia);
	System.out.println(" - Expectativa de vida: " +expectativaDeVida);
	System.out.println(" - Alimentação: " +alimentacao);
	
}


public boolean statusAlimentacao(boolean statusAlimento) {
	if (statusAlimento == true) {
	System.out.println(" - Status da Alimentação: (ALIMENTADO)\n");
	} else {
		System.out.println(" - Status da Alimentação: (!NÃO FOI ALIMENTADO!)\n");
	}
	return statusAlimento;
}
}

 