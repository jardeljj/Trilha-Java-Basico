public class AparelhoTelefonicoImpl implements AparelhoTelefonico{
    private String numeroAtual;
    private boolean chamadaEmAndamento;

    @Override
    public void fazerChamada(String numero) {
        numeroAtual = numero;
        chamadaEmAndamento = true;
        System.out.println("Fazendo chamada para: " + numero);
    }

    @Override
    public void receberChamada() {
        chamadaEmAndamento = true;
        System.out.println("Recebendo chamada.");
    }

    @Override
    public void encerrarChamada() {
        chamadaEmAndamento = false;
        System.out.println("Chamada encerrada.");
    }
}
