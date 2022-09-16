package ex17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Programa {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\milen\\Documents\\Domain Driven Design\\candidatos.txt";
		String output = "C:\\Users\\milen\\Documents\\Domain Driven Design\\resultado.txt";

		ArrayList<Candidato> listaCandidatos = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {

				String[] campos = line.split(",");
				String nome = campos[0];
				double nota = Double.parseDouble(campos[1]);
				String cidade = campos[2];

				Candidato candidato = new Candidato(nome, nota, cidade);

				if (nota >= 7) {
					listaCandidatos.add(candidato);
				}
				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.printf("Erro:" + e.getMessage());
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(output))) {
			for (Candidato c : listaCandidatos) {
				String bloco = ("Nome:" + c.getNome() + "\nNota:" + c.getNota() + "\nCidade:" + c.getCidade()+ "\n\n");
				bw.write(bloco);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}