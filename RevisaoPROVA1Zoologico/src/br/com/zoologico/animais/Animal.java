//pacote - package
package br.com.zoologico.animais;

//classe - forma
public class Animal {
	protected String nome;
	private String especie;
	private int idade;
	
	//construtor
	public Animal(String nome, String especie, int idade) {
		super();
		this.nome = nome;
		this.especie = especie;
		this.idade = idade;
	}
	
	//Encapsulamento
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//método para exibir as informações
	public void exibirFicha() {
		System.out.println(" - Nome: " +nome);
		System.out.println(" - Especie: " +especie);
		System.out.println(" - Idade: " +idade);
	}

	//método para alimentação do animal
	public boolean statusAlimentacao(boolean status) {
		if (status == true) {
			System.out.println(" ANIMAL ALIMENTADO ");
		}
		else {
			System.out.println(" O ANIMAL AINDA NÃO FOI ALIMENTADO!!!");
		}
		return status;
	}
	
	
	
}
