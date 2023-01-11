package ClassesEObjetos.pessoa;

public class PessoaFisica implements Pessoa{
    private String Cpf;
    private int Idade;
    private double peso;
    private char sexo;

    @Override
    public void PagarImposto() {
        System.out.println("vc pagou imposto");
    }
    public void andar(){
        System.out.println("1 passo");
    }
    public void dormir(){
        System.out.println("voce dormiu");
    }
    public void comer(){
        System.out.println("voce comeu");
    }
    public void respirar(){
        System.out.println("voce respirou");
    }



}
