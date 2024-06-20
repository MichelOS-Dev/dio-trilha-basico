package projetoDioBanco;

public interface IConta {
	
	/*
	 * void apagarConta();
	 * 
	 * void desativarConta();
	 */

	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta contaDestino);
	
	void imprimirExtrato();
}
