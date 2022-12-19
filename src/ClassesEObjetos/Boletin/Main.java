package ClassesEObjetos.Boletin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean Continuar = false;
        Aluno aluno;
        Notas notas = Notas.Matematica;
        do {
            Scanner ler = new Scanner(System.in);

            System.out.println("Digite o nome do aluno");
            String nome = ler.nextLine();

            aluno = new Aluno(nome);
            Continuar = true;
        }while(!Continuar);
        Continuar = false;
        do {
            MostrarAsNotas(aluno);

            Scanner ler = new Scanner(System.in);
            System.out.println("[0] sair do programa");
            System.out.println("[1] trocar uma linha de notas");
            System.out.println("[2] trocar uma nota");
            Continuar=Escolha(ler.nextLine(),aluno);
        }while(!Continuar);
    }

    private static boolean Escolha(String valorEscolido, Aluno aluno) {
        if ("0".equals(valorEscolido)) {
            return true;
        } else if ("1".equals(valorEscolido)) {
            TrocarValor(true,aluno);
            return false;
        } else if ("2".equals(valorEscolido)) {
            return false;
        } else {
            System.out.println("valor impossivel");
        }
        return false;
    }
    private static void TrocarValor(boolean IsLinha,Aluno alun){
        if (IsLinha){
            boolean Continuar = false;
            int ValorEscolido = 0;
            do {
                MostrarAsNotas(alun);
                Scanner ler = new Scanner(System.in);
                System.out.println("Qual materia deseja alterar \n Ex(0) == Matematica");
                try{
                    ValorEscolido = Integer.parseInt(ler.nextLine());
                    Continuar = true;
                }catch (Exception er){
                    System.out.println("Valor impossivel");
                }
            }while(!Continuar);
            int Atual = 0;
            do{
                try {
                    System.out.println("\n\n\n\n\n");
                    MostrarAsNotas(alun);
                    System.out.println("Digite a nota "+ (Atual + 1) );
                    Scanner valor = new Scanner(System.in);
                    double valorE = valor.nextDouble();
                    if(valorE > 10 || valorE < 0){
                        System.out.println("valor invalido");
                    }else {
                        alun.Notas[Atual][ValorEscolido] = valorE;
                        Atual ++;
                    }
                }
                catch (Exception e){
                    System.out.println("Algum erro");
                }
            }while(Atual < 3);
        }else {

        }
    }
    private static void MostrarAsNotas(Aluno aluno) {
        System.out.println(aluno.Nome);
        Notas[] notasName =Notas.values();
        for(int i = 0; i < 12;i++){
            StringBuilder m = new StringBuilder(notasName[i].toString());
            while(m.length() < 14){
                m.append(" ");
            }
            m.append(" ");
            System.out.print(m);
            for(int j = 0 ;j < 3; j++){
                System.out.print(aluno.Notas[j][i]+" | ");
            }
            System.out.println(aluno.Final(i) + " | P"+ i);

        }
    }

}
