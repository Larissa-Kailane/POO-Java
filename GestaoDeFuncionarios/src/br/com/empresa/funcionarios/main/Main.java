package br.com.empresa.funcionarios.main;

import br.com.empresa.funcionarios.Desenvolvedor;
import br.com.empresa.funcionarios.Estagiario;
import br.com.empresa.funcionarios.Gerente;

public class Main {
    public static void main(String[] args) {
    	//DESENVOLVEDOR
        // Instanciando a classe Desenvolvedor
    	System.out.println("\n======================= *FUNCIONÁRIOS DA EMPRESA* =======================\n");
    	System.out.println(" (DESENVOLVEDORES)\n");
    	//PRIMEIRO DESENVOLVEDOR ------------------------
        Desenvolvedor dev1 = new Desenvolvedor("Paul Atreides", 202, 100.0, "123.456.789-00", "paulatreides@gmail.com", 160.0, "Java", "Spring", "pleno");
        // Exibir as informacoes
        dev1.informacoesFuncionario();
        // Chamar o método de calcular o salario e exibir
        System.out.printf(" - Salário total: R$%.2f%n",dev1.calcularSalario());
        System.out.println("\n--------------------------------------------------------------------------");
        
        //SEGUNDO DESENVOLVEDOR ---------------------------
        Desenvolvedor dev2 = new Desenvolvedor("Murilo Eduardo", 408, 100.0, "222.902.709-80", "muriloeduardo@gmail.com", 190.0, "Java", "Spring", "junior");
        // Exibir as informacoes
        dev2.informacoesFuncionario();
        // Chamar o método de calcular o salario e exibir
        System.out.printf(" - Salário total: R$%.2f%n",dev2.calcularSalario());

        System.out.println("\n==========================================================================\n");
        
        //GERENTE
        // Instanciando a classe Gerente
        System.out.println(" (GERENTES)\n");
        //PRIMEIRO GERENTE -----------------------------
        Gerente gerente1 = new Gerente("Ana Priscila", 301, 155.0, "167.684.907-00", "anapriscila@gmail.com", 175.0, 5200.0, 10);
        // Exibindo as informações do gerente
        gerente1.informacoesFuncionario();
        // Chamar o método de calcular o salario e exibir
        System.out.printf(" - Salário total: R$%.2f%n",gerente1.calcularSalario());
        System.out.println("\n--------------------------------------------------------------------------");
        
        //SEGUNDO GERENTE ------------------------------
        Gerente gerente2 = new Gerente("Luciana Campos", 807, 155.0, "200.090.343-34", "lucianacampos@gmail.com", 180.0, 5200.0, 12);
        // Exibindo as informações do gerente
        gerente2.informacoesFuncionario();
        // Chamar o método de calcular o salario e exibir
        System.out.printf(" - Salário total: R$%.2f%n",gerente2.calcularSalario());
        System.out.println("\n==========================================================================\n");

        //ESTAGIÁRIO
        // Instanciando a classe Estagiario
        System.out.println(" (ESTAGIÁRIOS)\n");
        //PRIMEIRO ESTAGIÁRIO ------------------------------
        Estagiario estagiario1 = new Estagiario("Pedro Alves", 403, 31.0, "654.987.123-00", "pedroalves@gmail.com", 122.0, 300.0);
        // Exibindo as informações do estagiário
        estagiario1.informacoesFuncionario();
        // Calculando e exibindo o salário
        System.out.printf(" - Salário total: R$%.2f%n",estagiario1.calcularSalario());
        System.out.println("\n--------------------------------------------------------------------------");
        
        //SEGUNDO ESTAGIÁRIO ------------------------------------
        Estagiario estagiario2 = new Estagiario("Clarice Martins", 101, 31.0, "224.987.098-23", "claricemartins@gmail.com", 150.0, 300.0);
        // Exibindo as informações do estagiário
        estagiario2.informacoesFuncionario();
        // Calculando e exibindo o salário
        System.out.printf(" - Salário total: R$%.2f%n",estagiario2.calcularSalario());
    }
}
