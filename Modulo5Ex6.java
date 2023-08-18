import java.util.Scanner;

public class Modulo5Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x;
        System.out.print("Digite um número ");
        x = scanner.nextDouble();
        if (0 <= x && x <= 25){
            System.out.printf("%.2f está no intervalo [0,25]", x);
        }
        else if (25 < x && x <= 50) {
            System.out.printf("%.2f está no intervalo (25,50]", x);
        }
        else if (50 < x && x <= 75) {
            System.out.printf("%.2f está no intervalo (50,75]", x);
        }
        else if (75 < x && x <= 100) {
            System.out.printf("%.2f está no intervalo (75,100]", x);
        }
        else {
            System.out.printf("O valor %.2f está fora dos intervalos", x);
        }
        scanner.close();
    }
}
