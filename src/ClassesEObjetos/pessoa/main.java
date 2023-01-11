package ClassesEObjetos.pessoa;

public class main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new PessoaFisica();
        Pessoa pessoa2 = new PessoaJuridica();

        pessoa1.PagarImposto();
        pessoa2.PagarImposto();

    }
}
