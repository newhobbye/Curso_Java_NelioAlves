package fileScanner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
	// /home/meuovo/Documentos/uma_pasta/dadosloja
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>(); // Array List aberto com o product

		System.out.println("Insira o diretorio do arquivo: ");
		String strDiretorio = sc.nextLine(); // String capturando o diretorio

		File diretorio = new File(strDiretorio); //File sendo instanciado com a string
		String caminho = diretorio.getParent(); //getParent para pegar o caminho sem o nome do arquivo

		boolean sucess = new File(caminho + "/out").mkdir(); //boolean para criar a pasta 
		String alvoArquivo = caminho + "/out/sumary.csv"; //String para adicionar o caminho e o nome do novo arquivo

		try (BufferedReader br = new BufferedReader(new FileReader(strDiretorio))) { //instancia de BR que instancia o FR que referencia a string diretorio

			String itemCsv = br.readLine(); //String que lê o BufferedReader
			while (itemCsv != null) { // enquanto a string for diferente de nulo:

				String[] fields = itemCsv.split(","); //Vetor de string recebendo a itemcsv com split
				String name = fields[0]; //string temporaria recebendo o nome por referencia do vetor 0
				double price = Double.parseDouble(fields[1]); //double sendo convertido de Wrapper para double, e recebendo vetor 1
				int quantity = Integer.parseInt(fields[2]); // int sendo convertido de wrapper para int, e recebendo vetor 2

				list.add(new Product(name, price, quantity)); //adicionando e instanciando no construtor Product as variaveis temporarias 

				itemCsv = br.readLine(); // nao entendi o porque se repete
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(alvoArquivo))) { //bw para escrever no arquivo criado

				for (Product item : list) { //para cada item de Product, da lista
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));// nao entendi muito bem
					bw.newLine(); //nao entendi 
				}

				System.out.println(alvoArquivo + " CREATED!"); //poderia referenciar o boolean e retornar um true tbm

			} catch (IOException e) { //exceções
				System.out.println("Error writing file: " + e.getMessage());
			}

		} catch (IOException e) { //nao entendi porque se repetiu
			System.out.println("Error reading file: " + e.getMessage());
		}
		sc.close();

	}
	
}
