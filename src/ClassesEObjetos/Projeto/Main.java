package ClassesEObjetos.Projeto;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        Date d1 = new Date(2323223232L);
//        int Calc = 2000 - 1900;

//            Date d2 = new Date(Calc,0,31);
//        d2.setTime(new Date().getTime());
//
//        System.out.println(d1);
//        System.out.println(d2);
        final int Salario = 2000;

        Empregado pessoa1 = new Empregado("Luan","(99)9 9999-9999",Salario);
        System.out.println(pessoa1.toString());
        System.out.println("salario " + pessoa1.CalcSalario() +"\n\n ################ \n\n");

        Desenvolvedor pessoa2 = new Desenvolvedor("micael","(99)9 9999-9999",Salario);
        pessoa2.setHoras(19);
        System.out.println(pessoa2.toString());
        System.out.println("salario " + pessoa2.CalcSalario());

        Gerente pessoa3 = new Gerente("micael","(99)9 9999-9999",Salario);
        pessoa3.setHoras(30);
        pessoa3.setDias(30);
        System.out.println(pessoa3.toString());
        System.out.println("salario " + pessoa3.CalcSalario());
    }
}
