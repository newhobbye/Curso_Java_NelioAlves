package application;

import java.util.Scanner;

import entities.PessoasAluguel;

public class pensionato {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Bem vindo ao pensionato!");
		System.out.println("Digite quantos alunos irão alugar os quartos: ");
		int alunos = entrada.nextInt();

		PessoasAluguel[] vect = new PessoasAluguel[10];

		for (int i = 0; i < alunos; i++) {
			System.out.println();
			System.out.println("Alugar #" + i + ":");
			System.out.print("Nome: ");
			entrada.nextLine();
			String nome = entrada.nextLine();
			System.out.print("Email: ");
			String email = entrada.nextLine();
			System.out.print("Sala: ");
			int sala = entrada.nextInt();
			vect[sala] = new PessoasAluguel(nome, email);
		}
		System.out.println();
		System.out.println("Quartos do hotel: ");

		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ":" + vect[i]);
			}
		}

		entrada.close();

	}

}
