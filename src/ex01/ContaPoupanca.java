package ex01;

public class ContaPoupanca extends Conta{
	
	private double rendimento = 0.03 ;
	
	public ContaPoupanca(int id, String agencia, String nome, String numero) {
		super(id, agencia, nome, numero);
	}


	public void calcularRendimento() {
		this.saldo = saldo + (saldo * rendimento);
	}
		
}
