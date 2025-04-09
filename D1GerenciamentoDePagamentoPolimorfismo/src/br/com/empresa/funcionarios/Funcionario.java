package br.com.empresa.funcionarios;

//classe pai - funcionario
public class Funcionario {
	//atributos
	private String nome;
	private int codigoFuncionario;
	private String departamento;
	
	//construtor - inicializa os atributos
	public Funcionario(String nome, int codigoFuncionario, String departamento) {
		super();
		this.nome = nome;
		this.codigoFuncionario = codigoFuncionario;
		this.departamento = departamento;
	
	}
	
	//encapsulamento
	public String getNome() { //nome
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigoFuncionario() { //codigoFuncionario
		return codigoFuncionario;
	}
	public void setCodigoFuncionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	public String getDepartamento() { //departamento
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	//método para exibir as informações
	public void exibirInfoFuncionario() {
		System.out.println(" - Nome: " +nome);
		System.out.println(" - Código do funcionário: " +codigoFuncionario);
		System.out.println(" - Departamento: " +departamento);
	}
	
	//método para calcular o salario
	public double calcularSalario() {
		double salario = 1780.00;
		return salario;
	}

}
