package apresentacao;

import java.util.Scanner;

import dados.Cidade;
import dados.Cliente;
import dados.Reserva;
import negocio.ReservaPassagem;

public class Principal {
	private static ReservaPassagem sistema  = new ReservaPassagem();
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		menu();
	}

	public static void mostraMenu() {
		System.out.println("Escolha uma opção:");
		System.out.println("0 - Encerrar");
		System.out.println("1 - Fazer reserva");
		System.out.println("2 - Cadastrar cliente");
		System.out.println("3 - Mostrar reserva");
		System.out.println("4 - Cadastrar cidade");
	}
	
	public static void menu() {
		int opcao = -1;
		while (opcao != 0) {
			mostraMenu();
			opcao =Integer.parseInt(scan.nextLine());
			
			switch (opcao){
			case 0:
				break;
			case 1:
				System.out.println("Fazer Reserva");
				fazerReserva();
			break;
			
			case 2:
				System.out.println("Cadastrar Cliente");
				cadastrarCliente();
			break;
			
			case 3:
				System.out.println("Mostrar Reserva");
				mostrarReserva();
			break;

			case 4:
				System.out.println("Cadastrar Cidade");
				cadastrarCidade();
			break;
			
			default:
				System.out.println("Numero invalido");
			break;
			}
			
		}
	}
	
	public static void mostrarCliente() {
		for(Cliente i : sistema.mostraClientes()) {
			System.out.println(i.toString());
		}
	}
	
	public static Cliente escolherCliente() {
		mostrarCliente();
		System.out.println("Digite o Cpf do cliente escolhido");
		
		Cliente c = sistema.buscaCliente(scan.nextLine());
		
		if(c != null) {
			return c;
		}
			return null;	
	}
	
	public static void mostrarCidades() {
		for(int i = 0; i< sistema.mostraCidades().size(); i++) {
			System.out.println("Cidade " + i);
			System.out.println(sistema.mostraCidades().get(i).toString());
		}
	}
	
	public static Cidade escolherCidade() {
		mostrarCidades();
		
		System.out.println("Escolha uma cidade(caso queria criar uma nova cidade digite -1)");
		int codigo = Integer.parseInt(scan.nextLine());
		
		if(codigo > sistema.mostraCidades().size()) {
			System.out.println("Cidade invalida");
			return null;
		}else if(codigo == -1) {
			return novaCidade();
		}else {
			return sistema.mostraCidades().get(codigo);
		}
	}
	
	public static Reserva novaReserva() {
		System.out.println("Digite a data do voo");
		String data = scan.nextLine();
		
		System.out.println("Digite a hora do voo");
		String hora = scan.nextLine();
		
		System.out.println("Digite o preço do voo");
		float preco = Float.parseFloat(scan.nextLine());
		
		System.out.println("Digite a classe do voo");
		String classe = scan.nextLine();
		
		System.out.println("Digite a poltrona no voo");
		int poltrona = Integer.parseInt(scan.nextLine());
		System.out.println("Origem");
		Cidade origem = escolherCidade();
		System.out.println("Destino");
		Cidade destinho = escolherCidade();
		
		Reserva r = new Reserva();
		r.setDataVoo(data);
		r.setHoraVoo(hora);
		r.setPreco(preco);
		r.setClasseVoo(classe);
		r.setPoltrona(poltrona);
		r.setOrigem(origem);
		r.setDestino(destinho);
		
		return r;
	}
	
	public static void fazerReserva() {
		Cliente c = escolherCliente();
		
		if(c != null) {
			int opcao = -1;
			while (opcao != 0) {
				System.out.println("Digite 0 para sair");
				System.out.println("Digite 1 para reservar apenas a ida");
				System.out.println("Digite 2 para reservar ida e volta");
				opcao = Integer.parseInt(scan.nextLine());
				switch (opcao) {
				case 0:
					break;
				case 1:
					Reserva r = novaReserva();
					sistema.reservaIda(c, r);
					break;

				case 2:
					Reserva r1 = novaReserva();
					Reserva volta = novaReserva();
					sistema.reservaVolta(c, r1, volta);
					break;
				default:
					break;
				}
			}
		}
	}
	
	public static Cliente novoCliente() {
		System.out.println("Digite seu cpf");
		String cpf = scan.nextLine();
		System.out.println("Digite seu nome");
		String nome = scan.nextLine();
		System.out.println("Digite seu endereço");
		String endereco = scan.nextLine();
		System.out.println("Digite seu telefone");
		long telefone = Long.parseLong(scan.nextLine());
		
		Cliente c = new Cliente();
		c.setCpf(cpf);
		c.setEndereco(endereco);
		c.setNome(nome);
		c.setTelefone(telefone);
		
		return c;
	}
	
	public static void cadastrarCliente() {
		sistema.cadastrarCliente(novoCliente());
	}
	
	public static void mostrarReserva() {
		Cliente c = escolherCliente();
	
		for(Reserva r :sistema.mostrarReservas(c.getCpf())) {
			System.out.println(r.toString());
		}
	
	}
	
	public static Cidade novaCidade() {
		System.out.println("Digite o nome da cidade:");
		String nome = scan.nextLine();
		System.out.println("Digite o estado:");
		String estado = scan.nextLine();
		
		Cidade c = new Cidade();
		c.setEstado(estado);
		c.setNome(nome);
		
		return c;
	}
	
	public static void cadastrarCidade() {
		sistema.cadastrarCidade(novaCidade());
	}
	
	
	
	
	
	
	
	
}












