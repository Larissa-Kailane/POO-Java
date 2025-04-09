package br.com.larissa.calculo.impl;

//importando o pacote da minha interface
import br.com.larissa.calculo.AreaCalculavel;

//A classe Retangulo implementa a interface AreaCalculavel
public class Retangulo implements AreaCalculavel {
	//atributos
	private double base;
	private double altura;
	
	//construtor
	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	//encapsulamento - protegendo os atributos
	public double getBase() { //base
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() { //altura
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	//Polimorfismo - sobrescrevendo o método para calcular a área do retângulo
	//a área do retângulo é calculada pelo valor da base vezes o valor da altura
	@Override
	public double calcularArea() {
		System.out.println("\n °RETÂNGULO°");
		double areaDoRetangulo = base * altura;
		return areaDoRetangulo;
	}

}
