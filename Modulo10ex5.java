import java.util.Scanner;

public class Modulo10ex5 {
    public static void main(String[] args) {
        int posicaoMaior = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tamanho do vetor: ");
        int tamanhoVetor = scanner.nextInt();
        int[] vetor = new int[tamanhoVetor];
        for (int i = 0; i < tamanhoVetor; i+=1){
            vetor[i] = scanner.nextInt();

        }
        double maior = vetor[0];
        for (int i = 0; i < tamanhoVetor; i+=1){
            if (vetor[i] > maior){
                maior = vetor[i];
                posicaoMaior = i;
            }
        }
        System.out.printf("O maior número é o: %.2f\n", maior);
        System.out.printf("A posição do maior número é : %d", posicaoMaior);

    }
}
