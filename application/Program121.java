package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client121;
import entities.Pedido121;
import entities.enums.Status121;

public class Program121 {
	public static void main(String[] args) throws ParseException{
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter cliente data: ");
		System.out.println("Nome: ");
		String tempNome = sc.nextLine();
		System.out.println("Email: ");
		String tempEmail = sc.nextLine();
		System.out.println("data de nascimento: *dd/MM/aaaa* ");
		String tempData = sc.nextLine();
		
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		Date format = f.parse(tempData);
		Client121 pessoa = new Client121(tempNome, tempEmail, format);
		System.out.println(pessoa);
		
		System.out.println("Entre com o as informações do pedido: ");
		System.out.println("Status:  AGUARDANDO_PAGAMENTO(0),\n" + 
				"	PROCESSANDO(1),\n" + 
				"	ENVIADO(2),\n" + 
				"	ENTREGUE(3);");
	    String tempStatus = sc.nextLine();
	    System.out.println("Quantos itens nessa ordem? ");
	    int qtd = sc.nextInt();
		
	    Pedido121 status = new Pedido121(Status121.valueOf(tempStatus));
		
		for(int i = 0; i < qtd; i++) {
			
			
		}
		
		
		sc.close();
	}

}
