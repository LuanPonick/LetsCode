package ClassesEObjetos.AppBancario.Classes;

public abstract class Contas {
    private String Nome;
    private String AberturaConta;
    private float dinheiro;
    Contas(String nome,String dia,float Dinheiro){
        this.Nome = nome;
        this.AberturaConta = dia;
        this.dinheiro = dinheiro;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getAberturaConta() {
        return AberturaConta;
    }

    public void setAberturaConta(String aberturaConta) {
        AberturaConta = aberturaConta;
    }

    public float getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }
}
