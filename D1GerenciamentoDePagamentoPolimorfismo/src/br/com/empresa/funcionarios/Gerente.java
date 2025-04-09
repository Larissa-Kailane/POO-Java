package br.com.empresa.funcionarios;

//classe filha - Gerente
public class Gerente extends Funcionario{
	//atributos
	private int quantidadeDeSubordinados;

	//construtor
	public Gerente(String nome, int codigoFuncionario, String departamento, int quantidadeDeSubordinados) {
		super(nome, codigoFuncionario, departamento);
		this.quantidadeDeSubordinados = quantidadeDeSubordinados;
	}
	
	//Encapsulamento - protegendo o atributo quantidadeDeSubordinados
	public int getQuantidadeDeSubordinados() {
		return quantidadeDeSubordinados;
	}
	public void setQuantidadeDeSubordinados(int quantidadeDeSubordinados) {
		this.quantidadeDeSubordinados = quantidadeDeSubordinados;
	}


	//POLIFORMISMO - sobrescrita do método de exibir informações
	@Override
	public void exibirInfoFuncionario() {
		System.out.println(" **GERENTE** ");
		super.exibirInfoFuncionario();
		System.out.println(" - Quantidade de subordinados: " +quantidadeDeSubordinados);
	}

	//POLIMORFISMO - sobrescrita do método de calcular salário
	//O gerente recebe duas vezes o salário base, mais um bônus adc de 500 reais
	@Override
	public double calcularSalario() {
		double salarioBase = super.calcularSalario();
		return (salarioBase * 2) + 500;
	}
	

}
