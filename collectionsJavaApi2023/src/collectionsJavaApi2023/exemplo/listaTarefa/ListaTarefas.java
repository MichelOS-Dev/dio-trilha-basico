package collectionsJavaApi2023.exemplo.listaTarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	
	private List<Tarefa> tarefaList;
	
	public ListaTarefas() {
		this.tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefas(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerItem(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for(Tarefa t: tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		
		tarefaList.removeAll(tarefasParaRemover);
		
	}
	
	public int obterNumeroTotalDeTarefas() {
		return tarefaList.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
	
	public static void main(String[] args) {
		ListaTarefas listaTarefa = new ListaTarefas();
		
		System.out.println("Quantidade de tarefas: "+listaTarefa.obterNumeroTotalDeTarefas());
	
		for(int i = 0; i < 10; i++){
			listaTarefa.adicionarTarefas("Tarefa 0"+i);
		}
		listaTarefa.adicionarTarefas("Tarefa 05");
		
		System.out.println("Quantidade de tarefas: "+listaTarefa.obterNumeroTotalDeTarefas());

		listaTarefa.removerItem("Tarefa 05");
		
		System.out.println("Quantidade de tarefas: "+listaTarefa.obterNumeroTotalDeTarefas());
		
		listaTarefa.obterDescricoesTarefas();
		
	}
}
