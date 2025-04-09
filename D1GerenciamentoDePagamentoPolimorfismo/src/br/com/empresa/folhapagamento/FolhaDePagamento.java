package br.com.empresa.folhapagamento;

//pacotes importados
import java.util.List; //interface de listas
import br.com.empresa.funcionarios.Funcionario;

//classe FolhaDePagamento
public class FolhaDePagamento {
	
	//método para a lista de funcionarios - folha de pagamento
	//recebe como parâmetro uma lista, que armazena objetos do tipo funcionario e tem o nome FolhaPagamento (variável que armazena funcionario)
	public void listaFuncionarios(List<Funcionario>folhaPagamento) {
		//loop for-each -- percorre a lista de funcionarios (a FolhaPagamento) e chama os métodos
		for (Funcionario funcionario : folhaPagamento) {
			funcionario.exibirInfoFuncionario();
			System.out.printf(" - Salário: R$%.2f\n\n", funcionario.calcularSalario());
		}
		
	}

}
