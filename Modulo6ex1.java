import java.util.Scanner;

public class Modulo6ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua senha ");
        int senha = scanner.nextInt();
        while (senha != 2002){
            System.out.println("Senha inválida");
            System.out.print("Digite sua senha ");
            senha = scanner.nextInt();
        }
        System.out.println("Acesso permitido");
        scanner.close();


    }
}
