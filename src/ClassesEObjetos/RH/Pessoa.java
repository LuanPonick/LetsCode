package ClassesEObjetos.RH;

import java.util.Date;

public class Pessoa {
    private String Nome;
    private String Telefone;
    private Date DataDeAdmissao;

    public Pessoa(String nome, String telefone) {
        Nome = nome;
        Telefone = telefone;
        DataDeAdmissao = new Date();
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "Nome='" + Nome + '\'' +
                ", Telefone='" + Telefone + '\'' +
                ", DataDeAdmissao=" + DataDeAdmissao +
                '}';
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public Date getDataDeAdmissao() {
        return DataDeAdmissao;
    }

    public void setDataDeAdmissao(Date dataDeAdmissao) {
        DataDeAdmissao = dataDeAdmissao;
    }
}


