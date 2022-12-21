package ClassesEObjetos.Projeto;

public class Gerente extends Pessoa{
    private double salario;
    private int horas;
    private int dias;
    public Gerente(String nome, String telefone , double salario)
    {
        super(nome, telefone);
        this.salario = salario;
    }
    public double CalcSalario(){
        this.salario = dias * horas * 255;
        return this.salario;
    }

    public double getSalario() {
        return salario;
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

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "salario=" + salario +
                ", horas=" + horas +
                ", dias=" + dias +
                ", Nome='" + super.getNome() + '\'' +"\n" +
                ", Telefone='" + super.getTelefone() + '\'' +"\n" +
                ", DataDeAdmissao=" + super.getDataDeAdmissao() + "\n" +
                '}';
    }
}
