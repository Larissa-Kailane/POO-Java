package br.com.main.imc;

import br.com.imc.pessoas.Atleta;
import br.com.imc.pessoas.Pessoa;

public class Main {

	public static void main(String[] args) {
		System.out.println("\n================== CALCULANDO IMC! ===================\n");
		System.out.println("::::::::::::::::::::[Pessoa comum]::::::::::::::::::::\n");
		Pessoa Pessoa1 = new Pessoa ("Augustinho", 78.560, 1.72);
		Pessoa1.fichaDeInformacoes();
		Pessoa1.calcularIMC();
		System.out.printf(" - IMC: %.2f", Pessoa1.calcularIMC());
		
		System.out.println("\n\n======================================================\n");
		
		System.out.println(":::::::::::::[Atleta de alto rendimento]::::::::::::::\n");
		Atleta Atleta1 = new Atleta ("Rebeca", 45.000 ,1.55, "Ginástica artística");
		Atleta1.fichaDeInformacoes();
		Atleta1.mostrarEsportePraticado();
		Atleta1.calcularIMC();
		System.out.printf(" - IMC(ajustado): %.2f", Atleta1.calcularIMC());
		
		System.out.println("\n  _____________________________________________________");
		System.out.println("| Considerando um atleta de alto rendimento, foi feito  |");
		System.out.println("| um ajuste de 5% ao cálculo original do IMC, multi-    |");
		System.out.println("| plicando o cáculo base por 0.95. Caso fosse uma pes-  |");
		System.out.println("| soa comum, o cálculo tradicional seria efetuado e o   |");
		System.out.println("| resultado do IMC seria '18.73' ao invés de '17.79'.   |");
		System.out.println(" _______________________________________________________");
	}

}
