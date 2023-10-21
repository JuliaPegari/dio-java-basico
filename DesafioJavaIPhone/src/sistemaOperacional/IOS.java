package sistemaOperacional;

import aplicativos.AparelhoTelefonico;
import aplicativos.NavegadorInternet;
import aplicativos.ReprodutorMusical;

public class IOS implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    
    public void tocar() {
        System.out.println("Tocando Musica!");
    }

    public void pausar() {
        System.out.println("Musica pausada.");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando musica!");
    }

    public void exibirPagina() {
        System.out.println("Exibindo pagina solicitada.");
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba sendo aberta.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a pagina.");
    }

    public void ligar() {
        System.out.println("Realizando uma ligação");
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Chamada não atendida. Encaminhadom para o correio de voz.");
    } 
}
