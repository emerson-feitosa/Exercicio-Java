import java.util.Scanner;

public class Modulo5Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.print("Digite um número");
        x = scanner.nextInt();

        if (x > 0){
            System.out.println("O número é positivo");
        }
        else {
            System.out.println("O número é negativo");
        }
         scanner.close();
    }
}
