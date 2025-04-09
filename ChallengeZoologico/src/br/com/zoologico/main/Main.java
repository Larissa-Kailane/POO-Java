package br.com.zoologico.main;

import br.com.zoologico.animais.Aves;

import br.com.zoologico.animais.Mamifero;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("\n:::::::::::::::: [BEM-VIND@ AO ZOOLÓGICO DIVERTIDO!] ::::::::::::::::\n");
		
		System.out.println("\n____________________*AVES*____________________\n");
		Aves ave1 = new Aves("Yuki", "Rouxinol", "Muscicapidae","3-4 anos", "Insetos", "Creme", "Acastanhado");
		ave1.informacoesBase();
		ave1.exibirInfoPlumagem();
		ave1.statusAlimentacao(true);
		ave1.aveCantando();
		
		Aves ave2 = new Aves("Margarida", "Beija-flor", "Trochilidae", "3-5 anos", "Nectar", "Azul", "Colorida");
		ave2.informacoesBase();
		ave2.exibirInfoPlumagem();
		ave2.statusAlimentacao(true);
		ave2.aveCantando();
		
		Aves ave3 = new Aves("Fefo", "Canário-do-campo", "Thraupidae","30 anos", "Insetos e sementes", "Verde", "Colorida");
		ave3.informacoesBase();
		ave3.exibirInfoPlumagem();
		ave3.statusAlimentacao(false);
		ave3.aveCantando();
		
		System.out.println("\n===============================================\n");
		System.out.println("\n__________________*MAMÍFEROS*__________________\n");
		
		Mamifero mamifero1 = new Mamifero("Caty", "Onça", "Felidae", "12-15 anos", "Carnes", "Amarelo-dourado", "Amarelo-dourado com pintas pretas");
		mamifero1.informacoesBase();
		mamifero1.exibirInfoPelagem();
		mamifero1.statusAlimentacao(true);
		mamifero1.amamentar();
		
		Mamifero mamifero2 = new Mamifero("Lua", "Coala", "Phascolarctidae", "13-18 anos", "Folhas de eucalipto", "Cinza", "Cinza ao marrom, com algumas regiões brancas");
		mamifero2.informacoesBase();
		mamifero2.exibirInfoPelagem();
		mamifero2.statusAlimentacao(false);
		mamifero2.amamentar();
		
		Mamifero mamifero3 = new Mamifero("Alexa", "Leoa", "Felidae", "15-16 anos", "Carnes", "Amarelo acinzentado", "Amarelo acinzentado com manchas claras");
		mamifero3.informacoesBase();
		mamifero3.exibirInfoPelagem();
		mamifero3.statusAlimentacao(false);
		mamifero3.amamentar();



	}

}


