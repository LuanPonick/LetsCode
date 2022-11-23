package exs03;

import java.util.Random;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random r = new Random();
        int soma = 0;
        int testes= 0;
        System.out.println("Digite um valor ");
        try{
            testes = ler.nextInt();
        }catch (Exception e){
            System.out.println("DIGITE UM NUMERO");
            return; //isso vai fechar o programa NAO IMPORTA O QUE ELE É.
        }
        while (testes > 0){
            int valor = r.nextInt(7)+1;
            System.out.println("o valor deu " + valor);
            soma += valor;
            testes--;
        }
        System.out.println(soma);

    }
}
