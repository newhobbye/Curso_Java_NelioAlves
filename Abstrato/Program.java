package Abstrato;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Shape> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Shape #" + (i + 1) + "data:");
			System.out.println("Rectangle or Circle (r/c)? ");
			char d = sc.next().charAt(0);
			System.out.println("Color (BLACK/BLUE/RED): ");
			String cor = sc.nextLine();
			
			if(d == 'r') {
				System.out.println("Width: ");
				double tempWidth = sc.nextDouble();
				System.out.println("Height: ");
				double tempHeight = sc.nextDouble();
				Shape shape = new Rectangle(tempWidth, tempHeight, Color.valueOf(cor));
				list.add(shape);
				
				
			}else if (d == 'c') {
				System.out.println("Radius: ");
				double tempRadius = sc.nextDouble();
				Shape shape = new Circle(Color.valueOf(cor), tempRadius);
				list.add(shape);
				
				
			}
			
			System.out.println("SHAPE AREAS: ");
			for(Shape shape: list) {
				System.out.println(String.format("%.2f",shape.area()));
			}
			
		}
			sc.close();
		}
	

}
