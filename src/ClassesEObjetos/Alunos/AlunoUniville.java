package ClassesEObjetos.Alunos;

public class AlunoUniville extends Estudante {
    public AlunoUniville(){

    }
    public AlunoUniville(String nomeAluno, String matricula,double nota1,double nota2,double nota3) {
        super(nomeAluno, matricula,nota1,nota2,nota3);
    }

    public double getProva1() {
        return prova1;
    }

    public void setProva1(double prova1) {
        this.prova1 = prova1;
    }

    public double getProva2() {
        return prova2;
    }

    public void setProva2(double prova2) {
        this.prova2 = prova2;
    }

    public double getProva3() {
        return prova3;
    }

    public void setProva3(double prova3) {
        this.prova3 = prova3;
    }

    @Override//anotação sobre escreção
    public String toString() {
        return "AlunoUniville{" +
                "prova1=" + prova1 +
                ", prova2=" + prova2 +
                ", prova3=" + prova3 +
                '}';
    }


}
