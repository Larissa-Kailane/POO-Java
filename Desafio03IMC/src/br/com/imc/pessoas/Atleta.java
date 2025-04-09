package br.com.imc.pessoas;

//atleta herda da classe pessoa
public class Atleta extends Pessoa {
	private String esportePraticado;

	//construtor
	public Atleta(String nome, double peso, double altura, String esportePraticado) {
		super(nome, peso, altura);
		this.esportePraticado = esportePraticado;
	}
	
	//método para mostrar o esporte que o atleta pratica
	public void mostrarEsportePraticado() {
		System.out.println(" - Esporte: " +esportePraticado);
	}

	//sobrescrita - polimorfismo
	@Override
	public double calcularIMC() {
		double calculoBaseIMC = super.calcularIMC();
		double calculoComAjuste = calculoBaseIMC * 0.95;
		return calculoComAjuste;
	}
	

	
}
