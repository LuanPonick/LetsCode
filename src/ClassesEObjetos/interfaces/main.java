package ClassesEObjetos.interfaces;

public class main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();
        String nome = "Luan";
        calcularSalarioFuncionario(func1);


    }

    public static void calcularSalarioFuncionario(Funcionario funcionario){
        if(funcionario instanceof InterfaceDAO){
            System.out.println("b");
        }else if(funcionario instanceof InterfaceDAO){
            System.out.println("a");
        }
        else{
            System.out.println("nao foi");
        }
    }
}
