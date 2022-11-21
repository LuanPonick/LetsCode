package exs02;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
        Scanner ler1 = new Scanner(System.in);
        Scanner ler2 = new Scanner(System.in);
        double valor = 0;

        Boolean continuar = true;
        String teste="";
        do
        {
            System.out.printf("Digite o valor que deseja converter");
            valor = ler1.nextDouble();
            System.out.printf("Digite F para converter para fire e C para celsus");
            teste = ler2.nextLine();
            teste = teste.toUpperCase(Locale.ROOT);
            if(teste.equals("F")){
                fazConversaoFC(valor);
                continuar = finalizar();
            } else if (teste.equals("C")) {
                fazConversaoCF(valor);
                continuar = finalizar();
            }else {
                System.out.println("DIGITA DIREITO SEU ANIMAL");
            }
        }while(continuar);
    }
    public static void fazConversaoFC(double F){
        double tempF = F;
        double tempC = (tempF -32 * 5 / 9);

        System.out.printf("O valor digitado de %f em celcu é %f ", tempF , tempC);
    }
    public static void fazConversaoCF(double C){
        double tempC  = C;
        double tempF = (tempC * 9/5)+32;

        System.out.printf("O valor digitado de %f em celcu é %f ", tempC , tempF);
    }
    public static Boolean finalizar() {

        Scanner lerf3 = new Scanner(System.in);
        System.out.printf("Deseja fazer outra conta?(S/N)");
        String continuar = lerf3.nextLine().toUpperCase();

        if (continuar.equals("S")) {
            return true;
        } else {
            return false;
        }
    }
}
