import java.util.Scanner;

public class Modulo6ex3 {
    public static void main(String[] args) {
        int alcool, gasolina, diesel;
        alcool = 0;
        gasolina = 0;
        diesel = 0;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                     Escolhá o combustível de sua preferência 1:Álcool
                     2: Gasolina
                     3:Diesel
                     4: Sair do questionário\
                    """);
            int escolha = scanner.nextInt();
            if (escolha == 1){
                alcool += 1;
            }
            else if (escolha == 2) {
                gasolina += 1;
            }
            else if (escolha == 3) {
                diesel += 1;
            }
            else if (escolha == 4) {
                System.out.println("Obrigado!");
                break;
            }
            else {
                System.out.println("Digite um número válido");
            }

        }
        System.out.printf("Alcool: %d\n Gasolina: %d\n Diesel: %d",alcool, gasolina, diesel);
    }
}
