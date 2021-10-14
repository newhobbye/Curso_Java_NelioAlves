package FileeBufferedReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Application {
	public static void main(String[] args) {
		
		String[] lines = new String[]{"Good Morning", "Good Afternoon", "Good nigth."};
		
		String path = "/home/meuovo/Área de Trabalho/projetos/out";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
