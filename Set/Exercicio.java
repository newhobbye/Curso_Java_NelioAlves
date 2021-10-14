package Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio {

	// mesmo set
	public static void main(String[] args) {
		
		Set<Integer> alunos = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos no curso A? ");
		int total = sc.nextInt();
		for(int i = 0; i < total; i++) {
			System.out.println("Digite o codigo do aluno: ");
			int alunoA = sc.nextInt();
			alunos.add(alunoA);
			System.out.println();
		}
		
		System.out.println("Quantos alunos no curso B? ");
		int totalB = sc.nextInt();
		for(int i = 0; i < totalB; i++) {
		System.out.println("Digite o codigo do aluno: ");
		int alunoB = sc.nextInt();
		alunos.add(alunoB);
		System.out.println();
		}
		
		System.out.println("Quantos alunos no curso C? ");
		int totalC = sc.nextInt();
		for(int i = 0; i < totalC; i++) {
		System.out.println("Digite o codigo do aluno: ");
		int alunoC = sc.nextInt();
		alunos.add(alunoC);
		System.out.println();
		}
		
		System.out.println("Total de alunos nos cursos: " + alunos.size());
		
		
		
		
		sc.close();
	}
	
}
