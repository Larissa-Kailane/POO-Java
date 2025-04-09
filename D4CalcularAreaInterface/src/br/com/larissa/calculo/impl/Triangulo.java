package br.com.larissa.calculo.impl;

//importando o pacote da minha interface
import br.com.larissa.calculo.AreaCalculavel;

//A classe Triangulo implementa a interface AreaCalculavel
public class Triangulo implements AreaCalculavel{
	//atributos
	private double base;
	private double altura;
	
	//construtor
	public Triangulo(double base, double altura) {
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

	//Polimorfismo - sobrescrevendo o método para calcular a área do triângulo
	//a área do triângulo é calculada pelo valor da base vezes a altura, dividido por 2
	@Override
	public double calcularArea() {
		System.out.println("\n °TRIÂNGULO°");
		double areaDoTriangulo = (base * altura) / 2;
		return areaDoTriangulo;
	}

}
