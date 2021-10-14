package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBanco;

public class Banco1 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		ContaBanco conta = null; //Verificar o porque esta quebrando
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bem vindo ao banco Darkinha!");
		System.out.println("Informe o numero da sua nova conta: ");
		int tempConta = sc.nextInt();
		
		System.out.println("Digite o nome do titular: ");
		String tempNome = sc.next();
		
	    System.out.println("Iniciará sua conta com algum deposito? (1/0)");
	    int decisão = sc.nextInt();
	    sc.nextLine();
	    
	    if(decisão == 1) {
	    	System.out.println("Digite o valor do deposito inicial: ");
	    	double tempValor = sc.nextDouble();
	    	conta = new ContaBanco(tempConta, tempNome, tempValor);
	    	
	    } else if(decisão == 0){
	    	conta = new ContaBanco(tempConta, tempNome);
	    } else
	    	System.out.println("Numero errado!");
	    main(args);
	    
	    
	    System.out.println(conta);
	    System.out.println("Valor a depositar: ");
	    double deposito2 = sc.nextDouble();
	    conta.depositar(deposito2);
	    System.out.println(conta);
	    
	    System.out.println("Valor para saque: ");
	    double saque2 = sc.nextDouble();
	    conta.sacar(saque2);
	    System.out.println(conta);
	    
		
		sc.close();
	}

}
