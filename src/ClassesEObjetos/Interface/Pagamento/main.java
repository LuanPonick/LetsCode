package ClassesEObjetos.Interface.Pagamento;

import ClassesEObjetos.Interface.Caixa.Checkout;
import ClassesEObjetos.Interface.Caixa.Compra;
import ClassesEObjetos.Interface.Impressao.HP;
import ClassesEObjetos.Interface.Impressao.Impressoara;

public class main {
    public static void main(String[] args) {
        //para testar precusamos instanciar uma operadora uma impreessora
        //i, cartao doo cliente uma compra e finalmente instanciar um
        //checkout
        Operadora operadora = new Nubank();
        Impressoara impressora = new HP();
        Cartao cartao = new Cartao();

        cartao.setNomeDoCliente("Luan Ponick");
        cartao.setNumeroDoCartao("1234.5555.5555.5555");
        Compra compra = new Compra();
        compra.setValorCompra(100);
        compra.setNome("Nome");
        compra.setProduto("all star");
        //finaliza compra do produto
        Checkout cheaCheckout = new Checkout(operadora,impressora);
        cheaCheckout.FecharCompra(compra,cartao);
    }
}
