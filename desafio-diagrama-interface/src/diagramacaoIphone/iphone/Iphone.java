package diagramacaoIphone.iphone;

import diagramacaoIphone.navegador.Browser;
import diagramacaoIphone.telefone.Dispositivo;
import diagramacaoIphone.mediaPlayer.MediaPlayer;

public class Iphone implements Browser, Dispositivo, MediaPlayer {
	
	private String numeroDeSerie;
    private String modelo;
    
    public Iphone(String numeroDeSerie, String modelo) {
        this.numeroDeSerie = numeroDeSerie;
        this.modelo = modelo;
    }
    
	@Override
	public void tocar() {
		System.out.println("TOCANDO VIA IPHONE 2007!");
		
	}

	@Override
	public void pausar() {
		System.out.println("PAUSANDO VIA IPHONE 2007!");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("SELECIONANDO MUSICA VIA IPHONE 2007!");
		
	}

	@Override
	public void ligar(String numeroDestino) {
		System.out.println("LIGANDO VIA IPHONE 2007 PARA: "+ numeroDestino);
		
	}

	@Override
	public void atenderChamada() {
		System.out.println("ATENDENDO CHAMADA VIA IPHONE 2007!");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ VIA IPHONE 2007!");
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("EXIBINDO PÁGINA VIA IPHONE 2007!");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA VIA IPHONE 2007!");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA VIA IPHONE 2007!");
	}

}
