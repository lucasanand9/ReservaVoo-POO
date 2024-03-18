package dados;

public class Reserva {
	private int numReserva;
	private String dataVoo;
	private String horaVoo;
	private float preco;
	private String classeVoo;
	private boolean idaEvolta;
	private int poltrona;
	private Cidade origem;
	private Cidade destino;
	private Reserva volta;

	public int getNumReserva() {
		return numReserva;
	}
	public String getDataVoo() {
		return dataVoo;
	}
	public String getHoraVoo() {
		return horaVoo;
	}
	public float getPreco() {
		return preco;
	}
	public String getClasseVoo() {
		return classeVoo;
	}
	public boolean isIdaEvolta() {
		return idaEvolta;
	}
	public int getPoltrona() {
		return poltrona;
	}
	public Cidade getOrigem() {
		return origem;
	}
	public Cidade getDestino() {
		return destino;
	}
	public Reserva getVolta() {
		return volta;
	}
	public void setNumReserva(int numReserva) {
		this.numReserva = numReserva;
	}
	public void setDataVoo(String dataVoo) {
		this.dataVoo = dataVoo;
	}
	public void setHoraVoo(String horaVoo) {
		this.horaVoo = horaVoo;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public void setClasseVoo(String classeVoo) {
		this.classeVoo = classeVoo;
	}
	public void setIdaEvolta(boolean idaEvolta) {
		this.idaEvolta = idaEvolta;
	}
	public void setPoltrona(int poltrona) {
		this.poltrona = poltrona;
	}
	public void setOrigem(Cidade origem) {
		this.origem = origem;
	}
	public void setDestino(Cidade destino) {
		this.destino = destino;
	}
	public void setVolta(Reserva volta) {
		this.volta = volta;
	}
	
	@Override
	public String toString() {
		return "Reserva [numReserva: " + numReserva + ", dataVoo: " + dataVoo + ", horaVoo: " + horaVoo + ", preco: "
				+ preco + ", classeVoo: " + classeVoo + ", idaEvolta: " + idaEvolta + ", poltrona: " + poltrona
				+ ", origem: " + origem + ", destino: " + destino + ", volta: " + volta + "]";
	}

		
	
}
