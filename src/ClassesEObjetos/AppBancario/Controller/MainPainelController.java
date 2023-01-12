package ClassesEObjetos.AppBancario.Controller;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MainPainelController extends FunctionsController{
//    public static void main(String[] args) {
//        MainPainelController a = new MainPainelController();
//        a.ComecarOPrograma("Luan DaviDaviDaviDaviDavi Ponick" , 0,"CPF");
//    }
    private Boolean Investimeto = false;
    private String Nome;
    private double Dinheiro;
    private String TipoCliente;
    private enum EstadoAtual{
        OnExit,
        OnMostrandoInterfaceBody,
        OnBody,
        OnMostrandoInterfaceInvestimento,
        OnInvestir,
        OnSacar,
        OnTransferir,
        OnDepositar

    };
    private EstadoAtual estadoAtual = EstadoAtual.OnMostrandoInterfaceBody;

    public void ComecarOPrograma(String nome, double dinheiro,String tipoCliente){
        this.Nome = nome;
        this.Dinheiro = dinheiro;
        this.TipoCliente = tipoCliente;
        do{
            RealizarAcoes();
        }while (estadoAtual != EstadoAtual.OnExit);
    }
    private void EscolhaDoUsuarioOnBody(){
        boolean Correto = false;
        do{
            try{
                Scanner ler = new Scanner(System.in);
                int esc = ler.nextInt();
                switch (esc){
                    case 0 -> {
                        estadoAtual = EstadoAtual.OnExit;
                        Correto = true;
                    }
                    case 1 ->{
                        estadoAtual = EstadoAtual.OnSacar;
                        Correto = true;
                    }
                    case 2 ->{
                        estadoAtual = EstadoAtual.OnDepositar;
                        Correto = true;
                    }
                    case 3 -> {
                        estadoAtual = EstadoAtual.OnTransferir;
                        Correto = true;
                    }
                    case 4 ->{
                        estadoAtual = EstadoAtual.OnMostrandoInterfaceInvestimento;
                        Correto = true;
                    }
                    default -> {
                        estadoAtual = EstadoAtual.OnMostrandoInterfaceBody;
                        System.out.print("Favor digitar um valor existente");
                        Reticencias(2000,5);
                        EmpurraTela();
                        Correto = true;
                    }
                }
            }catch (Exception e){
                EmpurraTela();
                System.out.println("valor apenas digitar numeros!!!");
                estadoAtual = EstadoAtual.OnMostrandoInterfaceBody;
                Correto = true;
            }
        }while (!Correto);
        RealizarAcoes();
    };
    private void RealizarAcoes(){
        switch (estadoAtual){
            case OnMostrandoInterfaceBody -> {
                InterfaceDeUsuario();
            }
            case OnDepositar ->{
                Depositar();
            }
            case OnBody -> {
                EscolhaDoUsuarioOnBody();
            }
            case OnSacar -> {
                Sacar();
            }
            case OnTransferir -> {
                Transferir();
            }

            case OnMostrandoInterfaceInvestimento -> {
                InterfaceDeInvestimento();
            }
            case OnInvestir -> {
                EscolhaDoUsuarioOnInvestimento();
            }
        }
    }
    private void Transferir(){
        boolean Continuar = false;
        do{
            Scanner ler = new Scanner(System.in);
            String CpfCnpj = "";

            EmpurraTela();
            LinhaVazia('-',140);
            System.out.println(CentrealizedText("Digite o cpf ou cnpj da conta que vc deseja transferir"));
            ColunaVazia('|',140);
            System.out.println(CentrealizedText("Lembrando que caso queira cancelar apenas digite 0"));
            CpfCnpj = ler.next();
            if(CpfCnpj.equals("0")){
                Continuar = true;
                estadoAtual = EstadoAtual.OnMostrandoInterfaceBody;
                EmpurraTela();

            }
            else if(CpfCnpj.length() == 11 || CpfCnpj.length() == 14){
                boolean Certo = false;
                do{
                    double valor = 0;
                    if(CpfCnpj.length() == 11){
                        System.out.println(CentrealizedText("Voce esta fazendo uma transacao para um cpf"));
                    }else{
                        System.out.println(CentrealizedText("Voce esta fazendo uma transacao para um cpf"));
                    }
                    ColunaVazia('|',140);
                    System.out.println(CentrealizedText("Digite o valor que voce deseja transferir"));
                    System.out.println(CentrealizedText("Digite 0 para cancelar"));
                    LinhaVazia('-',140);
                    System.out.print("Digite o valor : ");

                    try {
                        valor = ler.nextDouble();
                        if(valor == 0){
                            Certo = true;
                            Continuar = true;
                            System.out.println(CentrealizedText("Transferencia cancelada"));
                            Reticencias(3000,3);
                            estadoAtual= EstadoAtual.OnMostrandoInterfaceBody;
                        } else{
                            if(valor > Dinheiro){
                                System.out.println(CentrealizedText("Você nao possue fundos para fazer essa transferencia"));
                                Reticencias(3000,3);
                                estadoAtual = EstadoAtual.OnMostrandoInterfaceBody;
                                Certo = true;
                                Continuar = true;
                            }else {
                                EmpurraTela();
                                LinhaVazia('-',140);
                                ColunaVazia('|',140);
                                System.out.println(CentrealizedText("Sua transferencia esta sendo feita"));
                                System.out.println(CentrealizedText("..."));
                                ColunaVazia('|',140);
                                LinhaVazia('-',140);
                                Pausa(3000);
                                EmpurraTela();
                                System.out.println(CentrealizedText("Transferencia feita com sucesso"));
                                ColunaVazia('|',140);
                                LinhaVazia('-',140);
                                Reticencias(2500,3,'!');
                                Pausa(2000);
                                EmpurraTela();
                                estadoAtual = EstadoAtual.OnMostrandoInterfaceBody;
                            }
                        }
                    }catch (Exception a){
                        EmpurraTela();
                        System.out.print("Valor impossivel");Reticencias(3000,3);
                        try {
                            valor = ler.nextDouble();
                            if(valor == 0){
                                Certo = true;
                                Continuar = true;
                                System.out.println(CentrealizedText("Transferencia cancelada"));
                                Reticencias(3000,3);
                                estadoAtual= EstadoAtual.OnMostrandoInterfaceBody;
                            } else{
                                if(valor > Dinheiro){
                                    System.out.println(CentrealizedText("Você nao possue fundos para fazer essa transferencia"));
                                    Reticencias(3000,3);
                                    estadoAtual = EstadoAtual.OnMostrandoInterfaceBody;
                                    Certo = true;
                                    Continuar = true;
                                }else {
                                    EmpurraTela();
                                    LinhaVazia('-',140);
                                    ColunaVazia('|',140);
                                    TextoAEsquerda("Sua transferencia esta sendo feita",140);
                                    System.out.println(CentrealizedText("..."));
                                    ColunaVazia('|',140);
                                    LinhaVazia('-',140);
                                    Pausa(3000);
                                    EmpurraTela();
                                    System.out.print("Transferencia feita com sucesso");
                                    Reticencias(2500,3,'!');
                                    Pausa(2000);
                                    estadoAtual = EstadoAtual.OnMostrandoInterfaceBody;
                                    Certo = true;
                                    Continuar = true;
                                }
                            }
                        }catch (Exception b){
                            EmpurraTela();
                            System.out.print("Valor impossivel");Reticencias(3000,3);

                        }
                    }

                }while (!Certo);
            }else if(CpfCnpj.length() == 14){
                System.out.println(CentrealizedText("Voce esta fazendo uma transacao para um cpf"));
            }else{
                EmpurraTela();
                System.out.print("Digite um cpf ou cnpj valido");
                Reticencias(1500,3,'!');
                Pausa(2500);
            }


        }while (!Continuar);
    }

    public void Sacar(){
        boolean Correto = false;
        do{
            EmpurraTela();
            Pausa(400);
            double valor = 0;
            LinhaVazia('-',140);
            System.out.println(CentrealizedText("Você deseja sacar quanto dinheiro?"));
            ColunaVazia('|',140);
            System.out.println(CentrealizedText("Lembrando que caso queria voltar para o menu digite 0"));
            try {
                Scanner ler = new Scanner(System.in);
                valor = ler.nextDouble();
                if(valor == 0)
                {
                    estadoAtual = EstadoAtual.OnMostrandoInterfaceBody;
                    Correto = true;
                } else if (valor < 0) {
                    EmpurraTela();
                    System.out.println("Digite um valor valido");
                    Reticencias(1500,3);
                }else{
                    Scanner escolha = new Scanner(System.in);
                    System.out.println(CentrealizedText("Voce tem certeza que quer Sacar "+valor +"?") );
                String[] ValoresPossives = {"[0] Para Cancelar", "[1] Para realizar o saque"};
                TextoAEsquerda(ValoresPossives,140);
                if(escolha.nextInt() == 0){
                    estadoAtual = EstadoAtual.OnMostrandoInterfaceBody;
                    System.out.println(CentrealizedText("Seu Sacar foi cancelado"));
                    Reticencias(2000,3);
                    EmpurraTela();
                    Correto = true;
                }else{
                    if(Dinheiro > valor){
                        Dinheiro -= valor;
                        System.out.println(CentrealizedText("Seu saque foi efetuado com sucesso"));
                        Reticencias(2000,3);
                        estadoAtual = EstadoAtual.OnMostrandoInterfaceBody;
                        Correto = true;
                    }else{
                        System.out.println(CentrealizedText("Seu saque foi reprovado"));
                        Reticencias(2000,3);
                        estadoAtual = EstadoAtual.OnMostrandoInterfaceBody;
                        Correto = true;
                        System.out.println();
                        EmpurraTela();
                    }
                }
                }
            }catch (Exception e){
                Correto = false;
                System.out.println(CentrealizedText("Digite um valor numerico"));
                Reticencias(1500, '.');
            }
        }while(!Correto);
        RealizarAcoes();
    }
    private void Depositar(){
        boolean Continuar = false;
        do{
            Scanner ler = new Scanner(System.in);
            LinhaVazia('-',140);
            System.out.println(CentrealizedText("Seje bem vindo ao Depósito"));
            System.out.println(CentrealizedText("Digite o valor que deseja depositar"));
            ColunaVazia('|',140);
            System.out.println(CentrealizedText("lembrando que caso queira sair apenas digite 0"));
            try{
                double quantidade = ler.nextDouble();
                if(quantidade == 0)
                {
                    estadoAtual = EstadoAtual.OnMostrandoInterfaceBody;
                    Continuar = true;
                    EmpurraTela();
                } else if(quantidade < 0)
                {
                    System.out.println(CentrealizedText("Digite um valor positivo"));
                    Reticencias(2000,3);
                    Pausa(500);
                }else
                {
                    Continuar = true;
                    Dinheiro += quantidade;
                }
            }catch (Exception e){
                System.out.println("Digite um valor valido");
            }
        }while (!Continuar);
        estadoAtual = EstadoAtual.OnMostrandoInterfaceBody;
        RealizarAcoes();
    }
    private void Header() {
        LinhaVazia('-', 140);
        Visualizacao();
        int espacoCentral = 0;
        int espacoSobrando = 140;
        System.out.print("|");//borda L
        espacoSobrando--;
        for (int i = 0; i < 10; i++) {//dar padding Left de 10 chars
            System.out.print(" ");
            espacoSobrando--;
        }
        if (Nome.length() <= 26) {
            while (Nome.length() <= 26) {
                Nome += " ";
            }
        } else {
            boolean sair = false;
            while (!sair) {
                Nome = Nome.substring(0, Nome.length() - 1);
                if (Nome.length() < 23) {
                    Nome += "...";
                    sair = true;
                } else {
                    sair = false;
                }
            }
        }
        System.out.print("|");
        System.out.print(Nome);
        System.out.print("|");
        espacoSobrando -= Nome.length() + 2;

        Locale locale = new Locale("pt", "BR");
        NumberFormat dinheiroFormato = NumberFormat.getCurrencyInstance(locale);
        if (dinheiroFormato.format(Dinheiro).length() > 14) {
            String tamanhoIni = dinheiroFormato.format(Dinheiro);
            String tamanhoFinal;
            String valorString = dinheiroFormato.format(Dinheiro);
            tamanhoIni = tamanhoIni.replaceAll("[^0-9]", "");
            int casasRetiradas = 0;
            while (valorString.length() > 14 - 2) {
                valorString = valorString.substring(0, valorString.length() - 1);
                casasRetiradas++;
            }
            tamanhoFinal = valorString.replaceAll("[^0-9]", "");
            int quatidadeDeZeros = tamanhoIni.length() - tamanhoFinal.length();
            valorString += "+" + (quatidadeDeZeros) + "";
            espacoSobrando -= valorString.length() + 2;
            for (int i = 0; i < espacoSobrando - 10; i++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.print(valorString);
            System.out.print("|");
        } else {
            String stringDinheiro = dinheiroFormato.format(Dinheiro);
            while (stringDinheiro.length() != 14) {
                stringDinheiro = " " + stringDinheiro;
            }
            espacoSobrando -= stringDinheiro.length() + 2;
            for (int i = 0; i < espacoSobrando - 10; i++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.print(stringDinheiro);
            System.out.print("|");
        }
        System.out.println("         |");
        ColunaVazia('|', 140);
        LinhaVazia('-', 140);
    }
    private void Body(){
        int tamanhoTotal = 70;
        String[] esolhasPossiveis = {"| [0] Para deslogar da conta",
                "| [1] Para Sacar seu dinheiro",
                "| [2] Para depositar seu dinheiro",
                "| [3] Para transferir",
                "| [4] Para investir"};

        LinhaVazia('-',tamanhoTotal);
        ColunaVazia('|',tamanhoTotal);
        for (String esolhasPossivei : esolhasPossiveis) {
            System.out.print(esolhasPossivei);
            for (int j = 0; j < tamanhoTotal - esolhasPossivei.length(); j++) {
                if (j < (tamanhoTotal - 1) - esolhasPossivei.length()) {
                    System.out.print(" ");
                } else {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
        ColunaVazia('|',tamanhoTotal);
        System.out.print("\\");
        for(int i = 0;i<tamanhoTotal-2;i++){
            System.out.print("_");
        }
        System.out.println("/");
        System.out.println();
        String frase = "Favor Digite O numero correspondente ao que o senhor(a) deseja fazer :";
        for(int i = 0; i<frase.length();i++){
            Pausa(20);
            System.out.print(frase.charAt(i));
        }
    }
    private void LinhaVazia(char caracter, int tamanho){
        for(int i = 0;i<tamanho;i++)
        {
            if(i == 0){
                System.out.print("/");
            } else if (i == tamanho-1) {
                System.out.print("\\");
            }else {
                System.out.print(caracter);
            }
        }
        System.out.println();
    }
    private void Visualizacao(){
        System.out.print("|");
        System.out.print("          ");
        //11
        String Palvara = "Nome :";
        System.out.print("           ");
        System.out.print(Palvara);
        System.out.print("           ");
        for(int i =0;i<84-4;i++){
            System.out.print(" ");
        }
        System.out.print("Saldo : ");
        System.out.println("            |");
    }
    private void ColunaVazia(char caracter,int tamanho){
        for(int i = 0;i<tamanho;i++)
        {
            if(i == 0||
                i == tamanho-1){
                System.out.print(caracter);
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    private void InterfaceDeUsuario(){
        Header();
        Body();

        estadoAtual = EstadoAtual.OnBody;
    }
    private void InterfaceDeInvestimento(){
        EmpurraTela();
        Header();
        LinhaVazia('-',140);
        String[] opcoesPossiveis = {
                "seu cantinho do investimento",
                "Digite [0] Para voltar a sua conta",
                "Digite [1] Para tentar investi em Conta Poupança",
                "Digite [2] Para tentar investir em Conta Investimento"
        };
        for(String opts : opcoesPossiveis){
            System.out.println(CentrealizedText(opts));
        }
        estadoAtual = EstadoAtual.OnInvestir;
        RealizarAcoes();
    }
    private void InterfaceDeInvestimento(boolean onlyShow){
        if(onlyShow){
            EmpurraTela();
            Header();
            LinhaVazia('-',140);
            String[] opcoesPossiveis = {
                    "seu cantinho do investimento",
                    "Digite [0] Para voltar a sua conta",
                    "Digite [1] Para tentar investi em Conta Poupança",
                    "Digite [2] Para tentar investir rm Conta Investimento"
            };
            for(String opts : opcoesPossiveis){
                System.out.println(CentrealizedText(opts));
            }
        }
    }
    private void EscolhaDoUsuarioOnInvestimento(){
        Scanner ler = new Scanner(System.in);
        boolean Continuar = false;
        do
        {
            LinhaVazia('-',140);
            try {
                ler = new Scanner(System.in);
                int escolha = ler.nextInt();
                if(this.TipoCliente.equals("CPF")){
                    switch (escolha) {
                        case 0 ->{
                            estadoAtual = EstadoAtual.OnMostrandoInterfaceBody;
                            Continuar = true;
                        }
                        case 1 -> {
                            boolean cont = false;
                            do
                            {
                                Scanner lera = new Scanner(System.in);
                                EmpurraTela();
                                InterfaceDeInvestimento(true);
                                LinhaVazia('-',140);
                                ColunaVazia('|',140);
                                System.out.println(CentrealizedText("Aqui voce selecionou a opção de investimento pela poupança"));
                                ColunaVazia('|',140);
                                System.out.println(CentrealizedText("Você recebera todo mes um CDI de 100% "));
                                System.out.println(CentrealizedText("O dinheiro nao pode ser retirado caso seje colocado em poupança"));
                                ColunaVazia('|',140);
                                System.out.println(CentrealizedText("mas ira retornar automaticamente ao ultimo dia do mes"));
                                int tamanhoTotal = 140;
                                String[] esolhasPossiveis ={
                                        "| [0] Para cancelar e voltar para o menu de investimentos",
                                        "| [1] Para fazer um envestimento de poupança "
                                };
                                ColunaVazia('|',140);
                                for (String esolhasPossivei : esolhasPossiveis) {
                                    System.out.print(esolhasPossivei);
                                    for (int j = 0; j < tamanhoTotal - esolhasPossivei.length(); j++) {
                                        if (j < (tamanhoTotal - 1) - esolhasPossivei.length()) {
                                            System.out.print(" ");
                                        } else {
                                            System.out.print("|\n");
                                        }
                                    }
                                }
                                LinhaVazia('-',140);
                                try{
                                    String Texto = "| Onde deseja ir? : ";
                                    for(int i = 0;i< Texto.length();i++){
                                        System.out.print(Texto.charAt(i));
                                        Pausa(80);
                                    }
                                    int num = lera.nextInt();
                                    switch (num){
                                        case 0->{
                                            cont = true;
                                            Continuar = true;
                                            estadoAtual = EstadoAtual.OnMostrandoInterfaceInvestimento;
                                        }
                                        case 1->{
                                            FazerInvestimentoPoupanca();
                                            cont = true;
                                            Continuar = true;
                                        }
                                        default -> {
                                            TextoAEsquerda("digite um valor possivel ",140);
                                            Reticencias(2000,3,'!');
                                        }

                                    }
                                }catch (Exception e){
                                    System.out.print("Favor insira um valor numérico");
                                    Reticencias(3000,6);
                                    EmpurraTela();
                                    InterfaceDeInvestimento(true);
                                }
                            }while(!cont);
                        }
                        case 2-> {
                            AtivarContaInvestimento();
                            Continuar = true;
                        }

                        default -> {
                            System.out.print("Favor inserir um valor existente");
                            Reticencias(2500,4);
                            EmpurraTela();
                            Continuar = true;
                            estadoAtual = EstadoAtual.OnMostrandoInterfaceInvestimento;
                        }
                    }
                }else{
                    switch (escolha) {
                        case 0 -> {
                            estadoAtual = EstadoAtual.OnMostrandoInterfaceBody;
                            Continuar = true;
                        }
                        case 2->{
                            Continuar = true;
                            AvisoDeImpossivel();
                        }
                    }
                }
            }catch (Exception e){
                System.out.print("Digite um valor Numerico");
                Reticencias(2500,4);
                System.out.println();
                estadoAtual = EstadoAtual.OnMostrandoInterfaceInvestimento;
                Continuar=true;
                EmpurraTela();
            }
        }while (!Continuar);

        RealizarAcoes();
    }
    public void AvisoDeImpossivel(){
        EmpurraTela();
        System.out.println(CentrealizedText("Ola querido usuario você nao consegui criar contas poupança devido a ser CNPJ"));
        System.out.println(CentrealizedText("Mas lembrando sempre da opção de investimento que caso você a ative voce ganhara alem dos 150% + 2%"));
        LinhaVazia('-',140);
        Reticencias(2000,3);
    }

    private void AtivarContaInvestimento(){
        boolean continuar = false;
        do{
            try{
                Scanner lera = new Scanner(System.in);
                EmpurraTela();
                InterfaceDeInvestimento(true);
                LinhaVazia('-', 140);
                ColunaVazia('|', 140);
                System.out.println(CentrealizedText("Aqui voce selecionou a opção de investimento pela investimento"));
                System.out.println(CentrealizedText("Caso você ative essa opção a sua conta entrara por 30 como uma conta de investimento"));
                System.out.println(CentrealizedText("E caso haja algum investimento interessante a ser feito nos iremos pegar até 40% da sua conta para investi"));
                System.out.println(CentrealizedText("E depois de 1 mês que nos tenhos pego seu dinheiro nos iremos te tornar 150% do valor pego"));
                ColunaVazia('|', 140);
                System.out.println(CentrealizedText("Quando passar esse 1 mês a sua conta automaticamente voltara ao modo não investimento"));
                LinhaVazia('-', 140);
                String[] opcoes = {
                        "| [0] Para voltar menu de investimentos",
                        "| [1] Para ativar a conta investimeto  "
                };
                TextoAEsquerda(opcoes, 140);
                LinhaVazia('-', 140);
                System.out.println("Digite sua escolha : ");
                String valor = lera.nextLine();
                if (valor.equals("0")) {
                    continuar = true;
                    estadoAtual = EstadoAtual.OnMostrandoInterfaceInvestimento;
                } else if (valor.equals("1")) {
                    continuar = true;
                    System.out.println(CentrealizedText("Você esta ativando o modo investimento"));
                    ColunaVazia('|', 140);
                    Reticencias(3000, 3);
                    if (Investimeto) {
                        System.out.println(CentrealizedText("Sua conta já esta ativa"));
                        estadoAtual = EstadoAtual.OnMostrandoInterfaceInvestimento;
                    } else {
                        System.out.println(CentrealizedText("Conta Ativada com sucesso"));
                        estadoAtual = EstadoAtual.OnMostrandoInterfaceInvestimento;
                    }
                    Reticencias(2000, 3);
                    Pausa(2000);
                } else {
                    System.out.println("Digite um valor existente ");
                }
            }catch (Exception e){
                System.out.println("rola");
            }
        }while (!continuar);
    }
    private void FazerInvestimentoPoupanca(){
        String[] valoresPossiveis = {
                "| [0] Para cancelar",
                "| [1] Para confirmar"
        };

        EmpurraTela();
        LinhaVazia('-',140);
        System.out.println(CentrealizedText("Voce pode investir no maximo "+Dinheiro));
        ColunaVazia('|',140);
        System.out.println(CentrealizedText("Favor incira a quantidade que deseja"));
        System.out.println(CentrealizedText("Lembrando que caso queira retornar para o menu de Investimentos digite 0"));

        Scanner ler = new Scanner(System.in);
        String result = ler.nextLine();
        double valor = 0;
        boolean digitouCorreto = false;
        try {
            valor = Double.parseDouble(result);
            digitouCorreto = true;
        }catch (Exception e){
            try{
                digitouCorreto = false;
                String Plate = result.replaceAll("[^0-9 ,]","");
                valor = Double.parseDouble(Plate.replaceAll(",","."));

            }catch (Exception ER){
                System.out.print("Conversao impossivel");
                Reticencias(3500,3,'!');
                estadoAtual = EstadoAtual.OnMostrandoInterfaceBody;
            }

        }
        boolean passarReto = false;

        if(!digitouCorreto){
            passarReto = true;
            Scanner lera = new Scanner(System.in);
            LinhaVazia('-',140);
            System.out.println(CentrealizedText("Pelo visto você digitou o valor de uma mandeira errada"));
            System.out.println(CentrealizedText("Mas nos achamos que você quis digitar esse valor"));
            System.out.println(CentrealizedText(Double.toString(valor)));
            TextoAEsquerda(valoresPossiveis,140);
            boolean teste = false;
            do{
                System.out.print("digite sua escolha");
                String valorEscolido = lera.nextLine();
                switch (valorEscolido){
                    case "0" ->{
                        passarReto = true;
                        teste = true;
                    }case "1"->{
                        passarReto = false;
                        teste = true;
                    }
                    default -> {
                        teste = false;
                    }
                }
            }while (!teste);
        }
        if(estadoAtual == EstadoAtual.OnInvestir && !passarReto){
            if(valor > Dinheiro)
            {
                System.out.println(CentrealizedText("Você não tem dinheiro o suficiente para fazer esse deposito"));
            }else{
                boolean Continuar = false;

                Scanner lera = new Scanner(System.in);
                System.out.println(CentrealizedText("Você Realmete deseja investir "+ valor));
                ColunaVazia('|',140);
                TextoAEsquerda(valoresPossiveis,140);
                System.out.println("Digite sua escolha : ");
                do {
                    String escolha = lera.nextLine();
                    if(escolha.equals("0")){
                        Continuar = true;
                    }else if(escolha.equals("1")){
                        Dinheiro -= valor;
                        EmpurraTela();
                        estadoAtual = EstadoAtual.OnMostrandoInterfaceBody;
                        ///

                        // FAZER A PORRA DA CONTA NO "BANCO DE DADOS"


                        ///
                        Continuar = true;
                    }
                }while (!Continuar);
            }
        }
    }
    @Override
    protected String CentrealizedText(String Text){
        Text = super.CentrealizedText(Text);
        Text = Text.substring(0);
        if(Text.length() % 2 != 0){
            Text = Text.substring (0, Text.length() - 1);
        }else{
            Text = Text.substring (0, Text.length() - 2);
        }
        Text = "|" + Text + "|";
        return Text;
    }
}