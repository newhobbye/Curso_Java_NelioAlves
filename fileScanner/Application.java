package fileScanner;

import java.io.File;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o caminho da pasta: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders: ");
		for(File folder: folders) {
			System.out.println(folder);
		}
		sc.nextLine();
		File[] files = path.listFiles(File::isFile);
		System.out.println("Arquivos: ");
		for(File arquivo: files) {
			System.out.println(arquivo);
		}
		
		boolean success = new File(strPath + "/teste").mkdir();
		System.out.println("Diretorio criado com sucesso!" + success);
		sc.close();
	}

}
