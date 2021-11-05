package aula011;

public class Tecnico extends Aluno{
	private int numRegistro;
	
	public void praticar() {
		System.out.println(this.nome + " está praticando");		
	}

	public int getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(int numRegistro) {
		this.numRegistro = numRegistro;
	}
	

}
