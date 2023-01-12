package testes;

public class Pessoa{
    private int idade = 0;

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) throws Exception{
        validateIdade(idade);
        this.idade = idade;
    }
    private void validateIdade(int idade){
        if(idade <= 0){
            throw new RuntimeException("Idade invalida");
        }

    }
}
