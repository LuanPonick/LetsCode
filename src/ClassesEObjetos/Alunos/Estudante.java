package ClassesEObjetos.Alunos;

public abstract class Estudante {
    private String nomeAluno;
    private String matricula;
    double prova1;
    double prova2;
    double prova3;
    public Estudante(String nomeAluno, String matricula, double prova1, double prova2, double prova3) {
        this.nomeAluno = nomeAluno;
        this.matricula = matricula;
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.prova3 = prova3;
    }

    public Estudante() {
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nomeAluno='" + nomeAluno + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
    public void calcMedia(){
        double media = (prova1 + (prova2 * 2) + (prova3 *3 ))/6;
        if(media>=6){
            System.out.println("Aprovado");
        }else {
            System.out.println("reprovado");
        }
    }

}
