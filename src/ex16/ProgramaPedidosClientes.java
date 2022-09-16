package ex16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

public class ProgramaPedidosClientes {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		String path = "C:\\Users\\milen\\Desktop\\pedidos.txt";
		String output = "C:\\Users\\milen\\Desktop\\pedidos_clientes.txt";
		ArrayList<String> listaDados = new ArrayList<>();
		
		double total = 0.0;
		String nome = "";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {

				String[] campos = line.split(",");

				if (campos.length == 1) {
					nome = campos[0];
					total = 0.0;

				} else {
					int quantidadeProduto = Integer.parseInt(campos[1]);
					double precoProduto = Double.parseDouble(campos[2]);

					double dado = (quantidadeProduto * precoProduto);

					total = total + dado;

				}
				line = br.readLine();
				listaDados.add(nome + "," + String.valueOf(total));
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
