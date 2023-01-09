package ClassesEObjetos.AppBancario.Controller;

import ClassesEObjetos.AppBancario.ASCC;

import java.util.Scanner;

public class TipoDoClienteController extends FunctionsController{
    private final ASCCController asccController = new ASCCController();

    public int TipoDeCliente(){
        boolean terminar = true;
        do{
            Scanner ler =  new Scanner(System.in);
            asccController.ShowTitleOffAnim();
            System.out.println(CentrealizedText("_Dentre os piores o melhor banco_\n\n"));
            System.out.println(CentrealizedText("Seje bem vindo ao nosso banco\n"));
            System.out.println(CentrealizedText("Digite [0] para Cancelar/Sair"));
            System.out.println(CentrealizedText("Digite [1] para Pessoa"));
            System.out.println(CentrealizedText("Digite [2] para Empresa"));
            try{
                return ler.nextInt();
            }catch (Exception e){
                EmpurraTela();
                System.out.print("valor impossivel");
                for(int i = 0 ;i <= 3;i++){
                    Pausa(666);
                    System.out.print(".");
                }
                System.out.println();
                EmpurraTela();
            }
        }while (terminar);
        return 0;
    }
}
