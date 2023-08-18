import java.util.Scanner;

public class Modulo10ex8 {
    public static void main(String[] args) {
        double somaPar = 0;
        int numerosPares = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dê o tamanho do vetor: ");
        int tamanhoVetor = scanner.nextInt();
        double[] vetor = new double[tamanhoVetor];
        for (int i = 0; i < vetor.length; i += 1) {
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextDouble();
            if (vetor[i] % 2 ==0){
                somaPar += vetor[i];
                numerosPares += 1;
            }

        }
        double mediaPar = somaPar /numerosPares;
        if (numerosPares == 0){
            System.out.print("Nenhum Número Par");
        }
        else {
            System.out.printf("Media dos pares = %.1f", mediaPar);
        }
        scanner.close();

    }
}
