package dados;
import java.util.ArrayList;

public class Cliente {
	private String cpf; 
	private String nome;
	private String endereco;
	private	long telefone;
	private ArrayList<Reserva> reservas = new ArrayList<Reserva>();
	
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public long getTelefone() {
		return telefone;
	}

	public ArrayList<Reserva> getReservas() {
		return reservas;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	
	public void setReservas(ArrayList<Reserva> reservas) {
		this.reservas = reservas;
	}
	
	public void reservaIda(Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	public void reservaVolta(Reserva ida, Reserva volta){
		ida.setIdaEvolta(true);
		ida.setVolta(volta);
		this.reservas.add(ida);
	}
	@Override
	public String toString() {
		return "Cliente [cpf: " + cpf + ", nome: " + nome + ", endereco: " + endereco + ", telefone: " + telefone
				+ ", reservas: " + reservas + "]";
	}
	

	
}
