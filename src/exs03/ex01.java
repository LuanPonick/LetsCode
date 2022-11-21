package exs03;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int valor;

        System.out.printf("Usuario digite um numero");
        valor = ler.nextInt();

        for(int i=1; i < valor;i = i + 2){
            System.out.println(i);
        }



    }
}
