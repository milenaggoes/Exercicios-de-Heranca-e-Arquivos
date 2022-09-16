package ex13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

public class ProgramaTotal {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		String path = "C:\\Users\\milen\\Desktop\\lista.txt";
		String output = "C:\\Users\\milen\\Desktop\\total.txt";
		
		ArrayList<String> listaDados = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {

				String[] campos = line.split(",");
				String name = campos[0];
				int quantidade = Integer.parseInt(campos[1]);
				double preco = Double.parseDouble(campos[2]);

				String dado = (name + "," + quantidade * preco);
				listaDados.add(dado);

				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.printf("Erro:" + e.getMessage());
		}
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(output))) {
			for (String line : listaDados) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
