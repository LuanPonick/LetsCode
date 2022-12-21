package ClassesEObjetos.Alunos;

import ClassesEObjetos.Boletin.Aluno;

public class AlunoUniville extends Pessoa{
    private double prova1;
    private double prova2;
    private double prova3;
    public AlunoUniville(){

    }
    public AlunoUniville(String nomeAluno, String matricula) {
        super(nomeAluno, matricula);
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
    public double calcMedia(){
        double media = (prova1 + (prova2 * 2) + (prova3 *3 ))/6;
        if(media>=6){
            System.out.println("Aprovado");
        }else {
            System.out.println("reprovado");
        }
        return 0;
    }

}
