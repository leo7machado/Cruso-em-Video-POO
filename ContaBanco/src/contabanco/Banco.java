package contabanco;

public class Banco {

	public static void main(String[] args) {

		ContaBanco c1 = new ContaBanco();
		c1.setNumConta(12345);
		c1.setDono("Jubileu");
		c1.abrirConta("CC");
		
		
		ContaBanco c2 = new ContaBanco();
		c2.setNumConta(22222);
		c2.setDono("Creuza");
		c2.abrirConta("CP");
		
		c1.depositar(100);
		c2.depositar(500);
		c2.sacar(100);

		c1.estadoAtual();
		c2.estadoAtual();
	}

}
