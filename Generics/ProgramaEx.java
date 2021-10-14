package Generics;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		ListaVariavel<Integer> lt = new ListaVariavel<>();

		System.out.println("Digite a quantia de itens que deseja exibir:");
		int quant = sc.nextInt();
		sc.nextLine();

		System.out.println("Digite os valores: ");

		for (int i = 0; i < quant; i++) {
			int valor = sc.nextInt();
			lt.addValor(valor);
		}
		
		lt.print();

		sc.close();
	}

}
