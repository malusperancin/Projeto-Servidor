public class PedidoDeEscolha extends Comunicado
{
    private char escolha;

    public PedidoDeEscolha(char escolha)
    {
        this.escolha = escolha;
    }

    public char getEscolha ()
    {
        return this.escolha;
    }
}
