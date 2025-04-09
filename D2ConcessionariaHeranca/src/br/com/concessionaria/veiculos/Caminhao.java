package br.com.concessionaria.veiculos;

//CLASSE FILHA - CAMINHÃO - HERDA DA CLASSE PAI VEICULO
public class Caminhao extends Veiculo{
	//atributos
	private String capacidadeDeCarga;

	//construtor
	public Caminhao(String modelo, String marca, int ano, String capacidadeDeCarga) {
		super(modelo, marca, ano);
		this.capacidadeDeCarga = capacidadeDeCarga;
	}

	//Encapsulamento - protegendo o atributo capacidadeDeCarga 
	public String getCapacidadeDeCarga() {
		return capacidadeDeCarga;
	}
	public void setCapacidadeDeCarga(String capacidadeDeCarga) {
		this.capacidadeDeCarga = capacidadeDeCarga;
	}

	//Polimorfismo - sobrescrita do método para exibir as informações
	@Override
	public void exibirInfoVeiculo() {
		super.exibirInfoVeiculo();
		System.out.println(" - Capacidade de carga: " +capacidadeDeCarga);
	}
	
	
	
	

}
