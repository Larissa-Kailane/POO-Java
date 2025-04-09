package br.com.concessionaria.veiculos;

//CLASSE PAI - VEICULO
public class Veiculo {
	//atributos
	private String modelo;
	private String marca;
	private int ano;
	
	//construtor
	public Veiculo(String modelo, String marca, int ano) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
	}
	
	//Encapsulamento - protegendo os atributos
	public String getModelo() { //modelo
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() { //marca
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() { //ano
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}


	//método para exibir as informações do veículo
	public void exibirInfoVeiculo() {
		System.out.println(" - Modelo: " +modelo);
		System.out.println(" - Marca: " +marca);
		System.out.println(" - Ano: " +ano);
	}

	

}
