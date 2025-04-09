package br.com.zoologico.animais.main;

import br.com.zoologico.animais.Ave;
import br.com.zoologico.animais.Mamifero;

public class Main {

	public static void main(String[] args) {
		Ave Ave1 = new Ave ("Lua", "corvo", 4, "Preta");
		Ave1.exibirFicha();
		Ave1.aveCantando();
		Ave1.statusAlimentacao(false);
		
		System.out.println("\n====================================\n");
		
		Mamifero Mamifero1 = new Mamifero ("Jorge", "Urso", 10, "marrom");
		Mamifero1.exibirFicha();
		Mamifero1.mamiferoAmamentando();
		Mamifero1.statusAlimentacao(true);
	}

}
