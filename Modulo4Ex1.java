import java.util.Scanner;

public class Modulo4Ex1 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro ");
        a = scanner.nextInt();
        System.out.print("Digite um número inteiro ");
        b = scanner.nextInt();
        int soma = a + b;
        System.out.printf("Soma = %d", soma);
        scanner.close();

    }
}
