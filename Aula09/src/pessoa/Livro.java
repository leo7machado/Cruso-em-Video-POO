package pessoa;

public class Livro implements Publicacao {
	private String autor;
	private String titulo;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	// Método

	
	public String detalhes() {
		return "Livro [autor= " + autor + "\n, titulo= " + titulo + "\n, totPaginas= " + totPaginas + ", pagAtual= " + pagAtual
				+ ", aberto= " + aberto + "\n, leitor= " + leitor.getNome() + ", idade= " + leitor.getIdade() + ", sexo= " + 
				leitor.getSexo() + "]";
	}


	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.totPaginas = totPaginas;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}


	// Método especiais

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	@Override
	public void abrir() {
		this.aberto = true;
	}
	@Override
	public void fechar() {
		this.aberto = false;
	}
	@Override
	public void folhear(int p) {
		if (p > this.totPaginas) {
			this.pagAtual = 0;
		} else {
			this.pagAtual = p;
		}
	}
	@Override
	public void avancarPag() {
		if (this.pagAtual == this.totPaginas) {
			this.setPagAtual(this.totPaginas);
		} else {
			this.setPagAtual(getPagAtual() + 1);
		}
		
	}
	@Override
	public void voltarPag() {
		if (this.pagAtual == 0) {
			this.setPagAtual(0);
		} else {
			this.setPagAtual(getPagAtual() - 1);
		}
	}
	
	

}
