import Escola.Aluno;

import java.util.Scanner;

public class Modulo8ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno estudante;
        estudante = new Aluno();
        System.out.print("Digite o nome e as 3 primeiras notas do aluno: ");
        estudante.nome = scanner.nextLine();
        estudante.nota1 = scanner.nextDouble();
        estudante.nota2 = scanner.nextDouble();
        estudante.nota3 = scanner.nextDouble();
        if (estudante.notaFinal() >= 60){
            System.out.printf("Nota final = %.2f\n", estudante.notaFinal());
            System.out.print("Aluno aprovado.");
        }
        else {
            System.out.printf("Nota final = %.2f\n", estudante.notaFinal());
            System.out.println("Aluno reprovado.");
            System.out.printf("Aluno reprovado, faltou %.2f pontos para atingir 60 pontos.", estudante.resultado());
        }
    }
}
