package ex08;

public class PessoaJuridica extends Pessoa {
	private String cnpj;
	private String ramo;
	private String inscricao;
	

	public PessoaJuridica(int id, String contratante, int prazo, double valor, String cnpj, String ramo,
			String inscricao) {
		super(id, contratante, prazo, valor);
		this.cnpj = cnpj;
		this.ramo = ramo;
		this.inscricao = inscricao;
		
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRamo() {
		return ramo;
	}
	public void setRamo(String ramo) {
		this.ramo = ramo;
	}
	public String getInscricao() {
		return inscricao;
	}
	public void setInscricao(String inscricao) {
		this.inscricao = inscricao;
	}
	public void exibirInfo() {
		System.out.printf("%s " +"seu contrato foi parcelado em: %d" + " vezes\n", this.contratante, this.prazo);
		System.out.printf("O total da sua parcela é de: %.2f\n\n", this.calcularPrestacao());
	}
}
