package ClassesEObjetos.Interface.Caixa;

import ClassesEObjetos.Interface.Impressao.Imprimivel;
import ClassesEObjetos.Interface.Pagamento.Autorizacao;

public class Compra implements Imprimivel, Autorizacao {
    private double valorCompra;
    private String produto;
    private String nome;

    @Override
    public String getCabecalhoNF() {
        return this.getNome();
    }

    @Override
    public String getCorpoNF() {
        return this.getProduto() + " = " + this.valorCompra;
    }

    @Override
    public double getValorDaCompra() {
        return this.valorCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
