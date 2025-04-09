package br.com.concessionaria.veiculos;

//CLASSE FILHA - MOTO - HERDA DA CLASSE PAI VEICULO
public class Moto extends Veiculo {
	//atributos
	private String tipoDeTransmissao;

	//construtor
	public Moto(String modelo, String marca, int ano, String tipoDeTransmissao) {
		super(modelo, marca, ano);
		this.tipoDeTransmissao = tipoDeTransmissao;
	}
	
	//encapsulamento - protegendo o atributo tipoDeTransmissao
	public String getTipoDeTransmissao() {
		return tipoDeTransmissao;
	}
	public void setTipoDeTransmissao(String tipoDeTransmissao) {
		this.tipoDeTransmissao = tipoDeTransmissao;
	}

	//polimorfismo - sobrescrita do método para exibir as informações, adc o tipo de transmissão 
	@Override
	public void exibirInfoVeiculo() {
		super.exibirInfoVeiculo();
		System.out.println(" - Tipo da transmissão de força para a roda traseira: " +tipoDeTransmissao);
	}
	
	

}
