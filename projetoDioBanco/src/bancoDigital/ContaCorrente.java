package projetoDioBanco;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente, String tipoConta) {
		super(cliente, tipoConta);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente === ");
		super.imprimirAtributos();
	}
	
}
