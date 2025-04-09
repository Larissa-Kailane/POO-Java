package br.com.seguradora.clientes.main;

import br.com.seguradora.clientes.Cliente;
import br.com.seguradora.clientes.ClientePremium;

public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente ("João");
		cliente1.exibirNome();
		System.out.printf(" - Valor do seguro: %.2f", cliente1.contratarSeguro(25));
		
		System.out.println("\n\n=========================================================");
		
		Cliente cliente2 = new Cliente ("Marcos");
		cliente2.exibirNome();
		System.out.printf(" - Valor do seguro: %.2f", cliente2.contratarSeguro(30));
		
		System.out.println("\n\n=========================================================");
		
		ClientePremium clienteP1 = new ClientePremium ("Luíza");
		clienteP1.exibirNome();
		System.out.printf(" - Valor do seguro: %.2f", clienteP1.contratarSeguro(32));
	}

}
