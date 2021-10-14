package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// double xA, xB, xC, yA, yB, yC;
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Entre com os tamanhos do triangulo X: ");

		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Entre com os tamanhos do triangulo Y: ");

		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();

		double areaY = y.area();

		System.out.printf("Area do triangulo X: %.4f/n", areaX);
		System.out.printf("Area do triangulo Y: %.4f/n", areaY);

		if (areaX >= areaY) {
			System.out.println("Triangulo X é o maior!");
		} else
			System.out.println("Triangulo Y é o maior!");

		sc.close();
	}

}
