package br.com.seguradora.clientes;

public class ClientePremium extends Cliente{

	public ClientePremium(String nome) {
		super(nome);
	}

	@Override
	public double contratarSeguro(int idade) {
		double valorBase = super.contratarSeguro(idade);
		double valorComDesconto = valorBase * 0.90;
		return valorComDesconto;
	}
	
	

}
