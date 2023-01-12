package testes;

public class main {
    public static void main(String[] args) {
        Pessoa pesso = new Pessoa();
        try{
            pesso.setIdade(12);
        }catch (Exception e){
            System.out.println("a");
        }
    }
}
