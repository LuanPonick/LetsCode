package ClassesEObjetos.AppBancario.Controller;

import java.util.Scanner;

public class LoginController extends FunctionsController{
    private MainController mainController;
    private final ASCCController asccController = new ASCCController();
    public String[] LoginCliente(boolean IsCPF){
        enum UsuarioEstaDigitando{
            //esse é o estado do usuario APENAS NESSA FUNÇÃO
            nome,
            cpfOrPJ,
            senha,
            completo,
            sair
        };
        Scanner ler = new Scanner(System.in);
        String valorDigitado = "";
        String error = "\\\\\\\\////";
        String cpf = "";
        String nome = "";
        String senha = "";
        UsuarioEstaDigitando Estado = UsuarioEstaDigitando.cpfOrPJ;
        boolean continuar;

        do{
            //pega os dados do usurio de cpf nome e senha de uma forga bonita e mais interativa;
            EmpurraTela();
            asccController.ShowTitleOffAnim();
            Pausa(400);
            System.out.println();
            Pausa(100);
            System.out.println(CentrealizedText("Você escolheu a opção de logar como pessoa"));
            Pausa(200);
            System.out.println();
            Pausa(100);
            if(Estado == UsuarioEstaDigitando.cpfOrPJ){
                if(IsCPF){
                    System.out.println(CentrealizedText("Digite seu CPF"));
                }else{
                    System.out.println(CentrealizedText("Digite seu CNPJ"));
                }
            }else if(Estado == UsuarioEstaDigitando.nome){
                System.out.println(CentrealizedText("Favor Digite seu Nome Completo"));
            }else if (Estado == UsuarioEstaDigitando.senha){
                System.out.println(CentrealizedText("Favor Digite sua senha"));
            }

            Pausa(200);
            System.out.println(CentrealizedText(error));
            System.out.println(CentrealizedText("Ou Digite 0 para voltar a tela de escolha de login"));
            Pausa(200);
            //ve qual valor tem que ser pedido ao usuario
            if(Estado == UsuarioEstaDigitando.cpfOrPJ)
            {
                String texto;
                if(IsCPF){
                    texto = "Digite seu CPF : ";
                }else{
                    texto = "Digite seu CNPJ : ";
                }
                for(int i = 0;i<texto.length();i++)
                {
                    Pausa(90);
                    System.out.print(texto.charAt(i));
                }
            }
            else if(Estado == UsuarioEstaDigitando.nome)
            {
                String texto ="Digite seu nome : ";
                for(int i = 0;i<texto.length();i++)
                {
                    Pausa(90);
                    System.out.print(texto.charAt(i));
                }
            }
            else if (Estado == UsuarioEstaDigitando.senha) {
                String texto ="Digite sua senha : ";
                for(int i = 0;i<texto.length();i++)
                {
                    Pausa(90);
                    System.out.print(texto.charAt(i));
                }
            }
            //fara o teste para ver se o que o usuario digitou esta correto com que valor ele espera receber
            Boolean podeSalvar = true;
            String segurador = ler.nextLine();
            if(Estado != UsuarioEstaDigitando.cpfOrPJ){
                for(int i = 0;i < segurador.length() && podeSalvar;i++){
                    switch (segurador.charAt(i)) {
                        case '0','1', '2', '3', '4', '5', '6', '7', '8', '9' -> podeSalvar = false;
                    }
                }
            }else{
                if(IsCPF &&
                    segurador.length() != 11){
                    podeSalvar = false;
                }else if(!IsCPF &&
                    segurador.length() != 14) {
                    podeSalvar = false;
                }
            }
            if(segurador.equals("0")){
                Estado = UsuarioEstaDigitando.sair;
            }
            if(podeSalvar)
            {
                if(Estado == UsuarioEstaDigitando.cpfOrPJ)
                {
                    Estado = UsuarioEstaDigitando.nome;
                    error = "\\\\\\\\////";
                    cpf = segurador;
                }
                else if(Estado == UsuarioEstaDigitando.nome)
                {
                    Estado = UsuarioEstaDigitando.senha;
                    error = "\\\\\\\\////";
                    nome = segurador;
                }
                else if(Estado == UsuarioEstaDigitando.senha)
                {
                    Estado = UsuarioEstaDigitando.completo;
                    error = "\\\\\\\\////";
                    senha = segurador;
                }
            }
            //caso o usuario digitou um valor inesperado no cpf tem que ser um texto diferente
            else if(Estado == UsuarioEstaDigitando.cpfOrPJ)
            {
                if(IsCPF){
                    error = "Digite um CPF valido com 11 numeros APENAS NUMEROS";
                }else{
                    error = "Digite um CNPJ valido com 14 numeros APENAS NUMEROS";
                }

            }else{
                error = "Lembrando que tanto seu nome e sua senha nao podem possuir numeros!!!";
            }
            continuar = Estado == UsuarioEstaDigitando.sair ||
                    Estado == UsuarioEstaDigitando.completo;
        }while (!continuar);

        if(Estado == UsuarioEstaDigitando.completo){
            return new String[]{cpf, nome, senha, "Hoje"};
        }else {
            return null;
        }

    }
}
