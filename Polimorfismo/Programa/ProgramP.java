package Polimorfismo.Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Polimorfismo.ImportedProduct;
import Polimorfismo.Product;
import Polimorfismo.UsedProduct;

public class ProgramP {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		System.out.println("Common, used or imported (c/u/i)? ");
		char ch = sc.next().charAt(0);

		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1) + "Data:");
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.println("Price: ");
			double price = sc.nextDouble();

			if (ch == 'i') {
				System.out.println("Customs Fee: ");
				double custFee = sc.nextDouble();
				ImportedProduct product = new ImportedProduct(nome, price, custFee);
				list.add(product);
				System.out.println(product.priceTag());

			} else if (ch == 'c') {
				Product product = new Product(nome, price);
				list.add(product);
				System.out.println(product.priceTag());

			} else if (ch == 'u') {
				System.out.println("Manufacture date (DD/MM/YYYY): ");
				String date = sc.nextLine();
				Product product = new UsedProduct(nome, price, sdf.parse(date));
				list.add(product);
				System.out.println(product.priceTag());
			}

		}

		sc.close();
	}

}
