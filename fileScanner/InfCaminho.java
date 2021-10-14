package fileScanner;

import java.io.File;
import java.util.Scanner;

public class InfCaminho {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Enter a file path: ");
		String strPath = entrada.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("Get name: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		entrada.close();
	}

}
