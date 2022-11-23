package exs04;

public class ex01 {
    public static void main(String[] args) {
        int maior = Integer.parseInt(args[0]);
        int menor = Integer.parseInt(args[0]);

        for (int i = 0 ;i < args.length;i++){
            int teste = Integer.parseInt(args[i]);
            if(teste >= maior){
                maior = teste;
            }
            if(teste<= menor){
                menor = teste;
            }
        }
        System.out.println(menor +"\n"+ maior);
    }
}
