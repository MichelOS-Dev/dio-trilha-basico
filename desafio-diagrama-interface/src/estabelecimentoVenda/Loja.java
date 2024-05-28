package estabelecimentoVenda;

import diagramacaoIphone.iphone.Iphone;
import diagramacaoIphone.mediaPlayer.Ipod;
import diagramacaoIphone.mediaPlayer.MediaPlayer;
import diagramacaoIphone.navegador.Browser;
import diagramacaoIphone.navegador.NavegadorInternet;
import diagramacaoIphone.telefone.AparelhoTelefone;
import diagramacaoIphone.telefone.Dispositivo;

public class Loja {
	public static void main(String[] args) {
		
		Iphone meuIphone = new Iphone("2736","Iphone 2007");
		
		meuIphone.ligar("889837423");
		meuIphone.atenderChamada();
        meuIphone.iniciarCorreioVoz();
        meuIphone.selecionarMusica("Musica 01");
        meuIphone.pausar();
        meuIphone.tocar();
        meuIphone.exibirPagina("https://www.google.com");;
        meuIphone.atualizarPagina();
        meuIphone.adicionarNovaAba();
        
        //ISSO PODE
		Dispositivo telefone = meuIphone;
		MediaPlayer ipod = meuIphone;
		Browser navegador = meuIphone;
		
		telefone.atenderChamada();
		ipod.tocar();
		navegador.atualizarPagina();
		
		//ISSO NÃO PODE
		/*AparelhoTelefone  telefone = meuIphone;
		Ipod ipod = meuIphone;
		NavegadorInternet navegador = meuIphone;
		
		telefone.atenderChamada();
		ipod.tocar();
		navegador.atualizarPagina();
		*/
		System.out.println("------------------------------------");
		//ISSO PODE
		AparelhoTelefone  telefone_1 = new AparelhoTelefone("88997653847");
		Ipod ipod_1 = new Ipod();
		NavegadorInternet navegador_1 = new NavegadorInternet();
		
		telefone_1.atenderChamada();
		ipod_1.tocar();
		navegador_1.atualizarPagina();
	}
}
