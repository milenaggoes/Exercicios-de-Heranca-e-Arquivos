package ex01;

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
}
