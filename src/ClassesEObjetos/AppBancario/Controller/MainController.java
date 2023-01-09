package ClassesEObjetos.AppBancario.Controller;

import ClassesEObjetos.AppBancario.Classes.Pessoa;
import ClassesEObjetos.AppBancario.ToDoing;

import java.io.IOException;
import java.util.Scanner;

public class MainController extends FunctionsController{
    //Controllers
    private final ASCCController asccController = new ASCCController();
    private final TipoDoClienteController tipoDeClienteController= new TipoDoClienteController();
    private final LoginController loginController = new LoginController();
    private final MainPainelController mainPainelController = new MainPainelController();
    //ESTADO APLICAÇÃO
    protected ToDoing AplicationState;
    //contas possiveis
    private Pessoa contaLogadaPessoa;
    //private Empresa contaLogadaEmpresa;

    public MainController(){
        this.AplicationState = ToDoing.OnLogin;
    }
    //setando momento
    public void RodarEstado(){
        switch (AplicationState)
        {
            case Exit -> SairDoPrograma();
            case OnLogin -> EscolhaDoUsuarioPrimeiraTela(tipoDeClienteController.TipoDeCliente());
            case LoginOnPessoa ->
            {
                String[] result = loginController.LoginCliente();
                if (result == null) {
                    this.AplicationState = ToDoing.OnLogin;
                } else {
                    //                                  cpf       nome     senha      dia
                    this.contaLogadaPessoa = new Pessoa(result[0], result[1], result[2], result[3]);
                    this.AplicationState = ToDoing.LoginOkFromPessoa;
                }
            }
            case LoginOkFromPessoa ->
            {
                mainPainelController.ComecarOPrograma(
                        contaLogadaPessoa.getNome(),
                        contaLogadaPessoa.getDinheiro(),
                        "CPF");
            }
        }
    }
    // Estados possiveis da applicator
    private void SairDoPrograma(){
        System.out.println("--------------------");
    }

    public void LoginPJ(){

    }

    public ToDoing getAplicationState() {
        return AplicationState;
    }
    // Abaixo funçoes sobre controle do terminal

    public void EscolhaDoUsuarioPrimeiraTela(int num) {
        switch (num) {
            case 0 -> AplicationState = ToDoing.Exit;
            case 1 -> AplicationState = ToDoing.LoginOnPessoa;
            case 2 -> AplicationState = ToDoing.LoginOnCNPJ;

            //default -> AplicationState = ToDoing.Error;
        }
    }
    public void mostrarAscAnim()throws IOException, InterruptedException {
        String teste= "sou uma frasea";
        int leghtini = teste.length();
        for(int i = 0; i <= leghtini;i++) {
            teste = " " + teste;
        }
        System.out.println(leghtini);
        System.out.println(teste.length());
        System.out.println(teste.length() +"\n" + teste.length()/2);

        for (int i =0;i <= leghtini;i++){
            teste = teste.substring(1);
            for(int j =0;j < leghtini;j++){
                System.out.print(teste.charAt(j));
            }
            LimparTela();
            Pausa(200);
            System.out.println();

        }

    }

}
