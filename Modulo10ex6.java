import java.util.Scanner;

public class Modulo10ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tamanho do vetor: ");
        int tamanhoVetor = scanner.nextInt();
        int[] vetor = new int[tamanhoVetor];
        int[] vetorb = new int[tamanhoVetor];
        int[] vetorc = new int[tamanhoVetor];
        System.out.println("Digite os valores de A:");
        for (int i = 0; i < tamanhoVetor; i+=1){
            vetor[i] = scanner.nextInt();

        }
        System.out.println("Digite os valores de B:");
        for (int i = 0; i < tamanhoVetor; i+=1){
            vetorb[i] = scanner.nextInt();
        }
        System.out.println("Vetor Resultante:");
        for (int i = 0; i < tamanhoVetor; i+=1){
            vetorc[i] = vetor[i] + vetorb[i];
            System.out.println(vetorc[i]);
        }
    }
}
