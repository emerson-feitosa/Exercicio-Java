import Entidades.Pessoa;

import java.util.Scanner;

public class Modulo10ex3 {
    public static void main(String[] args) {
        double somaAltura = 0;
        double porcentagem = 0;
        double numeroDePessoasMenoresDe16 = 0;
        String nome = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int tamanhoVetor = scanner.nextInt();
        Pessoa[] vetor = new Pessoa[tamanhoVetor];
        for (int i = 0; i < vetor.length; i += 1) {
            System.out.printf("Dados da %d pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nome = scanner.next();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();
            vetor[i] = new Pessoa(nome, idade, altura);
            somaAltura += vetor[i].getAltura();

        }
        double mediaAltura = somaAltura / tamanhoVetor;
        System.out.printf("Altura média: %.2f\n", mediaAltura);
        for (int i = 0; i < vetor.length; i += 1) {
            if (vetor[i].getIdade() < 16) {
                numeroDePessoasMenoresDe16 += 1;
                nome = vetor[i].getNome();
            }
        }
        porcentagem = (numeroDePessoasMenoresDe16 / tamanhoVetor) * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.2f", porcentagem);
        System.out.print("%\n");
        for (int i = 0; i < vetor.length; i += 1) {
            if (vetor[i].getIdade() < 16) {
                nome = vetor[i].getNome();
                System.out.println(nome);
            }


        }

    }
}
