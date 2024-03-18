package dados;

public class Cidade {
	private String nome;
	private String Estado;
	public String getNome() {
		return nome;
	}
	public String getEstado() {
		return Estado;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	
	@Override
	public String toString() {
		return "Cidade [nome: " + nome + ", Estado: " + Estado + "]\n";
	}
	

}
