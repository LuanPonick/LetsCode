package exs01;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite Largura ");
        double largura = ler.nextDouble();
        System.out.print("Digite comprimento ");
        double comprimento = ler.nextDouble();
        System.out.print("Digite profundidade inicial ");
        double profundidadeI = ler.nextDouble();
        System.out.print("Digite profundidade final ");
        double profundidadeF = ler.nextDouble();

        double calc = (profundidadeI * profundidadeF) / 2;
        calc = calc * largura * comprimento * 1000;

        System.out.print(calc);

    }

}
