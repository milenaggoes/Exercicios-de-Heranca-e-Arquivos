package ex06;

public abstract class Pessoa {
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
	public abstract void exibirInfo();
	
	
	public void calcularRenda(double rendaAnual) {
		double rendaMensal = rendaAnual /12;
		System.out.printf("Renda mensal de %f registrada.", rendaMensal);
	}
	public void calcularRenda(double rendaAnual, int qtdPessoas) {
		double rendaMensal = rendaAnual /12;
		System.out.printf("Renda mensal de %f para %d pessoas registrada.", rendaMensal, qtdPessoas);
	}
}
	

