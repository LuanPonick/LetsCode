package ClassesEObjetos.Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean continuar = false;
        Calculadora calculadora1 = new Calculadora();
        Scanner ler;

        do {
            ler = new Scanner(System.in);

            MostrarLog();
            MostrarConta(calculadora1);
            String resp = ler.next();
            String Teste = FazerTeste(resp, calculadora1);

            continuar = Teste.equals("SAIR");

        }while(!continuar);
    }
    public static void MostrarLog(){
        System.out.println("-----------------------");
        System.out.println("[1] Trocar valor 1-----");
        System.out.println("[2] Trocar valor 2-----");
        System.out.println("[3] Trocar operador----");
        System.out.println("[4] Fazer calculo------");
        System.out.println("[5] Criar calculadora--");
        System.out.println("[6] Listar Calculadoras");
        System.out.println("[7] Remover Calc-------");
        System.out.println("[8] Sair do programa---");
        System.out.println("-----------------------");
    }
    public static String FazerTeste(String Resposta, Calculadora calc) {
         switch (Resposta) {
             case "1":
                 try{
                     Scanner ler = new Scanner(System.in);
                     System.out.println("Digite um valor");
                     calc.num1 = ler.nextInt();
                 }catch (Exception e){
                     System.out.println("valor invalido");
                 }
                 break;
             case "2" :
                 try{
                     Scanner ler = new Scanner(System.in);
                     System.out.println("Digite um valor");
                     calc.num2 = ler.nextInt();
                 }catch (Exception e){
                     System.out.println("valor invalido");
                 }
                 break;

             case "3":
                 try{
                     Scanner ler = new Scanner(System.in);
                     String escolha = "";

                     System.out.println("escolha um operador");
                     System.out.println("[1] -");
                     System.out.println("[2] +");
                     System.out.println("[3] *");
                     System.out.println("[4] /");
                     escolha = ler.nextLine();

                     switch (escolha) {
                         case "1" -> calc.op = "-";
                         case "2" -> calc.op = "+";
                         case "3" -> calc.op = "*";
                         case "4" -> calc.op = "/";
                         default -> System.out.println("valor invalido");
                     }
                 }catch (Exception e){
                     System.out.println("valor invalido");
                 }
                break;
             case "4":
                 calc.fazerCalculo();
                 calc.MostrarResultado();
                 break;
             case"5":

                 break;

             case "8":
                 return "SAIR";

             default:
                 return "ERRO";
        };
        return Resposta;
    }
    public static void MostrarConta(Calculadora calc){
        System.out.println(calc.num1 + " " + calc.op + " " + calc.num2);
        System.out.println("-------------------");
    }
}
