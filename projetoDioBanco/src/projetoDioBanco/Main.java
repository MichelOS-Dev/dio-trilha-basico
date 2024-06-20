package projetoDioBanco;

public class Main {
	public static void main(String[] args) {

		Banco bancoItau = new Banco();
		Cliente cl = new Cliente("Michel Oliveira", "938-485-323-32","Quixadá - CE, Centro");
		bancoItau.adicionarCliente(cl);
		
		bancoItau.criarContaCorrente("938-485-323-32");
		
		
		
	}
}
