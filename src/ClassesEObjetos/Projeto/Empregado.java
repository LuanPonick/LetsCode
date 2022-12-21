package ClassesEObjetos.Projeto;

public class Empregado extends Pessoa{
    private double salario;
    public Empregado(String nome, String telefone , double salario) {
        super(nome, telefone);
        this.salario = salario;
    }
    public double CalcSalario(){
        return this.salario;

    }

    @Override
    public String toString() {
        return "Empregado{\n" +
                "salario=" + salario + "\n" +
                ", Nome='" + super.getNome() + '\'' +"\n" +
                ", Telefone='" + super.getTelefone() + '\'' +"\n" +
                ", DataDeAdmissao=" + super.getDataDeAdmissao() +"\n" +
                '}';
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
