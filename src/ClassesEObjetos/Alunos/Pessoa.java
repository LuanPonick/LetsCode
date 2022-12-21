package ClassesEObjetos.Alunos;

public class Pessoa {
    private String nomeAluno;
    private String matricula;
    public Pessoa(String nomeAluno, String matricula) {
        this.nomeAluno = nomeAluno;
        this.matricula = matricula;
    }

    public Pessoa() {
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


}
