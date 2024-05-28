package diagramacaoIphone.telefone;

public class AparelhoTelefone implements Dispositivo {
    public String numeroAparelho;
    
    public AparelhoTelefone(String numero) {
        this.numeroAparelho = numero;
    }
    
    public void ligar(String numeroDestino) {
    	System.out.println("LIGANDO PELO APARELHO TELEFÔNICO PARA "+numeroDestino);
    }

    public void atenderChamada() {	
    	System.out.println("ATENDENDO A CHAMADA VIA APARELHO TELEFONICO!");
    }

    public void iniciarCorreioVoz() {
    	System.out.println("INICIANDO CORREIO DE VOZ APARELHO TELEFÔNICO");
    }
}
