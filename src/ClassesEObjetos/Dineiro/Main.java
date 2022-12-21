package ClassesEObjetos.Dineiro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta usuarioAtual = PegarDados();
        usuarioAtual.TesteDeSaldo();


    }
    public static Conta PegarDados(){
        Scanner ler = new Scanner(System.in);
        String conta = "";
        float saldo = 0;
        float debito = 0;
        float credito = 0;

        boolean continuar = false;

        do{
            try{
                System.out.println("Digite o numero conta");
                conta = ler.nextLine();
                System.out.println("Digite o saldo ");
                saldo = Float.parseFloat(ler.nextLine());
                System.out.println("Digite seu debito");
                debito = Float.parseFloat(ler.nextLine());
                System.out.println("Digite seu credito atual");
                credito = Float.parseFloat(ler.nextLine());
                continuar = true;
            }catch (Exception e){
                System.out.println("valor impossivel");
            }
        }while (!continuar);
        return new Conta(conta,saldo,debito,credito);
    }


}
