package set.atividades.pesquisa;

public class Tarefa {
	
	private String descricao;
	private boolean statusConclusao;
	
	public Tarefa(String descricao) {
		this.descricao = descricao;
		this.statusConclusao = false;
	}

	public String getDescricao() {
		return descricao;
	}

	public boolean isStatusConclusao() {
		return statusConclusao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setStatusConclusao(boolean statusConclusao) {
		this.statusConclusao = statusConclusao;
	}
	
	@Override
	public String toString() {
		return "{ "+descricao+" - "+statusConclusao+" }";
	}
	
}









