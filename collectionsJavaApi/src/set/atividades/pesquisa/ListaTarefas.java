package set.atividades.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

	private Set<Tarefa> conjuntoTarefas;
	
	public ListaTarefas() {
		this.conjuntoTarefas = new HashSet<>();
	}
	
	public void adicionarTarefa(String descricao) {
		conjuntoTarefas.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		Tarefa tarefaRemover = null;
		
		if(!conjuntoTarefas.isEmpty()) {
			for(Tarefa t: conjuntoTarefas) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					tarefaRemover = t;
					conjuntoTarefas.remove(tarefaRemover);
					break;
				}
			}
		}else {
			System.out.println("Conjunto vazio");
		}
		
		if(tarefaRemover == null) {
			System.out.println("Descrição não presente no conjunto!");
		}
	}
	
	
	public void exibirTarefas() {
		if(!conjuntoTarefas.isEmpty()) {
	      System.out.println(conjuntoTarefas);
	    } else {
	      System.out.println("Conjunto vazio!");
	    }
	}
	
	public int contarTarefas() {
		return conjuntoTarefas.size();
	}
	
	
	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		
		if(!conjuntoTarefas.isEmpty()) {
			for(Tarefa t: conjuntoTarefas) {
				if(t.isStatusConclusao()) {
					tarefasConcluidas.add(t);
				}
			}
			return tarefasConcluidas;
		}else{
			throw new RuntimeException("Conjunto vazio!");
		}
		
	}
	
	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		
		if(!conjuntoTarefas.isEmpty()) {
			for(Tarefa t: conjuntoTarefas) {
				if(!t.isStatusConclusao()) {
					tarefasPendentes.add(t);
				}
			}
			return tarefasPendentes;
		}else{
			throw new RuntimeException("Conjunto vazio!");
		}	
	}
	
	public void marcarTarefaConcluida(String descricao) {
		Tarefa tarefaMracada = null;
		
		if(!conjuntoTarefas.isEmpty()) {
			for(Tarefa t: conjuntoTarefas) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					t.setStatusConclusao(true);
					tarefaMracada = t;
					break;
				}
			}
		}else{
			System.out.println("Conjunto vazio!");
		}	
		
		if(tarefaMracada == null) {
			System.out.println("Tarefa já concluída ou tarefa não presente no conjunto!");
		}
	}

	public void marcarTarefaPendente(String descricao) {
		Tarefa tarefaMarcada = null;
		if(!conjuntoTarefas.isEmpty()) {
			for(Tarefa t: conjuntoTarefas) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					t.setStatusConclusao(false);
					tarefaMarcada = t;
					break;
				}
			}
		}else {
			System.out.println("Conjunto vazio!");
		}
		
		if(!conjuntoTarefas.isEmpty() && tarefaMarcada == null) {
			System.out.println("Tarefa não encontrada!");
		}
	}
	
	public void limparListaTarefas() {
	    if(conjuntoTarefas.isEmpty()) {
	      System.out.println("A lista já está vazia!");
	    } else {
	      conjuntoTarefas.clear();
	    }
	}
	
	
	public static void main(String[] args) {
	    // Criando uma instância da classe ListaTarefas
	    ListaTarefas listaTarefas = new ListaTarefas();

	    // Adicionando tarefas à lista
	    listaTarefas.adicionarTarefa("Estudar Java");
	    listaTarefas.adicionarTarefa("Fazer exercícios físicos");
	    listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
	    listaTarefas.adicionarTarefa("Ler livro");
	    listaTarefas.adicionarTarefa("Preparar apresentação");

	    // Exibindo as tarefas na lista
	    listaTarefas.exibirTarefas();

	    // Removendo uma tarefa
	    listaTarefas.removerTarefa("Fazer exercícios físicos");
	    listaTarefas.exibirTarefas();

	    // Contando o número de tarefas na lista
	    System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

	    // Obtendo tarefas pendentes
	    System.out.println(listaTarefas.obterTarefasPendentes());

	    // Marcando tarefas como concluídas
	    listaTarefas.marcarTarefaConcluida("Ler livro");
	    listaTarefas.marcarTarefaConcluida("Estudar Java");

	    // Obtendo tarefas concluídas
	    System.out.println(listaTarefas.obterTarefasConcluidas());

	    // Marcando tarefas como pendentes
	    listaTarefas.marcarTarefaPendente("Estudar Java");
	    listaTarefas.exibirTarefas();

	    // Limpando a lista de tarefas
	    listaTarefas.limparListaTarefas();
	    listaTarefas.exibirTarefas();
	}
}