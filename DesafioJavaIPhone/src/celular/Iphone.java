package celular;

import aplicativos.ReprodutorMusical;
import aplicativos.NavegadorInternet;
import aplicativos.AparelhoTelefonico;
import sistemaOperacional.IOS;

public class Iphone{
    public static void main(String[] args) throws Exception {
        IOS iphone = new IOS();
        ReprodutorMusical musica = (ReprodutorMusical) iphone;
        AparelhoTelefonico telefonico = (AparelhoTelefonico) iphone;
        NavegadorInternet internet = (NavegadorInternet) iphone;

        System.out.println("Inicializando IOS...");

        System.out.println("\nMusica");
        musica.selecionarMusica();
        musica.tocar();
        musica.pausar();

        System.out.println("\nTelefone");
        telefonico.ligar();
        telefonico.atender();
        telefonico.iniciarCorreioVoz();

        System.out.println("\nInternet");
        internet.exibirPagina();
        internet.adicionarNovaAba();
        internet.atualizarPagina();
    }
}
