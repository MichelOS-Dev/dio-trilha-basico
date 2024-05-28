package diagramacaoIphone.navegador;

public class NavegadorInternet implements Browser{

	public void exibirPagina(String url) {
		System.out.println("EXIBINDO PÁGINA NAVEGADOR!" + url);
		
	}

	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA NAVEGADOR!");
		
	}
	
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO ABA NAVEGADOR");
	}
}
