package ClassesEObjetos.Interface.Pagamento;

public class Cartao {
    //Aqui essa classe trata das informçoes vasicas do carao do cliente
    //qye devem ser repassadas para as interfaces
    // a interface operadora é quem vai dizer se a compra desse cartao
    //é valida ou não

    private String nomeDoCliente;
    private String numeroDoCartao;

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }
}
