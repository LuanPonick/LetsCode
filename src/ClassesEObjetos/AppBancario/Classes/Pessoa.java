package ClassesEObjetos.AppBancario.Classes;

public class Pessoa extends Contas{
    private String cpfOrCnpj;
    private String senha;

    public Pessoa(String cpf, String Nome, String senha, String dia) {
        super(Nome, dia,0);
        this.cpfOrCnpj = cpf;
        this.senha = senha;
    }

    public String getCpfOrCnpj() {
        return cpfOrCnpj;
    }

    public void setCpfOrCnpj(String cpfOrCnpj) {
        this.cpfOrCnpj = cpfOrCnpj;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
