package ClassesEObjetos.Alunos;

import java.util.Scanner;

public class AlunoUFSC extends Pessoa{
    private double notas1;
    private double notas2;
    private double notas3;
    Scanner input = new Scanner(System.in);

    public AlunoUFSC(){

    }
    public AlunoUFSC(String nome, String matricula, double notas1, double notas2, double notas3) {
        super.getMatricula();
        super.getNomeAluno();
        this.notas1 = notas1;
        this.notas2 = notas2;
        this.notas3 = notas3;
    }

    public double getNotas1() {
        return notas1;
    }

    public void setNotas1(double notas1) {
        this.notas1 = notas1;
    }

    public double getNotas2() {
        return notas2;
    }

    public void setNotas2(double notas2) {
        this.notas2 = notas2;
    }

    public double getNotas3() {
        return notas3;
    }

    @Override
    public String toString() {
        return "AlunoUFSC{" +
                "notas1=" + notas1 +
                ", notas2=" + notas2 +
                ", notas3=" + notas3 +
                ", matricula='" + super.getMatricula() + '\'' +
                ", nome='" + super.getNomeAluno() + '\'' +
                '}';
    }

    public void setNotas3(double notas3) {
        this.notas3 = notas3;
    }
    public double calcMedia(){
        double media = (this.notas1 + this.notas2)/2;
        if(media >=7){
            System.out.println("Aprovado");
        }else {
            System.out.println("Informe a terceira prova: ");
            this.notas3 = input.nextDouble();
            if(this.notas3 >= 7){
                System.out.println("aprovado");
            }else {
                System.out.println("reprovado");
            }
        }
        return 0;
    }
}
