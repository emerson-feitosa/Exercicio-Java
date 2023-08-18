import java.util.Scanner;

public class Modulo5Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.print("Digite um número ");
        x = scanner.nextInt();
        if (x % 2 == 0){
            System.out.println("O número é par");
        }
        else {
            System.out.println("O número é impar");
        }
        scanner.close();
    }
}
