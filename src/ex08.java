public class ex08 {
    public static void main(String[] args)
    {
        double nota1=4,nota2=10,nota3=5,nota4=6,media=0;

        media = (nota1 + nota2 + nota3 +nota4) / 4;
        System.out.printf("Nota 1: %d Nota 2: %d Nota 3: %d Nota 4: %d ",nota1,nota2,nota3,nota4);

        if(media < 6){
            System.out.println("o burro reprovou");
        }else {
            System.out.println("O aluno passou");
        }

    }

}
