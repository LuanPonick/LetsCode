package exs03;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um valor");
        int valor = ler.nextInt();

        for(int i =1;i <= valor; i++){
            System.out.print(i + "-");

            for (int ia =1;ia<=i ;ia++){
                System.out.print("#");
            }

            System.out.println("");
    }
    }
}
