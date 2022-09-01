package ex08;

public class PessoaFisica extends Pessoa {
		private String cpf;
		private String rg;
		private int idade;
		
		public PessoaFisica(int id, String contratante, int prazo, double valor, String cpf, String rg, int idade) {
			super(id, contratante, prazo, valor);
			this.cpf = cpf;
			this.rg = rg;
			this.idade = idade;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getRg() {
			return rg;
		}

		public void setRg(String rg) {
			this.rg = rg;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		public double calcularPrestacao() {
			double resultado = super.calcularPrestacao();
			
			resultado += (prazo * 0.10);
			return resultado;
		}
		public void exibirInfo() {
			System.out.printf("%s " +"seu contrato foi parcelado em: %d" + " vezes\n", this.contratante, this.prazo);
			System.out.printf("O total da sua parcela é de: %.2f\n\n", this.calcularPrestacao());
		}
		
	}
