package Stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FixacaoStream {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o caminho do arquivo: ");
		String caminho = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
			List <TRabalhador> list = new ArrayList<>();
			
			String linha = br.readLine();
			
			while(linha != null) {
				String [] filds = linha.split(",");
				list.add(new TRabalhador(filds[0], filds[1], Double.parseDouble(filds[2])));
				
				linha = br.readLine();
			}
			
			System.out.println("Informe a media de salario desejada para mostrar a lista de funcionarios equivalentes; ");
			double salarioMedia = sc.nextDouble();
			sc.nextLine();
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List <String> emails = list.stream()
					.filter(p -> p.getSalario() > salarioMedia)
					.map(p -> p.getEmail()).sorted(comp)
					.collect(Collectors.toList());
			
			emails.forEach(System.out::println);
					
		}
		catch(IOException e) {
			System.out.println("...");
		}
		sc.close();
	}

}
