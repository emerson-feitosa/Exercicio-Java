import java.util.Scanner;

public class Modulo10ex9 {
    public static void main(String[] args) {
        int idade = 0;
        String pessoaVelha = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pessoas a serem lidas: ");
        int tamanhoVetor = scanner.nextInt();
        String[] vetor = new String[tamanhoVetor];
        int[] vetorB = new int[tamanhoVetor];
        for (int i = 0; i < vetor.length; i+=1){
            System.out.printf("Dados da %da pessoa\n", i+1);
            System.out.print("Nome: ");
            vetor[i] = scanner.next();
            System.out.print("Idade: ");
            vetorB[i] = scanner.nextInt();
            if (vetorB[i] > idade){
                idade = vetorB[i];
                pessoaVelha = vetor[i];
            }
        }
        System.out.printf("A Pessoa mais velha é: %s, com %d anos\n", pessoaVelha, idade);

    }
}
