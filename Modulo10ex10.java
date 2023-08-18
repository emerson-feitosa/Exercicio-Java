import Escola.Aluno2;

import java.util.Scanner;

public class Modulo10ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantidade alunos: ");
        int tamanhoVetor = scanner.nextInt();
        Aluno2[] vetor = new Aluno2[tamanhoVetor];
        for (int i = 0; i < vetor.length; i+=1){
            System.out.printf("Informações do %do aluno\n", i +1);
            System.out.print("Nome do aluno: ");
            String nomeAluno = scanner.next();
            System.out.print("Primeira nota do aluno: ");
            double primeiraNota = scanner.nextDouble();
            System.out.print("Sgunda nota do aluno: ");
            double segundaNota = scanner.nextDouble();
            vetor[i] = new Aluno2(nomeAluno, primeiraNota, segundaNota);
        }
        System.out.println("Alunos Aprovados: ");
        for (int i = 0; i < vetor.length; i+=1){
            if (vetor[i].media() > 6){
                System.out.println(vetor[i].getNomeAluno() + " " + vetor[i].media());
            }
        }

    }
}
