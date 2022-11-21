package exs02;

import com.sun.jdi.Value;

import java.util.Random;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random r = new Random();

        double value = 0; // = rng
        double teste = 0;

        System.out.printf("tente adivinhar o valor de 0 a 6");
        teste = ler.nextInt();
        if(teste > 6 || teste < 0){
            System.out.printf("DIGITA CERTO O SACO");
        }else {
            value = r.nextInt(7);
            System.out.printf("\n eu escolhi o " + value +"\n");

            if(value == teste){
                System.out.printf("voce acertou!!!");

            }
            else {
                System.out.printf("voce errou lamento");
            }
        }
    }
}
