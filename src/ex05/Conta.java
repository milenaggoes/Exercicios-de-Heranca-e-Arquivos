package ex05;


public abstract class Conta {
	
	protected int id;
	protected String agencia;
	protected String nome;
	protected String numero;
	protected double saldo;

	public Conta() {

	}

	public Conta(int id,String agencia, String nome, String numero) {
		this.id = id;
		this.agencia = agencia;
		this.nome = nome;
		this.numero = numero;
		this.saldo = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public abstract void exibirSaldo();

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void sacar(double valor) {
		if (valor <= saldo) {
			this.saldo -= valor;
			System.out.println("Operação realizada com sucesso!");
		} else {
			System.out.println("Saldo insuficiente para completar está ação.");
		}

	}
}
