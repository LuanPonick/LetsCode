package exs03;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) throws IOException, InterruptedException {

        Random rng = new Random();

        int valor = 0;
        boolean continuar = false;
        int vezes = 1;

        System.out.println("informe um numero de 1 a 6");
        do {
            try{
                Scanner ler = new Scanner(System.in);
                valor = ler.nextInt();
                if(valor > 6 || valor <= 0){
                    System.out.println("digite um valor valido ");
                }else {
                    continuar = true;
                }
            }catch (Exception e){
                System.out.println("informe um NUMERO de 1 a 6");
            }
        }while (!continuar);
        int teste;
        do{
            teste = rng.nextInt(6) + 1;
            if(valor == teste){
                System.out.println("eu precisei rodar meu teste "+vezes);
            }else {
                vezes++;
            }
        }while (teste != valor);
    }
}
