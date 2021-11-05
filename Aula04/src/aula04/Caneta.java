package aula04;

public class Caneta {
	public String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	

	
	public Caneta(String modelo, String cor, float ponta) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Caneta [modelo=" + modelo + ", ponta=" + ponta + ", tampada=" + tampada + ", cor=" + cor + "]";
	}
	
	
	
}
