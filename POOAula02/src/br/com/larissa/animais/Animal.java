package br.com.larissa.animais;

public class Animal {
	//atributos - características
		private String artigoDefinidoAnimal; //O,A
		private String nome;
		private String artigoIndefinidoAnimal; //Um,uma
		private String especie;
		private String som;

		
		//construtor -- inicia os atributos da classe -- ele que conversa com o main
		public Animal(String artigoDefinidoAnimal, String nome, String artigoIndefinidoAnimal, String especie, String som) {
			super();
			this.artigoDefinidoAnimal = artigoDefinidoAnimal;
			this.nome = nome;
			this.artigoIndefinidoAnimal = artigoIndefinidoAnimal;
			this.especie = especie;
			this.som = som;
		}
		
		//métodos - ações
		// " " - espaços no meio das palavras
		//para personalizar a msg, basta adc ou modificar os atributos (esta é apenas uma mensagem base)
		public void emitirSom() {
			System.out.println("\n" +artigoDefinidoAnimal+ " " +nome+ " é " +artigoIndefinidoAnimal+ " " +especie+ ", que faz " +som);
		}
		
		//acao realizada pelo animal
		//parâmetro que será passado no main
		public void acaoAnimal(String acao) { 
			System.out.println(nome+ " está " +acao+ "\n");
			System.out.println("\n===========================================\n");
		}

}
