package ex11;

public class Frontend extends TecnologiaA implements TecnologiaI {
	public Frontend(String linguagem, String framework, String descLinguagem, String descFramework, String compativelCom) {
		super(linguagem, framework, descLinguagem, descFramework);
	}

	private String compativelCom;

	public String getCompativelCom() {
		return compativelCom;
	}

	public void setCompativelCom(String compativelCom) {
		this.compativelCom = compativelCom;
	}

	public void descricaoLinguagem() {

	}

	public void descricaoFramework() {

	}
}
