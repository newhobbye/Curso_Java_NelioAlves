package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Coment120;
import entities.Post120;

public class Program120 {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Coment120 c1 = new Coment120("Have a nice Trip!");
		Coment120 c2 = new Coment120("Wow! that's awersome!");
		Post120 p1 = new Post120(
				sdf.parse("21/06/2018 13:05:44"), 
				"Traveling to new Zealand", 
				"Visitando essa porra!", 
				2);
		p1.addComent(c1);
		p1.addComent(c2);
		
		System.out.println(p1);
	}

}
