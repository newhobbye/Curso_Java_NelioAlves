package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product89;

public class Program89 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Product89[] vect = new Product89[n];
		
		for(int i = 0; i < n; i++) {
			sc.hasNextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product89(name, price);
		}
		
		double sum = 0.0;
		for(int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / n;
		
		System.out.printf("Média de preco: %.2f%n", avg);
		sc.close();
	}

}
