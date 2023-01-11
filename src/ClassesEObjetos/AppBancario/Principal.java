package ClassesEObjetos.AppBancario;

import ClassesEObjetos.AppBancario.Controller.MainController;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        MainController mainController = new MainController();
        Scanner ler = new Scanner(System.in);
        do {
            mainController.RodarEstado();
        }while(mainController.getAplicationState() != ToDoing.Exit);
    }
}
