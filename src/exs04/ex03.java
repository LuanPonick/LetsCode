package exs04;

import java.util.Random;

public class ex03 {
    public static void main(String[] args)
    {
        String TextoCNomes ="";
        Boolean continuar = false;
        int[] numero= new int[3];
        Random rng = new Random();

        for(int i=0 ; i< args.length; i++){
            TextoCNomes = TextoCNomes +" "+ args[i];
        }
        System.out.println("nomes informados"+TextoCNomes);
        numero[0] = rng.nextInt(args.length);
        do{
            Random rng2 = new Random();
            numero[1] = rng2.nextInt(args.length);
        }while(numero[1] == numero[0]);
        do {
            Random rng3 = new Random();
            numero[2] = rng3.nextInt(args.length);

        }while(numero[2] == numero[0] || numero[2] == numero[1]);
        System.out.println("grupo 1: \n"+args[numero[0]]+"\n"+args[numero[1]]+"\n"+args[numero[2]]+" ");
        System.out.println("grupo 2: ");
        for(int i = 0; i < args.length;i++){
            if(args[numero[0]].equals(args[i]) ||args[numero[1]].equals(args[i]) ||args[numero[2]].equals(args[i])){

            }else {
                System.out.println(args[i]);
            }


        }

    }
}
