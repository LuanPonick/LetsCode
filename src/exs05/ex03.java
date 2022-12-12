package exs05;

public class ex03 {
    public static void main(String[] args) {
        String nomes[] = new String[5];
        int idades[] = new int[5];
        int testeMaior = 0;
        int testeMenor = 0;

        idades = preguca1(idades);
        nomes = preguca2(nomes);

        for(int i = 0 ; i < idades.length ; i++){
            if(idades[i] > idades[testeMaior]){
                testeMaior = i;
            }
            if(idades[i] < idades[testeMenor]){
                testeMenor = i;
            }
        }

        System.out.println("a pessoa mais velha é a "+nomes[testeMaior]);
        System.out.println("a pessoa mais nova é a "+nomes[testeMenor]);
    }
    public static int[] preguca1(int idades[]){
        idades[0] = 12;
        idades[1] = 32;
        idades[2] = 50;
        idades[3] = 20;
        idades[4] = 12;
        return idades;
    }
    public static String[] preguca2(String nomes[]){
        nomes[0] = "luna";
        nomes[1] = "lara";
        nomes[2] = "micael";
        nomes[3] = "joao";
        nomes[4] = "carlos";
        return nomes;
    }

}
