package ex01;

public class ContaCorrente extends Conta {


	public ContaCorrente() {
	}

	public ContaCorrente(int id, String agencia, String nome, String numero) {
		super(id, agencia, nome, numero);

	}

	public void transferir(double valorTransf, Conta contaDestinatario) {
		if (valorTransf <= saldo) {
			this.sacar(valorTransf);
			contaDestinatario.depositar(valorTransf);
		}
	}

}
