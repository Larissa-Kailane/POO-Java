package br.com.banco.conta;

public class ContaBancaria {
	//atributos
	private String titular;
	private double saldo;
	
	//construtor
	public ContaBancaria(String titular, double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}
	
	//ENCAPSULAMENTO - PROTEGENDO OS ATRIBUTOS TITULAR E SALDO
	public String getTitular() {
		return titular;
	}
	//Este bloco garante a segurança na alteração do titular da conta
	//Verificação para que o campo não seja nulo
	//esta parte 'titular.matches("[A-Za-zÀ-ÿ ]+")' verifica se na alteração do titular não haverá números e caracteres especiais
	//caso alguma destas verificações não sejam atendidas, a alteração não será realizada
	public void setTitular(String titular) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(" *Solicitação de NOVO TITULAR verificada...");
		if (titular != null && titular.matches("[A-Za-zÀ-ÿ ]+")) {
		this.titular = titular;
		System.out.println(" - Titular alterado com sucesso!");
		System.out.println(" - Novo titular: " +titular);
		} else {
			System.out.println(" !!! Novo titular inválido. Tente novamente !!! ");
			System.out.println(" (Não utilize números ou caracteres especiais) ");
		}
	}

	public double getSaldo() { //Encapsulamento - saldo
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	//método para depositar
	public void depositar(double deposito) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(" *Solicitação de DEPÓSITO no valor de R$" +deposito+ " sendo efetuada...");
		saldo = saldo + deposito;
		System.out.println(" - Deposito efetudado com sucesso! Saldo atualizado: R$" +saldo);
	}

	//método para sacar
	//verifica se o saque é maior que o valor do saldo, caso , o saque não poderá ser efetuado
	public void sacar(double saque) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(" *Solicitação de SAQUE no valor de R$" +saque+ " verificada...");
		if (saque < saldo) {
			 saldo = saldo - saque;
			 System.out.println(" - Saque efetuado com sucesso! Saldo atualizado: R$" +saldo);
		} else {
			System.out.println(" !!! Você NÃO possui saldo suficiente !!! ");
			System.out.println(" (Você possui o valor de R$" +saldo+ " e está tentando sacar o valor de R$" +saque+ ")");
		}
	}
	
	//método para visualizar as informações da conta
	public void visualizarInfoDaConta() {
		System.out.println(" - Titular: " +titular);
		System.out.println(" - Saldo: R$" +saldo);
	}
	
	
}
