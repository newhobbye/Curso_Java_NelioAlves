package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		Product produto = new Product();
		System.out.println("Entre com as informações do produto!");
		System.out.println("Nome: ");
	
		produto.nome = entrada.nextLine();
		System.out.println("Entre com o valor do(a) " + produto.nome + ": ");
		produto.preco = entrada.nextDouble();
		System.out.println("Entre com a quantidade do(a) "+ produto.nome + ": ");
		produto.quantidade = entrada.nextInt();
		
		System.out.println(produto);
		

		entrada.close();
	}

}
