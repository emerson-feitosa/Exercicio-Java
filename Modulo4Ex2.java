import java.util.Scanner;

public class Modulo4Ex2 {
    public static void main(String[] args) {
        double pi, raio, area;
        pi = 3.14159;
        Scanner scanner = new Scanner(System.in);
        System.out.print("De o valor do raio do círculo");
        raio = scanner.nextDouble();
        area = pi * Math.pow(raio, 2);
        System.out.printf("Área = %.4f", area);
        scanner.close();


    }
}
