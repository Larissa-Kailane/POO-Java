//pacote - package
package br.com.imc.pessoas;

//classe - forma
public class Pessoa {
	//atributos - propriedades - características
	private String nome;
	private double altura;
	private double peso;
	
	//construtor - inicializando os atributos
	public Pessoa(String nome, double altura, double peso) {
		super();
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}
	
	//protegendo os valores
	//ENCAPSULAMENTO - nome
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//ENCAPSULAMENTO - altura
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	//ENCAPSULAMENTO - peso
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}



	//método para exibir as informações da pessoa
	public void exibirInformacoes () {
		System.out.println(" - Nome: " +nome);
		System.out.println(" - Altura: " +altura);
		System.out.println(" - Peso: " +peso);
	}
	
	//método para calcular o IMC
	public double calcularIMC () {
		return peso / (altura * altura);
	}
	
	
}
