package exs01;

public class ex02 {
    public static void main(String[] args)
    {
        int qFileiras = 10;
        int qCdeiras = 8;

        System.out.println("a quantidade possivel de pessoas nessa sala são " + qFileiras * qCdeiras);

        double pessoasComDeficiencia = qFileiras * qCdeiras;
        pessoasComDeficiencia = pessoasComDeficiencia / 100;
        pessoasComDeficiencia = pessoasComDeficiencia * 10;

        System.out.println("e a quantidade de cadeiras resevadas para PCDs " + pessoasComDeficiencia);
    }

}
