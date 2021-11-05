package projetopessoas;

public class Funcionario extends Pessoa{
	private boolean trabalhando;
	private String setor;
	
	public void mudaTrabalho() {
		this.trabalhando = ! this.trabalhando;		
	}

	public boolean isTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

}
