package ClassesEObjetos.Projeto;

public class Desenvolvedor extends Pessoa{

    double salario;
    int horas;
    public Desenvolvedor(String nome, String telefone , double salario) {
        super(nome, telefone);
        this.salario = salario;
    }
    public double CalcSalario(){
        this.salario = horas * 255;
        return this.salario;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "salario=" + salario + "\n" +
                ", horas=" + horas +"\n" +
                ", Nome='" + super.getNome() + '\'' +"\n" +
                ", Telefone='" + super.getTelefone() + '\'' +"\n" +
                ", DataDeAdmissao=" + super.getDataDeAdmissao() + "\n" +
                '}';
    }

    public double getSalario() {
        return this.horas * 255;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
}
