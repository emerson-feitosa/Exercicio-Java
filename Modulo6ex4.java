import java.util.Scanner;

public class Modulo6ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("De o valor de X ");
        int x = scanner.nextInt();
        if (x % 2 == 0 && 1 <= x && x <= 1000){
            for (int i = 1; i < x; i += 2){
                System.out.println(i);
            }
        }
        else if (x % 2 != 0 && 1 <= x && x <= 1000) {
            for (int i = 1; i <= x; i += 2){
                System.out.println(i);
            }

        }
        else {
            System.out.print("Digite um número que esteja no intervalo 1<= x <= 1000");
        }

    }
}
