package application;

import java.util.Scanner;

import entities.PessoaBanco;

public class Banco {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero da conta: ");
		int tempConta = sc.nextInt();
		System.out.println("Nome do usuario: ");
		String tempNome = sc.next();
		
		System.out.println("Haverá deposito inicial? (Sim 1/Não 0) ");
		int decição = sc.nextInt();
		
		if(decição == 1) {
			System.out.println("Digite o valor do deposito: ");
			double tempValor = sc.nextDouble();
			PessoaBanco pessoaY = new PessoaBanco(tempConta, tempNome, tempValor);
			System.out.println("Informações da conta: ");
			System.out.println(pessoaY);
			
			System.out.println("Entre com valor para depositar: ");
			double depvalor = sc.nextDouble();
			pessoaY.DepositoConta(depvalor);
			System.out.println("Informações da conta: ");
			System.out.println(pessoaY);
			
			System.out.println("Entre com o valor do saque: ");
			double saqvalor = sc.nextDouble();
			pessoaY.SaqueConta(saqvalor);
			System.out.println("Informações da conta: ");
			System.out.println(pessoaY);
			
		}else if (decição == 0){
			PessoaBanco pessoaN = new PessoaBanco(tempConta, tempNome);	
			System.out.println("Informações da conta: ");
			System.out.println(pessoaN);
			
			System.out.println("Entre com valor para depositar: ");
			double depvalor = sc.nextDouble();
			pessoaN.DepositoConta(depvalor);
			System.out.println("Informações da conta: ");
			System.out.println(pessoaN);
			
			System.out.println("Entre com o valor do saque: ");
			double saqvalor = sc.nextDouble();
			pessoaN.SaqueConta(saqvalor);
			System.out.println("Informações da conta: ");
			System.out.println(pessoaN);
			
			
		}else 
			System.out.println("Digite apenas Y ou N!!!");
		main(args);
		
		sc.close();
	}

}
