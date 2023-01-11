package ClassesEObjetos.pessoa;

public class PessoaJuridica implements Pessoa{
    private String cnpj;
    @Override
    public void PagarImposto() {
        System.out.println("voce pagou imposto da sua impresa");
    }
    public void contratarFuncionario(){
        System.out.println("Voce contratou um funcionarioe");
    }

}
