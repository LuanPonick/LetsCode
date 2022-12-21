package ClassesEObjetos.Alunos;

public class Principal {
    public static void main(String[] args) {
        AlunoUFSC aluno1 = new AlunoUFSC();
        aluno1.setNomeAluno("Luan Davi Ponick");
        aluno1.setMatricula("2022-222222");
        aluno1.setNotas1(5.5);
        aluno1.setNotas2(2.5);
        System.out.println(aluno1.toString());
        aluno1.calcMedia();

        AlunoUniville aluno2 = new AlunoUniville();

    }
}
