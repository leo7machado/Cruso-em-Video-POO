package contabanco;

public class ContaBanco {

	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("_______________________________");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}

	public ContaBanco() {
		saldo = 0;
		status = false;
	}

	/**
	 * @param t "CC" para Conta Corrente ou "CP" para Conta Poupança.
	 */

	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
		} else if (t == "CP") {
			this.setSaldo(150);
		} else {
			this.setStatus(false);
		}
		System.out.println("Conta aberta com sucesso!");

	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro.");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta com débito.");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechado com sucesso.");
		}

	}

	public void depositar(double v) {
		if (this.getStatus() == true) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Depósito realizado na conta de " + this.getDono() + " no valor de " + v);
		} else {
			System.out.println("Impossivel depositar em uma conta fechada");
		}

	}

	public void sacar(double v) {
		if (this.getStatus() == true) {
			if (this.getSaldo() > v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " + this.getDono() + " no valor de " + v);
			} else {
				System.out.println("Saldo insuficiente");
			}

		} else {
			System.out.println("Impossivel sacar: Conta inexistente");
		}

	}

	public void pagarMensal() {
		double v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		} else if (this.getTipo() == "CP") {
			v = 20;
		}
		
		if (this.getStatus() == true) {
			if (this.getSaldo() > v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Mensalidade paga com sucesso por " + this.getDono() + " no valor de " + v);
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("Impossivel pagar: Conta inexistente");
		}

	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	private void setStatus(boolean status) {
		this.status = status;
	}

}
