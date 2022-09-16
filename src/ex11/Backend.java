package ex11;

public class Backend extends TecnologiaA implements TecnologiaI {
	private String conteineriza;

	public Backend(String linguagem, String framework, String descLinguagem, String descFramework,
			String conteineriza) {
		super(linguagem, framework, descLinguagem, descFramework);
		this.conteineriza = conteineriza;
	}

	public String Conteineriza() {
		return conteineriza;
	}

	public void setConteineriza(String conteineriza) {
		this.conteineriza = conteineriza;
	}

	
	public void descricaoLinguagem() {
		
	}

	
	public void descricaoFramework() {
		
	}
}
