import Figuras.Retangulo;

import java.util.Scanner;

public class Modulo8ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo;
        retangulo = new Retangulo();
        System.out.print("De a altura e a largura do retângulo: ");
        retangulo.altura = scanner.nextDouble();
        retangulo.largura = scanner.nextDouble();
        System.out.printf("Area = %.2f\n", retangulo.area());
        System.out.printf("Perímetro = %.2f\n", retangulo.perimetro());
        System.out.printf("Diagonal = %.2f", retangulo.diagonal());
        scanner.close();
    }
}
