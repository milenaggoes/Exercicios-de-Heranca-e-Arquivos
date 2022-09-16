package ex12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProgramaLista {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String[] lines = new String[10];
		
		for (int i = 0; i <= 9; i++) {
		
			System.out.println("nome do produto:");
			String nome = ler.next();
			System.out.println("quantidade:");
			int qtd = ler.nextInt();
			System.out.println("preço:");
			double preco = ler.nextDouble();
			lines[i] = nome +"," +  String.valueOf(qtd) + "," +String.valueOf(preco);
		
		}
		

		String path = "C:\\Users\\milen\\Desktop\\lista.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			// Obtem a primeira linha do arquivo
			for (String line : lines) {
				// escreve a linha no arquivo
				bw.write(line);
				// pula uma linha no arquivo
				bw.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ler.close();
	}
}