package ex17;

public class Candidato {
	private String nome;
	private double nota;
	private String cidade;
	
	
	public Candidato(String nome, double nota, String cidade) {
		this.nome = nome;
		this.nota = nota;
		this.cidade = cidade;
	}
	public String getNome(){
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
}
