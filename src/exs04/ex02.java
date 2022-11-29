package exs04;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        String TabuleiroDesenho[][];

        Title();
        TabuleiroDesenho = criarTabuleiro();
        Boolean acabar = false;
        do{
            MostrarTabulerio(TabuleiroDesenho);
            //fazer teste de ganhador
            FazerJogadaPlayer1(TabuleiroDesenho);
            System.out.printf("\n\n\n\n\n\n\n");
            MostrarTabulerio(TabuleiroDesenho);
            //teste de ganhador
            FazerJogadaPlayer2(TabuleiroDesenho);
        }while(!acabar);


    }
    private static String[][] FazerJogadaPlayer1(String Tabuleiro[][]) {
        Scanner lerJ = new Scanner(System.in);

        boolean continuar = false;


        do{
            String Jogada;

                System.out.println("\nDigite a cordenada letra e ao lado a cordenada numero EX( A1 )");
                System.out.println("Jogador 1(x) digite a posição.");

                Jogada = lerJ.nextLine().toUpperCase().trim().replaceAll("\\s+","");
                continuar = TestarJogada(Tabuleiro,Jogada);
                if(!continuar){
                    System.out.println("Valor impossivel!!!\nTente outro valor");
                    MostrarTabulerio(Tabuleiro);
                }else {
                    Tabuleiro = SalvarJogada(Tabuleiro,Jogada,"X");

                }
          }while(!continuar);

        return Tabuleiro;
    }
    private static String[][] FazerJogadaPlayer2(String Tabuleiro[][]) {
        Scanner lerJ = new Scanner(System.in);

        boolean continuar = false;


        do{
            String Jogada;

            System.out.println("\nDigite a cordenada letra e ao lado a cordenada numero EX( A1 )");
            System.out.println("Jogador 2(O) digite a posição.");

            Jogada = lerJ.nextLine().toUpperCase().trim().replaceAll("\\s+","");
            continuar = TestarJogada(Tabuleiro,Jogada);
            if(!continuar){
                System.out.println("Valor impossivel!!!\nTente outro valor");
                MostrarTabulerio(Tabuleiro);
            }else {
                Tabuleiro = SalvarJogada(Tabuleiro,Jogada,"O");
            }
        }while(!continuar);

        return Tabuleiro;
    }
    private static String[][] SalvarJogada(String[][] Tabulerio,String Jogada, String MarkerPlayer) {

        int X = 0;
        int Y = 0;

        if(Jogada.charAt(0) == 'A'){
            X = 1;
        } else if (Jogada.charAt(0) == 'B') {
            X = 2;
        } else if (Jogada.charAt(0) == 'C') {
            X = 3;
        }

        Y = Character.getNumericValue(Jogada.charAt(1));

        Tabulerio[Y][X] = "| "+MarkerPlayer+" |";

        return Tabulerio;
    }

    private static boolean TestarJogada(String[][] Tabuleiro, String Cordenada) {
        return switch (Cordenada) {
            case "A1" -> Tabuleiro[1][1].equals("| ✤ |");
            case "A2" -> Tabuleiro[2][1].equals("| ✤ |");
            case "A3" -> Tabuleiro[3][1].equals("| ✤ |");
            case "B1" -> Tabuleiro[1][2].equals("| ✤ |");
            case "B2" -> Tabuleiro[2][2].equals("| ✤ |");
            case "B3" -> Tabuleiro[3][2].equals("| ✤ |");
            case "C1" -> Tabuleiro[1][3].equals("| ✤ |");
            case "C2" -> Tabuleiro[2][3].equals("| ✤ |");
            case "C3" -> Tabuleiro[3][3].equals("| ✤ |");
            default -> false;
        };
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

    private static void MostrarTabulerio(String [][] tabulerio) {
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









    private static void Title() {
        System.out.println("#################################"+
                "\n O MELHOR JOGO DA VELHO DO ANO" +
                "\n#################################");

    }
}
