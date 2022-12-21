package ClassesEObjetos.Geometria;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Geometria g = new Geometria();

        System.out.println("Informe o valor do raio: ");
        double r = input.nextDouble();
        System.out.println("Area calcular: " + g.calcular(r));

        System.out.println("informe os dois lados do rertangulo");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println("Area calcular: " + g.calcular(a,b));
    }
}
