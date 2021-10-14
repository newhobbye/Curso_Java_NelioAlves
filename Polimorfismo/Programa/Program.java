package Polimorfismo.Programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Polimorfismo.Employee;
import Polimorfismo.OutsourcedEmployee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i = 0; i <= n; i++) {
			System.out.println("Employee #" + i + "data: ");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if(ch == 'y') {
				System.out.print("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(employee);
			}else {
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		System.out.println();
		System.out.println("Payaments: ");
		for (Employee employee: list) {
		System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payament()));	
		}

		
		sc.close();
	}

}
