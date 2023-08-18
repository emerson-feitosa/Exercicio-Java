package Empresa;

public class Funcionario {
    public String nome;
    public double salario;
    public double imposto;


    public double salarioDescontado(){
        return  salario - imposto;
    }
    public void aumentoDeSalario(double porcentagem){
        salario += salario * porcentagem/100;
    }
    public String toString(){
        return nome + ", " + "R$:" + " " + String.format("%.2f", salarioDescontado());
    }


}
