package Entidades;

public class Dolar {


    public static final double IMPOSTO = 6.0 / 100;

    public static double valorEmReais(double cotacao, double quantidade){
        return cotacao * quantidade + cotacao * quantidade * IMPOSTO;
    }
}

