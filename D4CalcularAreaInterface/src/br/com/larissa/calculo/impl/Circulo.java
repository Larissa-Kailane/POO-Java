package br.com.larissa.calculo.impl;

//importando o pacote da minha interface
import br.com.larissa.calculo.AreaCalculavel;

//A classe Circulo implementa a interface AreaCalculavel
public class Circulo implements AreaCalculavel {
	//atributos
	private double raio;
	
	//construtor
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}
	
	//encapsulamento - protegendo o atributo
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}

	//Polimorfismo - sobrescrevendo o método para calcular a área do circulo
	//a área do círculo é calculada pelo valor de pi, vezes o valor do raio ao quadrado
	@Override
	public double calcularArea() {
		System.out.println("\n °CÍRCULO°");
		double areaDoCirculo = 3.14 * (raio * raio);
		return areaDoCirculo;
	}

}
