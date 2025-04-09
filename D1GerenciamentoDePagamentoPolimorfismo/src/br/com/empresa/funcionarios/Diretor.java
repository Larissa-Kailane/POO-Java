package br.com.empresa.funcionarios;

//classe filha - Diretor
public class Diretor extends Funcionario {
	//atributos
	private String ultimasAtividadesDirigidas;
	
	//construtor
	public Diretor(String nome, int codigoFuncionario, String departamento,String ultimasAtividadesDirigidas) {
		super(nome, codigoFuncionario, departamento);
		this.ultimasAtividadesDirigidas = ultimasAtividadesDirigidas;
	}
	
	//Encapsulamento - protegento o atributo das últimas atividades dirigidas
	public String getUltimasAtividadesDirigidas() {
		return ultimasAtividadesDirigidas;
	}
	public void setUltimasAtividadesDirigidas(String ultimasAtividadesDirigidas) {
		this.ultimasAtividadesDirigidas = ultimasAtividadesDirigidas;
	}


	//POLIMORFISMO - Sobrescrita do método para exibir informações
	@Override
	public void exibirInfoFuncionario() {
		System.out.println(" **DIRETOR** ");
		super.exibirInfoFuncionario();
		System.out.println(" - Últimas atividades dirigidas: " +ultimasAtividadesDirigidas);
	}

	//POLIMORFISMO - Sobrescrita do método para calcular o salário
	//O Diretor recebe 4 vezes o salário base, mais um adc de 950 reais
	@Override
	public double calcularSalario() {
		double salarioBase = super.calcularSalario();
		return (salarioBase * 4) + 950;
	}
	
	
	

}
