package ClassesEObjetos.Interface.Pagamento;

public class Nubank implements Operadora{

    @Override
    public boolean autorizar(Autorizacao autorizacao, Cartao cartao) {
        return cartao.getNumeroDoCartao().startsWith("123") &&
                autorizacao.getValorDaCompra()<=500;
    }
}
