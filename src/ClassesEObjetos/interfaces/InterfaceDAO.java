package ClassesEObjetos.interfaces;
//dizer que é uma interface
//so pode conter as assinaturas dos metodos sem corpo
//nao pode ser instanciada

public interface InterfaceDAO {
    public void criar();
    public void salvar(String b);
    public void deletar(int id);
    public void atualizar (int id);
}
