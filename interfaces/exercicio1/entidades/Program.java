package interfaces.exercicio1.entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	
	public static void main(String[] args) throws ParseException {
		//ServicoPagamentoOnline service = new ServicoPayPal();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Digite o numero do contrato:");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite a data do contrato: ");
		Date data = sdf.parse(sc.next());
		System.out.println("Digite o valor total do contrato: ");
		double total = sc.nextDouble();
		Contrato contrato = new Contrato(numero, data, total);
		
		System.out.println("Numero de meses para parcelar: ");
		int meses = sc.nextInt();
		ContratoServico cServico = new ContratoServico(new ServicoPayPal());
		cServico.processandoContrato(contrato, meses);
		
		System.out.println("Parcelas:");
		for (Parcelas x : contrato.getParcelas()) {
			System.out.println(x);
		}
		
		sc.close();
	}

}
