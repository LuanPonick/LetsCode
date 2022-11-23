package exs03;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String palavra;
        String escolha;
        char[] letra = new char[1];
        int vezes = 0;

        System.out.println("digite uma palavra");
        palavra = ler.nextLine();
        System.out.println("Digite uma letra");
        escolha = ler.nextLine();
        if(escolha.length() > 1){
            System.out.println("n");
        }else {
            letra = escolha.toCharArray();
        }

        for(int i=0;i < palavra.length();i++ ){
            char teste = palavra.charAt(i);
            if(teste == letra[0]){
                vezes++;
            }
        }

        System.out.println("na palavra"+palavra+"a letra "+letra[0]+"aparece "+vezes);



    }
}
