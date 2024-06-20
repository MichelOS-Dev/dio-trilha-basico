package projetoDioBanco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	public String nome;
	private List<Cliente> clientes;
    private List<Conta> contas;
	
    public Banco() {
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }
    
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public void criarContaCorrente(String cpf) {
    	Cliente cliente = buscarClientePorCpf(cpf);
        Conta conta = new ContaCorrente(cliente, "Corrente");
        contas.add(conta);
    }
    
    public void criarContaPoupanca(Cliente cliente) {
        Conta conta = new ContaCorrente(cliente, "Poupança");
        contas.add(conta);
    }
    
    public Cliente buscarClientePorCpf(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null; // Cliente não encontrado
    }
    
    
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
