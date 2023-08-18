package Entidades;

public class Cliente {
    private final int numeroDaConta;
    private String nomeDoTitular;

    private double saldoDaConta;
    public Cliente(String nomeDoTitular, int numeroDaConta, double saldoDaConta){
        this.nomeDoTitular = nomeDoTitular;
        this.numeroDaConta = numeroDaConta;
        this.saldoDaConta = saldoDaConta;
    }

    public void deposito(double saldoDaConta){
        this.saldoDaConta += saldoDaConta;
    }
    public void  saque(double saldoDaConta){
         this.saldoDaConta -= saldoDaConta + 5;
    }
    public double getSaldoDaConta(){
        return saldoDaConta;
    }
    public int getNumeroDaConta(){
        return numeroDaConta;
    }
    public String getNomeDoTitular(){
        return nomeDoTitular;
    }
    public void setNomeDoTitular(String nomeDoTitular){
        this.nomeDoTitular = nomeDoTitular;
    }
    public String toString(){
        return "Nome do titular: " + getNomeDoTitular()+ "\n"
                + "Número da conta: " + getNumeroDaConta()+ "\n"
                + "Saldo da conta: " + String.format("%.2f", getSaldoDaConta());
    }
}