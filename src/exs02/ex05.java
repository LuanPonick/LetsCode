package exs02;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double salario= 0;

        System.out.printf("calculo de inss");
        System.out.printf("Digite seu salario");

        salario = ler.nextDouble();
        double valorINSS = calculoINSS(salario);

        System.out.printf("seu salario de "+salario+ "voce tera que pagar um inss de" +
                valorINSS);


    }

    private static Double calculoINSS(double salario) {
        if(salario <= 1212.00){
           return salario * 0.075;
        } else if (salario <= 2427.35) {
            return 90.90 + ((salario - 1212.00) * 0.09);
        } else if (salario <= 3641.03) {
            return 90.90 + 109.38 + ((salario - 2427.35) * 0.12);
        } else if(salario <= 7087.22){
            return 90.90 + 109.38 + 145.64 + ((salario - 3641.03) * 0.14);
        }
        return 828.38;
    }
}
