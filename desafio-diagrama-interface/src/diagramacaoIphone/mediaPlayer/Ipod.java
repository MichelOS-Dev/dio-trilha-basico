package diagramacaoIphone.mediaPlayer;

public class Ipod implements MediaPlayer {
	public void tocar() {
		System.out.println("TOCANDO MUSICA NO IPOD!");
		
	}

	public void pausar() {
		System.out.println("PAUSANDO MÚSICA IPOD!");
		
	}
	
	public void selecionarMusica(String musica) {
		System.out.println("SELECIONANDO MÚSICA IPOD!");
	}
}
