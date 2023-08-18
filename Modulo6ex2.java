import java.util.Scanner;

public class Modulo6ex2 {
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            int x, y;
            System.out.print("Valor de X ");
            x = scanner.nextInt();
            System.out.print("Valor de Y ");
            y = scanner.nextInt();
            if (x > 0 && y > 0){
                System.out.println("Primeiro");
            }
            else if (x > 0 && y < 0) {
                System.out.println("Quarto");

            }
            else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            }
            else {
                System.out.print("Origem");
                break;
            }

        }
    }
}
