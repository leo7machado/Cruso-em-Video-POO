package aula07;

import java.util.Random;

public class Luta {
	// Atributos
	private Lutador desafiante;
	private Lutador desafiado;
	private int rounds;
	private boolean aprovada;

	// Métodos
	public void marcarLuta(Lutador l1, Lutador l2) {
		if ((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)) {

			this.aprovada = true;
			this.desafiante = l1;
			this.desafiado = l2;

		} else {
			this.aprovada = false;
			this.desafiante = null;
			this.desafiado = null;
		}
	}

	public void lutar() {
		if (this.isAprovada()) {
			System.out.println("### DESAFIADO ###");
			desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			desafiante.apresentar();
			Random vencedor = new Random();
			int j =vencedor.nextInt(3);  // 3 resultados: 0  1  2
			System.out.println("====== RESULTADO DA LUTA ======");
			
			switch (j) {

			case 0: // Empate
				System.out.println("Empatou");
				desafiante.empatarLuta();
				desafiado.empatarLuta();
				break;

			case 1: // Ganhou desafiado
				System.out.println(desafiado.getNome() + " venceu");
				desafiado.ganharLuta();
				desafiante.perderLuta();
				System.out.println("");
				desafiado.status();
				break;

			case 2: // Ganhou desafiante
				System.out.println(desafiante.getNome() + " venceu");
				desafiante.ganharLuta();
				desafiado.perderLuta();
				System.out.println("");
				desafiante.status();
				break;

			}
		} else {
			System.out.println("Luta não pode acontecer");

		}

	}

	// Métodos Especiais
	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

}
