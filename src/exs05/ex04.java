package exs05;

public class ex04 {
    public static void main(String[] args) {
        String[] nomes = {"João", "Pedro", "Carlos", "Maitê", "Sara"};
        int[] pesos = {88, 23, 41, 49, 67};
        double[] alturas = {1.90,1.70,1.40,1.20,1.60};
        double imcs[] = new double[5];

        fazerCalculo(imcs,pesos,alturas);
        mostrarPessoasSobrePeso(imcs,nomes);
    }
    public static double[] fazerCalculo(double[] imcs,int[] pesos,double[] alturas)
    {
        for(int i = 0; i < imcs.length;i++){
            imcs[i] = ( pesos[i] / Math.pow(alturas[i],2));
        }
        return imcs;
    }
    public static double[] mostrarPessoasSobrePeso(double imcs[], String nomes[]){
        for (int i = 0 ; i< imcs.length ; i++){
            if(imcs[i] < 18.5 || imcs[i]>24.9){
                System.out.println(nomes[i] +" Esta fora do peso");
            }
        }
        return imcs;
    }


}
