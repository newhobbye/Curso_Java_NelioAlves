package interfaces;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import interfaces.entities.LocacaoCarro;
import interfaces.entities.Veiculo;
import interfaces.services.ServicoAluguel;
import interfaces.services.ServicoTaxaBrasil;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("Entre com as informalções da locação:");
		System.out.print("Modelo do carro: ");
		String nome = sc.nextLine();
		System.out.print("Data de retirada: (dd/MM/yyyy HH:mm:ss)");
		Date retirada = sdf.parse(sc.nextLine());
		System.out.print("Data de entrega: (dd/MM/yyyy HH:mm:ss)");
		Date entrega = sdf.parse(sc.nextLine());
		
		LocacaoCarro locacaoCarro = new LocacaoCarro(retirada, entrega, new Veiculo(nome));
		
		System.out.print("Preço por hora");
		double precoH = sc.nextDouble();
		sc.nextLine();
		System.out.println("Preço por dia: ");
		double precoD = sc.nextDouble();
		
		ServicoAluguel servicoAluguel = new ServicoAluguel(precoH, precoD, new ServicoTaxaBrasil());
		servicoAluguel.processandoFatura(locacaoCarro);
		
		System.out.println("Fatura: ");
		System.out.println("Pagamento basico: " + String.format("%.2f", locacaoCarro.getFatura().getPagamentoBasico()));
		System.out.println("Total de taxas: " + String.format("%.2f", locacaoCarro.getFatura().getTaxa()));
		System.out.println("Total a pagar: " + String.format("%.2f", locacaoCarro.getFatura().getPagamentoTotal()));

		
		
		
		
		
		
		
		sc.close();
	}
}
