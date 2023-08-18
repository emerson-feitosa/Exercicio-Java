import Entidades.Cliente;

import java.util.Scanner;

public class Modulo9ex2 {
    public static void main(String[] args) {
        double saldoDaConta = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do titular: ");
        String nomeDoTitular = scanner.nextLine();
        System.out.print("Número da conta: ");
        int numeroDaConta = scanner.nextInt();
        System.out.println("Saldo atual = 0");
        Cliente client = new Cliente(nomeDoTitular, numeroDaConta, saldoDaConta);
        System.out.print("Deseja realizar algum depósito? [S/N] ");
       char pergunta = scanner.next().toUpperCase().charAt(0);
        if (pergunta == 'S'){
            System.out.print("Qual o valor do depósito? ");
            saldoDaConta = scanner.nextDouble();
            client.deposito(saldoDaConta);

            System.out.printf("Update data:\n%s\n", client);
        }
        else {
            System.out.println("Você optou por não realizar um depósito.");
        }
        System.out.print("Quanto você deseja depositar? ");
        saldoDaConta = scanner.nextDouble();
        client.deposito(saldoDaConta);
        System.out.printf("Update data:\n%s\n", client);
        System.out.print("Quanto você deseja sacar?");
        saldoDaConta = scanner.nextDouble();
        client.saque(saldoDaConta);
        System.out.printf("Update data:\n%s\n", client);
        System.out.print("Deseja alterar o Seu nome? ");
        pergunta = scanner.next().toUpperCase().charAt(0);
        if (pergunta == 'S'){
            System.out.print("Digite seu nome: ");
            nomeDoTitular = scanner.next();
            client.setNomeDoTitular(nomeDoTitular);
            System.out.printf("Update data:\n%s\n", client);
            System.out.print("Conta cadastrada com Sucesso");

        }
        else {
            System.out.print("Conta cadastrada com Sucesso");
        }











    }
}
