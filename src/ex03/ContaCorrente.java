package ex03;

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
		public void depositar(double valor) {
			super.depositar(valor);
			
			valor -= 0.10;
			this.setSaldo(valor);
		}
	

}