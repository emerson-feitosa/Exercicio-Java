import java.util.Scanner;

public class Modulo5Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        System.out.print("Digite um número");
        x = scanner.nextInt();
        System.out.print("Digite um número");
        y = scanner.nextInt();
        if (x % y == 0 || (y / x) * x == y){
            System.out.printf("O número %d e o número %d são multiplos\n", x, y);
        }
        else {
            System.out.printf("Os numeors %d e %d não são multiplos\n", x, y);
        }
        scanner.close();


    }
}
