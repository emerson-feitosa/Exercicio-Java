import java.util.Scanner;

public class Modulo4Ex4 {
    public static void main(String[] args) {
        int number, hor;
        double valorh, salario;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number ");
        number = scanner.nextInt();
        System.out.print("Horas de trabalho ");
        hor = scanner.nextInt();
        System.out.print("Valor da hora de trabalho ");
        valorh = scanner.nextDouble();
        scanner.close();
        salario = valorh * hor;
        System.out.printf("Number = %d\n", number);
        System.out.printf("Salario = %.2f", salario);

    }
}
