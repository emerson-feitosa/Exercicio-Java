import java.util.Scanner;

public class Modulo10ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        System.out.print("Tamanho do vetor: ");
        int tamanhoVetor = scanner.nextInt();
        double[] vetor = new double[tamanhoVetor];
        for (int i = 0; i < vetor.length; i+=1){
            vetor[i] = scanner.nextDouble();
            soma += vetor[i];
        }
        System.out.print("Valores: ");
        for (int i = 0; i < vetor.length; i+=1){
            System.out.print(vetor[i] + ", ");
        }
        System.out.println(" ");
        double media = soma / tamanhoVetor;
        System.out.printf("Soma = %.2f\n", soma);
        System.out.printf("Média = %.2f", media);


    }
}
