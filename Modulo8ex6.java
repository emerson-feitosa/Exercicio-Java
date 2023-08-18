import Entidades.Dolar;

import java.util.Scanner;

public class Modulo8ex6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Preço Dolar: ");
        double cotacao = scanner.nextDouble();
        System.out.print("Quantidade a comrpar: ");
        double quantidade = scanner.nextDouble();
        double c = Dolar.valorEmReais(quantidade, cotacao);
        System.out.printf(" Valor gasto: %f", c);




    }
}
