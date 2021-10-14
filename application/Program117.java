package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department117;
import entities.HourContract117;
import entities.Worker117;
import entities.enums.WorkerLevel;

public class Program117 {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");//PRECISO LER ALGO SOBRE ISSO

		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com o nome do departamento: ");
		String departmentName = sc.nextLine();

		System.out.print("Enter worker data: ");
		System.out.print("Nome: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base Salary: ");
		double baseSalary = sc.nextDouble();

		Worker117 worker = new Worker117(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
				new Department117(departmentName)); //ACHO QUE ENTENDI :D

		System.out.print("Quantos contratos tem este trabalhador?: ");
		int n = sc.nextInt(); 

		for (int i = 0; i <= n; i++) {
			System.out.println("Entre com o contrato #" + i + "data");//AQUI DEVERIA SER i+1? COMO NUMERO DE CONTRATO??
			System.out.print("Data (DD/MM/AAAA: ");
			Date contractDate = sdf.parse(sc.next()); //NAO ENTENDI MUITO BEM ESSA PARTE
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (Hours): ");
			int hours = sc.nextInt();
			HourContract117 contract = new HourContract117(contractDate, valuePerHour, hours);
			worker.addContract(contract); //NAO ENTENDI MUITO BEM

		}
		System.out.println();
		System.out.print("Entre com o mes e ano para calcular salario: ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3)); //ENTENDI :D
		
		System.out.println("Worker name: " + worker.getName()); //AQUI ELE ESTA USANDO UM GATTER DA CLASSE WORKER PARA PEGAR O NOME DO FUNCIONARIO?
		System.out.println("Worker department: " + worker.getDepartment().getName());// PORQUE GETDEPARTMENT E DEPOIS GETNAME? PRA NAO PUXAR GETNAME DE OUTRO LUGAR?
		System.out.println("Income for: " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));// MEIO CONFUSO... 
		

		sc.close();
	}

}
