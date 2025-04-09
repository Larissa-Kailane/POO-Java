package br.com.empresa.main;

//pacotes importados
import java.util.ArrayList; //importando ArrayList
import java.util.List; //importando listas

import br.com.empresa.folhapagamento.FolhaDePagamento;
import br.com.empresa.funcionarios.Diretor;
import br.com.empresa.funcionarios.Funcionario;
import br.com.empresa.funcionarios.Gerente;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("\n========================== FUNCIONÁRIOS =============================\n");
		//criando a lista 
		List<Funcionario>folhaPagamento = new ArrayList<Funcionario>();
		
		//criando os objetos usando a classe Funcionario, mas especificando as classes filhas
		Funcionario gerente1 = new Gerente("João Marcos", 3456, "Financeiro", 145);
		Funcionario gerente2 = new Gerente("Carolina Souza", 7896, "Marketing", 50);
		Funcionario diretor1 = new Diretor("Aline Costa", 5678, "Administrativo", "Reunião de revisão estratégica");
		Funcionario diretor2 = new Diretor("Paulo Lima", 4328, "Recursos Humanos", "Recrutamento");

		//adc os funcionários criados na lista de uma só vez
		folhaPagamento.addAll(List.of(gerente1, gerente2, diretor1, diretor2));
		
		//criando a Folha de Pagamento usada para exibir as informações dos funcionários
		FolhaDePagamento folhaDePagamento = new FolhaDePagamento();
		folhaDePagamento.listaFuncionarios(folhaPagamento);

	}

}
