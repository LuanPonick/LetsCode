package ClassesEObjetos.Calculadora;

import java.util.Scanner;

public class Calculadora {
    int num1=0;
    int num2=0;
    String op = "+";
    double result = 0;
    public double fazerCalculo(){
        if(op.equals("*")||op.equals("-")||op.equals("+")||op.equals("/")){
            if(op.equals("*")){
                result = num1 * num2;
            }else if (op.equals("-")){
                result = num1 - num2;
            } else if (op.equals("+")) {
                result = num1 + num2;
            } else if (op.equals("/")) {
                result = num1 / num2;
            }else {
                System.out.println("impossivel calcular");
            }
        }else {
            System.out.println("Impossivel fazer o calculo!!");
        }
        return 0;
    }
    public void MostrarResultado(){
        Scanner c = new Scanner(System.in);
        System.out.println(result);
        System.out.println("----------");
        System.out.println("aperte enter para continuar");
        c.nextLine();

    }

}
