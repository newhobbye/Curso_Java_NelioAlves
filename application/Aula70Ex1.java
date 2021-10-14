package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Aula70Ex1 {
	//public static final double PI = 3.14159;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o raio: ");

		double raio = entrada.nextDouble();

		double c = Calculator.circunferencia(raio);
		double v = Calculator.volume(raio);

		System.out.printf("Circunferencia: %.2f", c);
		System.out.printf("Volume: %.2f", v);
		System.out.printf("PI: %.2f", Calculator.PI);

		entrada.close();
	}

	//public static double circunferencia(double raio) {
		//return 2.0 * PI * raio;

	//}

	//public static double volume(double raio) {
		//return 4.0 * PI * raio * raio * raio;

	//}
}
