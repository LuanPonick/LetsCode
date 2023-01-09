package ClassesEObjetos.AppBancario.Classes;

public class Pessoa extends Contas{
    private String cpf;
    private String senha;

    public Pessoa(String cpf, String Nome, String senha, String dia) {
        super(Nome, dia,0);
        this.cpf = cpf;
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
