import java.util.Scanner;

public class Modulo10ex7 {
    public static void main(String[] args) {
        double soma = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dê o tamanho do vetor: ");
        int tamanhoVetor = scanner.nextInt();
        double[] vetor = new double[tamanhoVetor];
        for (int i =0; i < vetor.length; i+=1){
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextDouble();
            soma += vetor[i];
        }
        double media = soma / tamanhoVetor;
        System.out.printf("Media do vetor = %.2f\n", media);
        System.out.println("Elementos abaixo da média: ");

        for (int i =0; i < vetor.length; i+=1){
            if (vetor[i]< media){
                System.out.println(vetor[i]);
            }
        }
    }
}
