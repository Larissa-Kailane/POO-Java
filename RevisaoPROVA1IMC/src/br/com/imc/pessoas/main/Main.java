package br.com.imc.pessoas.main;

import br.com.imc.pessoas.Atleta;
import br.com.imc.pessoas.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("\n=========== Pessoa comum ===============\n");
		Pessoa Pessoa1 = new Pessoa("Juliano", 1.75, 67.900);
		Pessoa1.exibirInformacoes();
		Pessoa1.calcularIMC();
		System.out.printf(" - IMC: %.2f", Pessoa1.calcularIMC());
		
		System.out.println("\n=========== Atleta ===============\n");
		Atleta Atleta1 = new Atleta ("Rebeca", 1.55, 58.000, "Gisnática Artística");
		Atleta1.exibirInformacoes();
		Atleta1.calcularIMC();
		System.out.printf(" - IMC: %.2f", Atleta1.calcularIMC());

	}

}
