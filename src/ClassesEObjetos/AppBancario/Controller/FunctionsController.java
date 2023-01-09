package ClassesEObjetos.AppBancario.Controller;

import ClassesEObjetos.AppBancario.ToDoing;

import java.io.IOException;

public abstract class FunctionsController {
    protected String CentrealizedText(String Text){
        int tamanho = Text.length();
        if(tamanho > 140){
            return Text;
        }
        if(tamanho % 2 == 0){
            int diminutor = tamanho / 2;
            String PlaceHolder="";
            //65
            for(int i =0 ;i < (70 - diminutor);i++){
                PlaceHolder +=" ";
            }
            PlaceHolder = PlaceHolder+ Text;
            for(int i =0 ;i < (70 - diminutor);i++){
                PlaceHolder +=" ";
            }
            return PlaceHolder;
        }else{
            int diminutor = (tamanho+1) / 2;
            String PlaceHolder="";
            //65
            for(int i =0 ;i < (70 - diminutor);i++){
                PlaceHolder +=" ";
            }
            PlaceHolder = PlaceHolder+ Text;
            for(int i =0 ;i < (70 - diminutor);i++){
                PlaceHolder +=" ";
            }
            return PlaceHolder;
        }
    }
    protected void Pausa(long seconds){
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    protected void LimparTela() throws IOException, InterruptedException {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
        long seconds = 2000;
    }
    protected void EmpurraTela(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    protected void Reticencias(long totalTimme,int quantidade){
        for (int i = 0;i< quantidade ;i++)
        {
            System.out.print(".");
            Pausa(totalTimme/quantidade);
        }
    }
    protected void Reticencias(long totalTimme,int quantidade,char charEscolido){
        for (int i = 0;i< quantidade ;i++)
        {
            System.out.print(charEscolido);
            Pausa(totalTimme/quantidade);
        }
    }
    protected void TextoAEsquerda(String[] esolhasPossiveis,int tamanhoTotal){
        for (String esolhasPossivei : esolhasPossiveis) {
            System.out.print(esolhasPossivei);
            for (int j = 0; j < tamanhoTotal - esolhasPossivei.length(); j++) {
                if (j < (tamanhoTotal - 1) - esolhasPossivei.length()) {
                    System.out.print(" ");
                } else {
                    System.out.print("|\n");
                }
            }
        }
    }
    protected void TextoAEsquerda(String texto,int tamanhoTotal){
        System.out.print(texto);
        for (int j = 0; j < tamanhoTotal - texto.length(); j++) {
            if (j < (tamanhoTotal - 1) - texto.length()) {
                System.out.print(" ");
            } else {
                System.out.print("|\n");
            }
        }
    }

}
