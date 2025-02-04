package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		String[] lines = new String[] {
				"Hello world", "Good Morning", "Good Afternoon", "Good Night"
		};
		
		String path = "c:\\teste\\out.txt";
		// Adicionando um true após o "path" (FileWriter(path, true)), o arquivo é sobrescrito
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
