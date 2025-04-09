package br.com.concessionaria.veiculos;

//CLASSE FILHA - CARRO - HERDA DA CLASSE PAI VEICULO
public class Carro extends Veiculo {
	//atributos
	private int quantidadeDePortas;
	
	//construtor
	public Carro(String modelo, String marca, int ano, int quantidadeDePortas) {
		super(modelo, marca, ano);
		this.quantidadeDePortas = quantidadeDePortas;
	}

	//encapsulamento - protegendo o atributo quantidadeDePortas
	public int getQuantidadeDePortas() {
		return quantidadeDePortas;
	}
	public void setQuantidadeDePortas(int quantidadeDePortas) {
		this.quantidadeDePortas = quantidadeDePortas;
	}

	//polimorfismo - sobrescrita do método para exibir informações, mostrando a quantidade de portas do carro
	@Override
	public void exibirInfoVeiculo() {
		super.exibirInfoVeiculo();
		System.out.println(" - Quantidade de portas: " +quantidadeDePortas);
	}
	
	
	
	
	
	

}
