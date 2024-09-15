public class iPhone {
    private String modelo;
    private int capacidade;

    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public iPhone(String modelo, int capacidade) {
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.reprodutorMusical = new ReprodutorMusicalImpl();
        this.aparelhoTelefonico = new AparelhoTelefonicoImpl();
        this.navegadorInternet = new NavegadorInternetImpl();
    }

    public void ligar() {
        System.out.println("iPhone ligado.");
    }

    public void desligar() {
        System.out.println("iPhone desligado.");
    }

    public void usarReprodutorMusical() {
        reprodutorMusical.tocarMusica("musica.mp3");
    }

    public void usarAparelhoTelefonico() {
        aparelhoTelefonico.fazerChamada("123456789");
    }

    public void usarNavegadorInternet() {
        navegadorInternet.abrirPagina("http://teste45454.com");
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }
}
