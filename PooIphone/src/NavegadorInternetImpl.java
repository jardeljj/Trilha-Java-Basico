public class NavegadorInternetImpl implements NavegadorInternet{
    private String paginaAtual;

    @Override
    public void abrirPagina(String url) {
        paginaAtual = url;
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando página: " + paginaAtual);
        paginaAtual = null;
    }

    @Override
    public void navegar(String url) {
        paginaAtual = url;
        System.out.println("Navegando para: " + url);
    }
}
