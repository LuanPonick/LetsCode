package ClassesEObjetos.Boletin;

public class Aluno {
    public String Nome;
    public double Notas[][];
    public Aluno(String Nome){
        this.Nome = Nome;
        Notas = new double[3][12];
    }
    public String Final(int pos){
        if((Notas[0][pos]+Notas[1][pos]+Notas[2][pos]) / 3 < 7){
            return "Reprovado";
        }else {
            return "Aprovado";
        }
    }


}
