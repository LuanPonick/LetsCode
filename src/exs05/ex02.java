package exs05;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        int numero = PegarDados();

        System.out.println("Digite um numero");
        for(int i = 0; i <= 10; i++){
            System.out.println(numero + " x " + i +" = " + numero * i);
        }
    }
    public static int PegarDados(){
        boolean correto = false;
        int numero = 0;
        do{
            try{
                Scanner ler = new Scanner(System.in);
                numero = ler.nextInt();
                correto = true;
            }catch (Exception e){
                System.out.println("Valor invalido");
            }
        }while(!correto);

        return numero;
    }

}
