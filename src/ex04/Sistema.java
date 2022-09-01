package ex04;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
	@SuppressWarnings("null")
	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);

		ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();

		int opcao;
		int opcaoPessoa;

		do {
			System.out.printf("------------------------------------\n");
			System.out.printf("===> Sistema de Financiamento <===\n");
			System.out.printf("------------------------------------\n\n");
			System.out.printf("Escolha uma opção:\n");
			System.out.printf("1 - Solicitar financiamento\n" + "2 - Exibir Informações \n" + "3 - Sair\n\n");

			System.out.printf("Digite a opção desejada: ");
			opcao = ler.nextInt();

			if (opcao == 1) {
				int id = listaPessoas.size() + 1;

				System.out.println("Digite o nome do contratante:");
				String contratante = ler.next();
				System.out.println("Digite o valor do financiamento:");
				double valor = ler.nextDouble();
				System.out.println("Digite o número de meses em que deseja pagar:");
				int prazo = ler.nextInt();

				System.out.println("Você é uma pessoa:");
				System.out.printf("1- Física\n" + "2- Jurídica\n");
				opcaoPessoa = ler.nextInt();

				Pessoa pessoa = null;

				if (opcaoPessoa == 1) {
					System.out.println("Digite seu CPF:");
					String cpf = ler.next();
					System.out.println("Digite seu RG:");
					String rg = ler.next();
					System.out.println("Digite a sua idade:");
					int idade = ler.nextInt();
					System.out.println("Digite a sua renda Anual:");
					double rendaAnual = ler.nextDouble();
					System.out.println("Digite a quantidade de pessoas que dependem dessa renda:");
					int qtdPessoas = ler.nextInt();
					
					pessoa.calcularRenda(rendaAnual, qtdPessoas);
					
					pessoa = new PessoaFisica(id, contratante, prazo, valor, cpf, rg, idade);

				} else {
					System.out.println("Digite o seu CNPJ:");
					String cnpj = ler.next();
					System.out.println("Digite o ramo da sua empresa:");
					String ramo = ler.next();
					System.out.println("Digite o número da sua incrição estadual:");
					String inscricao = ler.next();
					System.out.println("Digite a sua renda Anual:");
					double rendaAnual = ler.nextDouble();
					
					pessoa.calcularRenda(rendaAnual);

					pessoa = new PessoaJuridica(id, contratante, prazo, valor, cnpj, ramo, inscricao);
				}
				listaPessoas.add(pessoa);

				System.out.println("Financiamento solicitado com sucesso!\n");
				System.in.read();
				
			}else if(opcao == 2) {
				for(Pessoa p : listaPessoas){
					System.out.printf("ID- %d\n" + "CONTRATANTE- %s\n\n", p.getId(), p.getContratante());
				}
				System.out.println("Digite o ID para verificar as informações:");
				int idPessoa = ler.nextInt();
				
				Pessoa pessoa = listaPessoas.get(idPessoa - 1);
				pessoa.exibirInfo();
				System.in.read();
			}
				
		} while (opcao != 3);
		ler.close();
	}
}
