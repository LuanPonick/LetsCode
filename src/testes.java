import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class testes {
    public static void main(String[] args) {
        boolean continuar = false;

        do{
            Scanner ler = new Scanner(System.in);
            String teste = "";
            Intens intens[] = new Intens[1];

            System.out.println("[1] add");
            System.out.println("[2] list");
            System.out.println("[3] exit");
            teste = ler.nextLine();

            if(teste.equals("1")){
                Create(intens);
            } else if (teste.equals("2")) {
                List();
            } else if (teste.equals("3")) {
                System.out.println("by");
                continuar = true;
            }else {
                System.out.println("error");
            }
        }while(!continuar);




        //        int valor = 0;
//        boolean continuar;
//        do {
//            continuar = false;
//            try {
//                Scanner ler = new Scanner(System.in);
//                System.out.println("digite um NUMERO");
//                valor = ler.nextInt();
//                continuar = true;
//            } catch (Exception e) {
//                continuar = false;
//            }
//        } while (!continuar);


        //timmer estudo de timmer
        //Timmer(2000);
    }

    static Intens[] Create(Intens[] iten){
        int num = iten.length + 1;
        iten[num] = new Intens();
        return iten;
    }
    static void List(){

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
