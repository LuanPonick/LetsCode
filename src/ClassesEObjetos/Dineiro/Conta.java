package ClassesEObjetos.Dineiro;

import javax.swing.*;

public class Conta {
    private String Numero;
    private float Saldo;
    private float Debito;
    private float Credito;
    public Conta(String Numero,float Saldo,float Debito, float Credito){
        this.Numero = Numero;
        this.Saldo = Saldo;
        this.Debito = Debito;
        this.Credito = Credito;
    }
    public void TesteDeSaldo(){
        if(this.Saldo >= this.Debito){
            System.out.println("Você possue saldo o suficiente para pagar");
            CalcAndShow(true);
        } else{
            System.out.println("Você nao possue saldo o suficiente para pagar");
            CalcAndShow(false);
        }
    }

    private void CalcAndShow(boolean TemSaldoS) {
        if(TemSaldoS){
            System.out.println(this.Saldo + " - " + this.Debito + " = " + (this.Saldo - this.Debito));
        }else {
            System.out.println(this.Saldo + " - " + this.Credito + " = " + (this.Saldo - this.Credito));
            System.out.println(-1*((this.Saldo - this.Debito)) + " - " + this.Credito + " = "+ ((this.Saldo - this.Debito) + this.Credito));
        }

    }

}

