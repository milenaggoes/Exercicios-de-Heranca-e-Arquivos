package ex10a;

public class ContaSalario extends Conta{
	
	private String nomeEmpresa;

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	
	public ContaSalario(int id, String agencia, String nome, String numero, String nomeEmpresa) {
		super(id, agencia, nome, numero);
	}
	
	public void depositar(double valor, String tipoDePagamento) {
		super.depositar(valor);
		System.out.printf("Tipo de pagamento: %s\n", tipoDePagamento);
		
	}
	public void exibirSaldo() {
		System.out.printf("Seu saldo é de %.2f\n", getSaldo());
	}
}
