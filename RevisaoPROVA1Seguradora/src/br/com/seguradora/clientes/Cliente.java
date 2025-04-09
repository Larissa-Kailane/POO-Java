package br.com.seguradora.clientes;

public class Cliente {
	private String nome;

	public Cliente(String nome) {
		super();
		this.nome = nome;
	}
	
	public void exibirNome() {
		System.out.println(" \n- Nome: " +nome);
	}
	
	public double contratarSeguro(int idade) {
		if (idade <= 25) {
			return 3000;
		}
		else {
			return 2000;
		}
	}

}
