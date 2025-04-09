package br.com.concessionaria.main;

//pacotes importados
import br.com.concessionaria.veiculos.Caminhao;
import br.com.concessionaria.veiculos.Carro;
import br.com.concessionaria.veiculos.Moto;

public class Main {

	public static void main(String[] args) {
		//Instanciando... - tirando o objeto da forma
		System.out.println("\n-------------------------- VEÍCULOS ---------------------------\n");
		System.out.println(" *CARRO*\n");
		Carro carro1 = new Carro("Toyota Corolla", "Toyota", 1966, 4);
		carro1.exibirInfoVeiculo();
		System.out.println("\n---------------------------------------------------------------\n");
		
		System.out.println(" *MOTO*\n");
		Moto moto1 = new Moto("BMW R 1300 GS", "BMW", 2024, "Cardã");
		moto1.exibirInfoVeiculo();
		System.out.println("\n---------------------------------------------------------------\n");
		
		System.out.println(" *CAMINHÃO*\n");
		Caminhao caminhao1 = new Caminhao("Volvo FH 540", "Volvo", 2018, "80 toneladas");
		caminhao1.exibirInfoVeiculo();


	}
}
