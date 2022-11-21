package exs02;

import java.util.Locale;
import java.util.Scanner;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        String Nome = Nome();
        double Salario = Salario();

        String Idade = Idade(Nome);
        if (Idade.toUpperCase(Locale.ROOT).equals("APROVADO")) {
            double valorSolicitado = solicitarValor();
            int Parcelas = Parcelas();
            realizarCalculoPrincipal(Salario,Parcelas,valorSolicitado);
        } else {
            System.out.printf("vc foi reprovado");
        }
    }

    private static double solicitarValor() {
        Scanner lerS = new Scanner(System.in);
        double quantidade = 0;
        boolean continuar = false;
        do{
            System.out.printf("Digite o valor desejado pedir");

            quantidade = lerS.nextDouble();

            if(quantidade <= 0){
                continuar = false;
            }else {
                continuar = true;
            }
        }while(!continuar);
        return quantidade;
    }

    public static String Nome() {
        Scanner lerN = new Scanner(System.in);
        String Nome;
        boolean continuar;

        do {
            System.out.printf("Ola como se chama?");
            Nome = lerN.nextLine();
            if (Nome.equals("") || Nome.equals(" ")) {
                System.out.println("Digite seu nome por-favor");
                continuar = true;
            } else {
                System.out.printf("Muito prazer " + Nome);
                continuar = false;
            }
        } while (continuar);
        return Nome;

    }
    public static double Salario(){




        Scanner lerS = new Scanner(System.in);
        double Salario = 0;
        boolean continuar = false;

        do{
            System.out.println("Quanto é o seu salario");
            Salario = lerS.nextDouble();
            if(Salario <= 10)
            {
                System.out.printf("Digite um valor valido");
            }else {
                continuar = true;
            }

        }while(!continuar);
        return Salario;
    }

    public static String Idade(String nome) {
        Scanner lerI = new Scanner(System.in);
        int idade = 0;
        System.out.printf("\n Qual seria a sua idade %s \n", nome);
        idade = lerI.nextInt();
        if (idade < 18 || idade > 65) {
            return "Reprovado";
        } else {
            return "Aprovado";
        }
    }

    public static int Parcelas() {
        Scanner lerP = new Scanner(System.in);
        int quantidade;
        boolean continuar;

        do {
            System.out.println("Quantas parcelas serão? (3 / 24)");
            quantidade = lerP.nextInt();
            if (quantidade >= 3 && quantidade <= 24) {
                continuar = true;
            } else {
                continuar = false;
                System.out.println("Digite um valor valido");
            }
        } while (!continuar);

        return quantidade;
    }
    public static void realizarCalculoPrincipal(double salario ,int parcelas,double quantidade){
        double dinheiroMaximo = salario * 0.3;
        double valorparcelas = parcelas / quantidade;
        if(dinheiroMaximo < valorparcelas ){
            System.out.printf("Voce foi negado");
        }else {
            System.out.printf("Aceiito");
        }
    }

}
