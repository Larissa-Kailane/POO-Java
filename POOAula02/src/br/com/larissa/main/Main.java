package br.com.larissa.main;

import br.com.larissa.animais.Animal;

public class Main {

	public static void main(String[] args) {
		//para criar um novo animal, basta repetir o processo
				//é muito importante que os atributos estejam na ordem correta 
				Animal animal1= new Animal ("O", "Alfredo", "um", "gato", "Miaaaaau!"); //passando as características que serão exibidas na msg
				animal1.emitirSom();
				animal1.acaoAnimal("dormindo..."); //para escolher outra ação, basta modificar aqui
				
				Animal animal2= new Animal ("O", "Pedro", "um", "cachorro", "AuAu!");
				animal2.emitirSom();
				animal2.acaoAnimal("brincando...");
				
				Animal animal3= new Animal ("A", "Clotilde", "uma", "galinha", "Cocoricó!");
				animal3.emitirSom();
				animal3.acaoAnimal("ciscando...");
	}

}
