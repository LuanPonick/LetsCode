import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class testes {
    public static void main(String[] args) {
        int valor = 0;
        boolean continuar;
        do {
            continuar = false;
            try {
                Scanner ler = new Scanner(System.in);
                System.out.println("digite um NUMERO");
                valor = ler.nextInt();
                continuar = true;
            } catch (Exception e) {
                continuar = false;
            }
        } while (!continuar);


        //timmer estudo de timmer
        //Timmer(2000);
    }
    static void Timmer(long seconds){
        System.out.println("hello world");
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("hello world");
    }
}
