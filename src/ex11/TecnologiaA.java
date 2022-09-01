package ex11;

public abstract class TecnologiaA {
	
	private String linguagem;
	private String framework;
	private String descLinguagem;
	private String descFramework;
	
	
	public TecnologiaA(String linguagem, String framework, String descLinguagem, String descFramework) {
		super();
		this.linguagem = linguagem;
		this.framework = framework;
		this.descLinguagem = descLinguagem;
		this.descFramework = descFramework;
		
		
		
	}
	public String getLinguagem() {
		return linguagem;
	}
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	public String getFramework() {
		return framework;
	}
	public void setFramework(String framework) {
		this.framework = framework;
	}
	public String getDescLinguagem() {
		return descLinguagem;
	}
	public void setDescLinguagem(String descLinguagem) {
		this.descLinguagem = descLinguagem;
	}
	public String getDescFramework() {
		return descFramework;
	}
	public void setDescFramework(String descFramework) {
		this.descFramework = descFramework;
	}
}
