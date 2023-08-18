import java.util.Scanner;

public class Modulo6ex5 {
    public static void main(String[] args) {
        int in = 0;
        int out = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de n ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i +=1){
            System.out.print("De os valores de X ");
            int x = scanner.nextInt();
            if (10 <= x && x <= 20){
                in += 1;
            }
            else {
                out += 1;
            }

        }
        System.out.printf("%d in\n%d out", in, out);

    }
}
