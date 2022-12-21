package ClassesEObjetos.Biblioteca;

import java.util.Scanner;
public abstract class Livro {
    public String nome;
    public String autor;

    Scanner input = new Scanner(System.in);
    public void entradaDados(){
        System.out.println("Informe o nome do livro: ");
        nome = input.nextLine();
        System.out.println("Informe o autor do livro: ");
        autor = input.nextLine();
    }

    @Override
    public String toString() {
        System.out.println("Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", input=" + input +
                '}');
        return null;
    }
}
