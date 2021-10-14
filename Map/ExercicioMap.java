package Map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ExercicioMap {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<Urna, Integer> urna = new TreeMap<>();

		System.out.println("Digite os candidados e votos das urnas: ");
		System.out.println("Quantos ficheiros ira digitar? ");
		int total = sc.nextInt();
		sc.nextLine();

			for(int i = 0; i < total; i++) {
			System.out.println("Digite o nome: ");
			String nome = sc.nextLine();
			System.out.println("Digite a quantidade de votos deste participante: ");
			int votos = sc.nextInt();
			int contador = votos;
			sc.nextLine();
			urna.put(new Urna(nome, votos), contador);
			}
		
			//ta errado! https://github.com/acenelio/map1-java/blob/master/src/application/Program.java
		
		
		for (Map.Entry<Urna,Integer> cadaPropriedade : urna.entrySet()) {
		    System.out.println(cadaPropriedade.getKey());
		    System.out.println(cadaPropriedade.getValue());
		}

		sc.close();
	}
}
