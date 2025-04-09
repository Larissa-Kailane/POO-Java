//pacote - package
package br.com.imc.pessoas;

//classe - forma
//classe filha Atleta herdando da classe pai Pessoa
public class Atleta extends Pessoa{
	private String esportePraticado;

	//construtor - inicializando os atributos
	public Atleta(String nome, double altura, double peso, String esportePraticado) {
		super(nome, altura, peso);
		this.esportePraticado = esportePraticado;
	}

	//sobrescrita - polimorfismo - o método de exibir informações está assumindo uma nova forma
	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println(" - Esporte praticado: " +esportePraticado);
	}

	//sobrescrita - polimorfismo - o método de calcular o IMC está assumindo uma nova forma
	@Override
	public double calcularIMC() {
		double valorBase = super.calcularIMC();
		double valorComAjuste = valorBase * 0.95;
		return valorComAjuste;
	}
	
	
	
	
	

}
