package ex07;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);

		ArrayList<Conta> listaContas = new ArrayList<Conta>();

		int opcao;
		int opcaoConta;

		do {
			System.out.printf("---------------------------------\n");
			System.out.printf("===> Sistema Nosso Banco <===\n");
			System.out.printf("---------------------------------\n");
			System.out.printf("1 - Cadastrar conta\n" + "2 - Depósito \n" + "3 - Saque \n" + "4 - Transferência \n"
					+ "5 - Consulta de Saldo\n" + "6 - sair\n\n");

			System.out.printf("Digite a opção desejada: ");
			opcao = ler.nextInt();

			if (opcao == 1) {

				int id = listaContas.size() + 1;

				System.out.printf("Digite a agencia do cliente: ");
				String agencia = ler.next();

				System.out.printf("Digite o nome do cliente: ");
				String nome = ler.next();

				System.out.printf("Digite o numero da conta do cliente: ");
				String numero = ler.next();
				System.out.println("");
				System.out.printf("Escolha uma opção de conta:\n");
				System.out.printf("1- Conta Corrente\n" + "2- Conta Poupança\n" + "3- Conta Salário\n");
				opcaoConta = ler.nextInt();
				Conta conta = null;

				if (opcaoConta == 1) {
					conta = new ContaCorrente(id, agencia, nome, numero);

				} else if (opcaoConta == 2) {
					conta = new ContaPoupanca(id, agencia, nome, numero);

				} else {
					System.out.println("Digite o nome da empresa: ");
					String nomeEmpresa = ler.next();

					conta = new ContaSalario(id, agencia, nome, numero, nomeEmpresa);
				}

				listaContas.add(conta);

				System.out.println("Conta criada com sucesso!");
				System.in.read();

			} else if (opcao == 2) {
				for (Conta c : listaContas) {
					System.out.printf(" ID- %d\n NOME- %s\n AGENCIA- %s\n", c.getId(), c.getNome(), c.getAgencia());

					if (c instanceof ContaCorrente) {
						System.out.printf(" TIPO CONTA- Conta Corrente\n");
					} else if (c instanceof ContaPoupanca) {
						System.out.printf(" TIPO CONTA- Conta Poupança\n");
					} else {
						System.out.printf(" TIPO CONTA- Conta Salário\n");
					}
				}
				System.out.println("");
				System.out.println("Selecione o id da conta para o deposito:\n");
				int id = ler.nextInt();

				System.out.println("Digite o valor do deposito:");
				double valor = ler.nextDouble();

				Conta conta = listaContas.get(id - 1);

				if (conta instanceof ContaSalario) {
					System.out.println("Qual o tipo do depósito:");
					String tipoDePagamento = ler.next();

					((ContaSalario) conta).depositar(valor, tipoDePagamento);
				} else {

					conta.depositar(valor);
				}
				System.out.printf("Deposito feito com sucesso!\n");
				System.in.read();

			} else if (opcao == 3) {
				for (Conta c : listaContas) {
					System.out.printf(" ID- %d\n NOME- %s\n AGENCIA- %s\n", c.getId(), c.getNome(), c.getAgencia());

					if (c instanceof ContaCorrente) {
						System.out.printf(" TIPO CONTA- Conta Corrente\n");
					} else if (c instanceof ContaPoupanca) {
						System.out.printf(" TIPO CONTA- Conta Poupança\n");
					} else {
						System.out.printf(" TIPO CONTA- Conta Salário\n");
					}
				}
				System.out.println("Selecione a conta para realizar o saque:");
				int id = ler.nextInt();

				System.out.println("Digite o valor do saque:");
				double sacar = ler.nextDouble();

				Conta conta = listaContas.get(id - 1);
				conta.sacar(sacar);

			} else if (opcao == 4) {
				boolean possuiContaCorrente = false;

				for (Conta c : listaContas) {
					if (c instanceof ContaCorrente) {
						possuiContaCorrente = true;
						System.out.printf(" ID- %d\n NOME- %s\n AGENCIA- %s\n", c.getId(), c.getNome(), c.getAgencia());
						System.out.printf(" TIPO CONTA- Conta Corrente\n");
						System.out.printf("------------------------------");

					}
				}

				if (possuiContaCorrente == false) {
					System.out.println("Não há conta corrente para efetuar tranferencias.");
				} else {
					System.out.println("Selecione a conta que irá realizar a transferencia:");
					int id = ler.nextInt();
					ContaCorrente contaRemetente = (ContaCorrente) listaContas.get(id - 1);

					System.out.println("Digite o valor da transferencia:");
					double valorTransf = ler.nextDouble();

					for (Conta c : listaContas) {
						if (contaRemetente != c) {
							System.out.printf(" ID- %d\n NOME- %s\n AGENCIA- %s\n", c.getId(), c.getNome(),
									c.getAgencia());

							if (c instanceof ContaCorrente) {
								System.out.printf(" TIPO CONTA- Conta Corrente\n");
							} else if (c instanceof ContaPoupanca) {
								System.out.printf(" TIPO CONTA- Conta Poupança\n");
							} else {
								System.out.printf(" TIPO CONTA- Conta Salário\n");
							}
						}
						System.out.printf("---------------");
					}
					System.out.println("Selecione a conta que irá receber a transferencia:");
					int idDestinatario = ler.nextInt();

					Conta contaDestinatario = listaContas.get(idDestinatario - 1);
					contaRemetente.transferir(valorTransf, contaDestinatario);
				}
				System.in.read();
			} else if (opcao == 5) {
				for (Conta c : listaContas) {
					System.out.printf(" ID- %d\n NOME- %s\n AGENCIA- %s\n", c.getId(), c.getNome(), c.getAgencia());

					if (c instanceof ContaCorrente) {
						System.out.printf(" TIPO CONTA- Conta Corrente\n");
					} else if (c instanceof ContaPoupanca) {
						System.out.printf(" TIPO CONTA- Conta Poupança\n");
					} else {
						System.out.printf(" TIPO CONTA- Conta Salário\n");
					}
				}
				System.out.println("Selecione a conta que deseja verificar o saldo:");
				int id = ler.nextInt();

				Conta conta = listaContas.get(id - 1);
				conta.exibirSaldo();

			}

		} while (opcao != 6);
		ler.close();
	}
}
