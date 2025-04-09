package br.com.larissa.academia.main;

import br.com.larissa.academia.Aulas;
import br.com.larissa.academia.Equipamentos;
import br.com.larissa.academia.Instrutor;

public class Main {

	public static void main(String[] args) {
		Instrutor Instrutor1 = new Instrutor ("Marcos", "3X na semana", "Segunda e Quinta");
		Instrutor1.exibirFichaInstrutor();
		Instrutor1.verificarSeEstaDandoAula(false);
		
		Aulas Aula1 = new Aulas ("Pilates", 2.30);
		Aula1.exibirAulas();
		
		Equipamentos Equipamento1 = new Equipamentos ("legij", "pernas");
		Equipamento1.exibirInfoEquipamento();

	}

}
