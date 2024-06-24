package bancoDigital;

public class Main {
	public static void main(String[] args) {

		Banco bancoItau = new Banco();
		Cliente cl = new Cliente("Michel Oliveira", "938-485-323-32","Quixadá - CE, Centro");
		Cliente cl1 = new Cliente("Michel Oliveira1", "938-485-323-32","Quixadá - CE, Centro");
		
		bancoItau.adicionarCliente(cl);
		bancoItau.criarContaPoupanca("938-485-323-32");
		bancoItau.listarContas();
		bancoItau.adicionarCliente(cl1);
		
		
		bancoItau.listarClientes();
		
	}
}
