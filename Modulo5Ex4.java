import java.util.Scanner;

public class Modulo5Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horai, horaf;
        System.out.print("Hora de início ");
        horai = scanner.nextInt();
        System.out.print("Hora de término ");
        horaf = scanner.nextInt();
        if (horai > horaf){
            int duracao = 24 - horai + horaf;
            System.out.printf("O jogo durou %d horas\n", duracao);
        }
        else if (horai < horaf) {
            int duracao = horaf - horai;
            System.out.printf("O jogo durou %d horas\n", duracao);
        }
        else {
            System.out.print("O jogo durou 24 horas");
        }

    }
}
