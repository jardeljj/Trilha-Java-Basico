import java.util.Scanner;

public class FabricaIphone {

    public static void main(String[] args) {
        // Criação de um objeto iPhone
        iPhone meuIphone = new iPhone("iPhone 14", 128);

        // Testar funcionalidades do iPhone

        // Ligar o iPhone
        meuIphone.ligar();

        // Usar o Reprodutor Musical
        System.out.println("Testando Reprodutor Musical:");
        meuIphone.usarReprodutorMusical();
        ReprodutorMusical reprodutor = meuIphone.getReprodutorMusical();
        reprodutor.pausarMusica();
        reprodutor.pararMusica();

        // Usar o Aparelho Telefônico
        System.out.println("\nTestando Aparelho Telefônico:");
        meuIphone.usarAparelhoTelefonico();
        AparelhoTelefonico telefone = meuIphone.getAparelhoTelefonico();
        telefone.receberChamada();
        telefone.encerrarChamada();

        // Usar o Navegador na Internet
        System.out.println("\nTestando Navegador na Internet:");
        meuIphone.usarNavegadorInternet();
        NavegadorInternet navegador = meuIphone.getNavegadorInternet();
        navegador.navegar("http://teste45454.com");
        navegador.fecharPagina();

        // Desligar o iPhone
        meuIphone.desligar();
    }
}
