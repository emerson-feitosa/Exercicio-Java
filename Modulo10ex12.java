import Entidades.Hospede;

import java.util.Scanner;

public class Modulo10ex12 {
    public static void main(String[] args) {

        int quarto = 0;
        Scanner scanner = new Scanner(System.in);
        Hospede[] vetorhospede = new  Hospede[11];
        System.out.print("Quantos quartos deseja reservar? ");
        int quartosReservados = scanner.nextInt();
        for (int i = 0; i < quartosReservados; i+=1){
            System.out.printf("Reserva: #%d\n", i +1);
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("E-mail: ");
            String email = scanner.next();
            System.out.print("Quarto: ");
            quarto = scanner.nextInt();
            if (vetorhospede[quarto] == null){
                vetorhospede[quarto] = new Hospede(nome, email);
            }
            else {
                while (true){
                    System.out.println("Este quarto ja está reservado, Veja a lista de quartos vagos!");
                    for (int j = 1; j < 11; j +=1)
                       if (vetorhospede[j] == null){
                           System.out.printf("Quarto %d\n", j);
                       }
                    System.out.print("Quarto que deseja reservar: ");
                    quarto = scanner.nextInt();
                    if (vetorhospede[quarto] == null){
                        System.out.println("Reserva feita");
                        vetorhospede[quarto] = new Hospede(nome, email);
                        break;
                    }


                }
            }


        }
        for (int i = 1; i <11; i+=1){
            if (vetorhospede[i] != null){
                System.out.println(i + ": " + vetorhospede[i]);
            }

        }
        scanner.close();

        //adicionando isso aqui
        //add isso aqui dnv

    }
}
