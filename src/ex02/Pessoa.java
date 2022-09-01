package ex02;

public class Pessoa {
	protected int id;
	protected String contratante;
	protected int prazo;
	protected double valor;
	
	
	public Pessoa(int id, String contratante, int prazo, double valor) {
		super();
		this.id = id;
		this.contratante = contratante;
		this.prazo = prazo;
		this.valor = valor;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContratante() {
		return contratante;
	}
	public void setContratante(String contratante) {
		this.contratante = contratante;
	}
	public int getPrazo() {
		return prazo;
	}
	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double calcularPrestacao() {
		double resultado = this.valor / this.prazo;
		return resultado;
		
	}
	public void exibirInfo() {
		System.out.printf("%s " +"seu contrato foi parcelado em: %d" + " vezes\n", this.contratante, this.prazo);
		System.out.printf("O total da sua parcela é de: %.2f\n\n", this.calcularPrestacao());
	}
	
}
	

