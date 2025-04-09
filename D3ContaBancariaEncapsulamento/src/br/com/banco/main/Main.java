package br.com.banco.main;

import br.com.banco.conta.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		System.out.println("\n::::::::::::::::::::::::::::::: CONTAS BANCÁRIAS ::::::::::::::::::::::::::::::\n");
		//criando as contas...
		System.out.println(" °CONTA 1°\n");
		ContaBancaria conta1 = new ContaBancaria ("Lucas Alvez", 1450.50);
		conta1.visualizarInfoDaConta();
		conta1.depositar(670.90);
		conta1.sacar(340.90);
		//testando a verificação do encapsulamento
		conta1.setTitular("67yuri");
		
		System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		
		System.out.println(" °CONTA 2°\n");
		ContaBancaria conta2 = new ContaBancaria ("Luana Marques", 2390.50);
		conta2.visualizarInfoDaConta();
		conta2.depositar(820.90);
		//testando a verificação do saque no método sacar - tentando sacar um valor maior que o saldo
		conta2.sacar(3900.90);
		//testando a verificação do encapsulamento
		conta2.setTitular("Luana Vaz");
		
		

	}

}
