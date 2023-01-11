package ClassesEObjetos.Interface.Caixa;

import ClassesEObjetos.Interface.Impressao.Impressoara;
import ClassesEObjetos.Interface.Pagamento.Autorizacao;
import ClassesEObjetos.Interface.Pagamento.Cartao;
import ClassesEObjetos.Interface.Pagamento.Operadora;

public class Checkout {
    private Operadora operadora;
    private Impressoara impressoara;

    public Checkout (Operadora operadora, Impressoara impressora){
        this.operadora = operadora;
        this.impressoara = impressora;
    }

    public Operadora getOperadora() {
        return operadora;
    }

    public void setOperadora(Operadora operadora) {
        this.operadora = operadora;
    }

    public Impressoara getImpressoara() {
        return impressoara;
    }

    public void setImpressoara(Impressoara impressoara) {
        this.impressoara = impressoara;
    }
    public void FecharCompra(Compra compra, Cartao cartao){
        if(this.operadora.autorizar(compra,cartao)){
            this.impressoara.imprimir(compra);
        }else{
            System.out.println("Compra negada");
        }
    }

}
