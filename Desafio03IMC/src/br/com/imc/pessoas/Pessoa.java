package br.com.imc.pessoas;

public class Pessoa {
	//atributos
	private String nome;
	private double peso;
	private double altura;
	
	//construtor - inicializando os atributos da classe
	public Pessoa(String nome, double peso, double altura) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}

	//encapsulamento - nome
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//encapsulamento - peso
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//encapsulamento - altura
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//método para mostrar as informacoes da pessoa
	public void fichaDeInformacoes() {
		System.out.println(" - Nome: " +nome);
		System.out.println(" - Peso: " +peso+ " kg");
		System.out.println(" - Altura: " +altura+ " m");
	}
	
	//método para calcular o imc
	public double calcularIMC() {
		return peso / (altura * altura);
	}
	
	
	
}
