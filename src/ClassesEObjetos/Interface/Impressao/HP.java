package ClassesEObjetos.Interface.Impressao;

public class HP implements Impressoara{
    @Override
    public void imprimir(Imprimivel imprimivel) {
        System.out.println("******************");
        System.out.println("  nota fiscal ");
        System.out.println(imprimivel.getCabecalhoNF());
        System.out.println(imprimivel.getCorpoNF());
        System.out.println("impresso na hp");
    }
}
