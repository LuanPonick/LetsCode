package exs05;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        int mes = 0;
        boolean resposta = false;
        int ano = 0;
        String quantidadeDeDias = "";

        mes = PedirMes();
        ano = PedirAno();

        quantidadeDeDias = Teste(mes,ano);
        System.out.println(quantidadeDeDias);
    }
    public static int PedirMes(){
        int mes = 0;
        boolean resposta = false;
        int ano = 0;
        do{
            System.out.println("Digite um valor de 1 a 12");
            try{
                Scanner ler = new Scanner(System.in);
                mes = ler.nextInt();
                resposta = mes >= 1 && mes <= 12;
//                if(mes >= 1 && mes <= 12){
//                    resposta = true;
//                }else{
//                    resposta = false;
//                }
                System.out.println("Digite o ano");
                ano = ler.nextInt();
            }catch (Exception e){
                System.out.println("Digite um valor valido");
                resposta = false;
            }
        }while(!resposta);
        return mes;
    }
    public static int PedirAno(){
        int mes = 0;
        boolean resposta = false;
        int ano = 0;
        do{
            System.out.println("Digite um valor de 1 a 12");
            try{
                Scanner ler = new Scanner(System.in);
                mes = ler.nextInt();
                resposta = mes >= 1 && mes <= 12;
//                if(mes >= 1 && mes <= 12){
//                    resposta = true;
//                }else{
//                    resposta = false;
//                }
                System.out.println("Digite o ano");
                ano = ler.nextInt();
            }catch (Exception e){
                System.out.println("Digite um valor valido");
                resposta = false;
            }
        }while(!resposta);
        return ano;
    }    public static String Teste(int mes, int ano){
        String quantidadeDeDias = "";
        switch (mes){
            case 1 :
                quantidadeDeDias = "Janeiro(1) tem 31 dias";
                break;
            case 2 :
                if(ano % 4 == 0){
                    quantidadeDeDias = "Fevereiro(2) tem 29 dias";
                }else {
                    quantidadeDeDias = "Fevereiro(2) tem 28 dias";
                }
                break;
            case 3 :
                quantidadeDeDias = "Março(3) tem 31 dias";
                break;
            case 4:
                quantidadeDeDias = "Abril(4) tem 30 dias";
                break;
            case 5 :
                quantidadeDeDias = "Maio(5) tem 31 dias";
                break;
            case 6:
                quantidadeDeDias = "Junho(6) tem 30 dias";
                break;
            case 7 :
                quantidadeDeDias = "Julho(7) tem 30 dias";
                break;
            case 8 :
                quantidadeDeDias = "Agosto(8) tem 30 dias";
                break;
            case 9 :
                quantidadeDeDias = "Setembro(9) tem 31 dias";
                break;
            case 10 :
                quantidadeDeDias = "Outubro(10) tem 30 dias";
                break;
            case 11:
                quantidadeDeDias = "Novenbro(11) tem 30 dias";
                break;
            case 12 :
                quantidadeDeDias = "Dezembro(12) tem 31 dias";
                break;
        }
        return quantidadeDeDias;
    }


}
