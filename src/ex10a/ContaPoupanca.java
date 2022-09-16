package ex10a;

public class ContaPoupanca extends Conta{
	
	private double rendimento = 0.03 ;
	
	public ContaPoupanca(int id, String agencia, String nome, String numero) {
		super(id, agencia, nome, numero);
	}


	public void calcularRendimento() {
		this.saldo = saldo + (saldo * rendimento);
	}
	
	public void depositar(double valor) {
		super.depositar(valor);

		valor += 0.07;
		this.setSaldo(valor);
	}
	public void exibirSaldo() {
		System.out.printf("Seu saldo � de %.2f\n", getSaldo());
	}
}
