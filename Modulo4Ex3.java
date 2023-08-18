import java.util.Scanner;

public class Modulo4Ex3 {
    public static void main(String[] args) {
        int a, b, c, d, calculo;
        Scanner scanner = new Scanner(System.in);
        System.out.print("De o valor de A");
        a = scanner.nextInt();
        System.out.print("De o valor de B");
        b = scanner.nextInt();
        System.out.print("De o valor de C");
        c = scanner.nextInt();
        System.out.print("De o valor de D");
        d = scanner.nextInt();
        calculo = a * b - c * d;
        scanner.close();
        System.out.printf("Diferença = %d", calculo);

    }
}
