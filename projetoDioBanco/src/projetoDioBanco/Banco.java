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
    
    public void listarContas() {
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
        } else {
            for (Conta conta : contas) {
                System.out.println("Número da Conta: " + conta.getNumero());
                System.out.println("Titular da Conta: " + conta.getCliente().getNome());
                System.out.println("Saldo: " + conta.getSaldo());
                System.out.println("Tipo de conta: "+ conta.getTipoConta());
                System.out.println("Status da conta: "+ conta.isStatus());
                System.out.println("------------------------------");
            }
        }
    }
    
    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println("Cliente: " + cliente.getNome());
                System.out.println("Cpf: " + cliente.getCpf());
                System.out.println("Endereço: "+ cliente.getEndereco());
                System.out.println("------------------------------");
            }
        }
    }
    
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public void criarContaCorrente(String cpf) {
    	Cliente cliente = buscarClientePorCpf(cpf);
        Conta conta = new ContaCorrente(cliente, "Corrente");
        contas.add(conta);
    }
    
    public void criarContaPoupanca(String cpf) {
    	Cliente cliente = buscarClientePorCpf(cpf);
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
