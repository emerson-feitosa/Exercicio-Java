import Empresa.Funcionario;

import java.util.Scanner;

public class Modulo8ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario;
        funcionario = new Funcionario();
        System.out.print("Name: ");
        funcionario.nome = scanner.nextLine();
        System.out.print("Salary: ");
        funcionario.salario = scanner.nextDouble();
        System.out.print("Tax: ");
        funcionario.imposto = scanner.nextDouble();
        System.out.println();
        System.out.printf("Dados: %s\n", funcionario);
        System.out.println();
        System.out.print("Porcentagem de aumento salarial: ");
        double porcentagem = scanner.nextDouble();
        funcionario.aumentoDeSalario(porcentagem);
        System.out.println();
        System.out.printf("Dados atualizados: %s", funcionario);

    }
}
