import java.util.Scanner;

public class Modulo10ex4 {
    public static void main(String[] args) {
        int numerosPares = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tamanho do vetor: ");
        int tamanhoVetor = scanner.nextInt();
        int[] vetor = new int[tamanhoVetor];
        for (int i = 0; i < tamanhoVetor; i+=1){
            vetor[i] = scanner.nextInt();

        }

        System.out.println("Números pares: ");
        for (int i = 0; i < tamanhoVetor; i+=1){
            if (vetor[i] % 2 == 0){
                System.out.print(vetor[i] + ", ");
                numerosPares +=1;


            }
        }
        System.out.println();
        System.out.printf("Quantidade de pares = %d", numerosPares);


}


}
