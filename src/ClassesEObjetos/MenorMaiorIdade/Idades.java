package ClassesEObjetos.MenorMaiorIdade;

import java.util.Scanner;

public class Idades {
    public int[] idades;
    public String[] nomes;
    Idades(){
        this.idades = new int[5];
        this.nomes = new String[5];

        int indx = 0;
        do {
            try{
                Scanner ler = new Scanner(System.in);
                String nome ="";
                int idade = 0;

                System.out.println("Digite o nome"+indx);
                nome = ler.nextLine();
                System.out.println("Digite a idade"+indx);
                idade = ler.nextInt();
                if(idade <= 0 || idade > 160){
                    System.out.println("valor invalido");
                }else {
                    this.idades[indx] = idade;
                    this.nomes[indx] = nome;
                    indx++;
                }

            }catch (Exception e){
                System.out.println("valor impossivel");
            }
        }while(indx < 5);
//        this.nomes = nomes;
//        this.idades = idades;
    }
    public void Media(){
        System.out.println("A media de todas as idades da"+((idades[0]+idades[1]+idades[2]+idades[3]+idades[4]) / 5));
    }

    public void Menor() {
        int menor = idades[0];
        int index = 0;
        for(int i=1;i<5;i++){
            if(menor > idades[i]){
                index = i;
            }
        }
        System.out.println("a pessoa mais nova é "+ nomes[index]+"com "+idades[index]+" ano");
    }
    public void Maior() {
        int maior = idades[0];
        int index = 0;
        for(int i=1;i<5;i++){
            if(maior < idades[i]){
                index = i;
            }
        }
        System.out.println("a pessoa mais velha é "+ nomes[index]+" com "+idades[index]+" ano");
    }


}
