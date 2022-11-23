package exs04;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        String tabuleiroDesenho[][] = new String[3][3];

        title();
        tabuleiroDesenho = criarTabuleiro();
        mostrarTabulerio(tabuleiroDesenho);
        jogada();


    }

    private static void jogada() {
        Scanner lerJ = new Scanner(System.in);
        String jogador1;
        String jogador2;

        double continuar = false;

        do{
            System.out.println("\nDigite a cordenada letra e ao lado a cordenada numero EX( A1 )");
            System.out.println("Jogador 1(x) digite a posição.");
            jogador1 = lerJ.next();
        }while();

    }

    private static void title() {
        System.out.println("#################################"+
                "\n O MELHOR JOGO DA VELHO DO ANO" +
                    "\n#################################");

    }

    private static String[][] criarTabuleiro() {
        String temp [][] = new String[4][4];
        for(int i = 0; i <= 16; i++){
            if(i == 0){
                temp[0][0] = "_|";
            } else if (i == 1) {
                temp[0][1] = " A ||";
            } else if(i == 2){
                temp[0][2] = " B ||";
            }else if(i == 3){
                temp[0][3] = " C  |";
            }else if(i == 4){
                temp[1][0] = "1";
            }else if(i == 5){
                temp[1][1] = "| ✤ |" ;
            }else if(i == 6){
                temp[1][2] = "| ✤ |";
            } else if(i == 7) {
                temp[1][3]= "| ✤ |";
            }else if(i == 8){
                temp[2][0] = "2";
            }else if(i == 9){
                temp[2][1] = "| ✤ |" ;
            }else if(i == 10){
                temp[2][2] = "| ✤ |";
            } else if (i==11) {
                temp[2][3]= "| ✤ |";
            }else if(i == 12){
                temp[3][0] = "3";
            }else if(i == 13){
                temp[3][1] = "| ✤ |" ;
            }else if(i == 14){
                temp[3][2] = "| ✤ |";
            } else if (i==15) {
                temp[3][3]= "| ✤ |";
            }


        }
        return temp;
    }

    private static void mostrarTabulerio(String [][] tabulerio) {
        final String space ="   ";
        for(int i = 0; i < 16; i++){

            if(i <= 3){
                System.out.print(tabulerio[0][i]);
            } else if (i <= 7) {
                System.out.print(tabulerio[1][i-4]);
            } else if (i <= 11) {
                System.out.print(tabulerio[2][i-8]);
            }else {
                System.out.print(tabulerio[3][i-12]);
            }

            if(i == 3){
                System.out.println();
            } else if (i == 7) {
                System.out.println();
            } else if (i == 11) {
                System.out.println();
            }
        }
    }

}
