package br.com.larissa.main;

//pacotes importados
import java.util.ArrayList;
import java.util.List;

import br.com.larissa.calculo.*;
import br.com.larissa.calculo.impl.Circulo;
import br.com.larissa.calculo.impl.Retangulo;
import br.com.larissa.calculo.impl.Triangulo;


public class Main {

	public static void main(String[] args) {
		System.out.println("\n::::::::::::::::::::: CALCULANDO ÁREAS ::::::::::::::::::::::\n");
		//criando a lista com as formas
		List<AreaCalculavel>formasGeometricas = new ArrayList<>();
		//criando as formas
		// círculos
		AreaCalculavel circulo1 = new Circulo(4.5);
		AreaCalculavel circulo2 = new Circulo(3.2);
		AreaCalculavel circulo3 = new Circulo(5);
		// retângulos
		AreaCalculavel retangulo1 = new Retangulo(23, 6.7);
		AreaCalculavel retangulo2 = new Retangulo(18, 10.2);
		AreaCalculavel retangulo3 = new Retangulo(30, 15.5);
		// triângulos
		AreaCalculavel triangulo1 = new Triangulo(15, 7.8);
		AreaCalculavel triangulo2 = new Triangulo(9.5, 12);
		AreaCalculavel triangulo3 = new Triangulo(10, 16);
		
		//adc todas as formas na lista
		formasGeometricas.addAll(List.of(circulo1, circulo2, circulo3, retangulo1, retangulo2, retangulo3, triangulo1, triangulo2, triangulo3));
		
		//for-each --- percorrendo a lista e chamando o método para calcular a área de cada forma
		for (AreaCalculavel formas : formasGeometricas) {
			System.out.printf(" - Área da forma: %.2f\n", formas.calcularArea());
			System.out.println("_____________________________________________________________-");
		}
	}

}
