package ea3;
public class Filmes {
	private String nome;
	private String diretor;
	private String sinopse;
	private String tipo;
	private String tempo;
	private boolean filme3d;
	
	public Filmes (String nome, String diretor, String sinopse, String tipo, String tempo, boolean filme3d) {
	
		this.nome = nome;
		this.diretor = diretor;
		this.sinopse = sinopse;
		this.tipo = tipo;
		this.tempo = tempo;
		this.filme3d = filme3d;
	
		
	}
	
	

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	
		
	public boolean isFilme3d() {
		return filme3d;
	}




	public void setFilme3d(boolean filme3d) {
		this.filme3d = filme3d;
	}




	public String toString() {
		return " + / + " + this.nome + " + / + " + this.diretor + " + / + " + this.tipo + " + / + " + this.tempo + " + / + ";
	}
	
	
}
