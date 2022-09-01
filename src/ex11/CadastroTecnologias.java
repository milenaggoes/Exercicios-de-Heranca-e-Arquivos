package ex11;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroTecnologias {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Backend> listaBackend = new ArrayList<>();
		ArrayList<Frontend> listaFrontend = new ArrayList<>();

		System.out.println("Quantas tecnologias deseja criar?");
		int qtdTecnologias = ler.nextInt();

		for (int i = 1; i <= qtdTecnologias; i++) {
			System.out.println("Qual tipo de tecnologia deseja criar?\n" + "1- Backend\n" + "2- Frontend");
			int opcao = ler.nextInt();

			if (opcao == 1) {
				System.out.println("Nome da linguagem: ");
				String nomeLinguagem = ler.next();

				System.out.println("Descrição da linguagem: ");
				String descLinguagem = ler.next();

				System.out.println("Principal framework: ");
				String nomeFramework = ler.next();

				System.out.println("Descrição do framework: ");
				String descFramework = ler.next();

				System.out.println("É possível conteinerizar?\n");
				String conteineriza = ler.next();

				Backend backend = new Backend(nomeLinguagem, descLinguagem, nomeFramework, descFramework, conteineriza);
				listaBackend.add(backend);

			} else if (opcao == 2) {
				System.out.println("Nome da linguagem: ");
				String nomeLinguagem = ler.next();

				System.out.println("Descrição da linguagem:");
				String descLinguagem = ler.next();

				System.out.println("Principal framework:");
				String nomeFramework = ler.next();

				System.out.println("Descrição do framework:");
				String descFramework = ler.next();

				System.out.println("É compatível com web ou mobile?\n");
				String compativelCom = ler.next();

				Frontend frontend = new Frontend(nomeLinguagem, descLinguagem, nomeFramework, descFramework,
						compativelCom);
				listaFrontend.add(frontend);
			}
		}
		for (Backend b : listaBackend) {
			System.out.printf(
					"---Tecnologias Backend---\n\n" + "Linguagem: %s\n" + "Principal framework: %s\n"
							+ "Descrição Linguagem: %s \n" + "Descrição Framework: %s\n\n",
					b.getLinguagem(), b.getFramework(), b.getDescLinguagem(), b.getDescFramework());
		}
		for (Frontend f : listaFrontend) {
			System.out.printf(
					"---Tecnologias Frontend---\n\n" + "Linguagem: %s\n" + "Principal framework: %s\n"
							+ "Descrição Linguagem: %s \n" + "Descrição Framework: %s",
					f.getLinguagem(), f.getFramework(), f.getDescLinguagem(), f.getDescFramework());
		}

		ler.close();
	}
}
