package bancoDigital;

public abstract class Conta implements IConta {
	
		private static int AGENCIA_PADRAO = 001;
		private static int SEQUENCIAL = 1;
	
		protected int agencia;
		protected int numero;
		protected double saldo;
		protected boolean status;
		protected Cliente cliente;
		protected String tipoConta;
		
		public Conta(Cliente cliente, String tipo) {
			this.cliente = cliente;
			this.agencia = Conta.AGENCIA_PADRAO;
			this.numero = SEQUENCIAL++;
			this.tipoConta = tipo;
			this.saldo = 0.0;
			this.status = true;
		}
		
		
		
		protected void imprimirAtributos() {
			System.out.println(String.format("Titular: %s", cliente.getNome()));
			System.out.println(String.format("Agência: %d", agencia));
			System.out.println(String.format("Conta: %d", numero));
			System.out.println(String.format("Saldo: %.2f", saldo));
		}
		
		
		public void sacar(double valor) {
			this.saldo -= valor;
		}
		
		public void depositar(double valor) {
			this.saldo += valor;
		}

		public void transferir(double valor, Conta contaDestino) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}
		
		public Cliente getCliente() {
			return cliente;
		}
		
		public double getSaldo() {
			return saldo;
		}
		
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		public int getAgencia() {
			return agencia;
		}

		public int getNumero() {
			return numero;
		}

		public boolean isStatus() {
			return status;
		}

		public void setStatus(boolean status) {
			this.status = status;
		}
		
		public String getTipoConta() {
			return tipoConta;
		}

}
