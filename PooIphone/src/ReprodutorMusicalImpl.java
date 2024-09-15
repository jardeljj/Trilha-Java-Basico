public class ReprodutorMusicalImpl implements ReprodutorMusical{
    private String musicaAtual;
    private String status;

    @Override
    public void tocarMusica(String musica) {
        musicaAtual = musica;
        status = "tocando";
        System.out.println("Tocando música: " + musica);
    }

    @Override
    public void pausarMusica() {
        status = "pausado";
        System.out.println("Música pausada.");
    }

    @Override
    public void pararMusica() {
        status = "parado";
        System.out.println("Música parada.");
    }
}
