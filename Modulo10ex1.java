import java.util.Scanner;

public class Modulo10ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] vector = new double[n];
        for (int i = 0; i < vector.length; i += 1) {
            vector[i] = scanner.nextInt();
            //Esse código da os valores ao vetor na posição i


        }
        //Esse código ler os valores do vetor na posição i
        System.out.println("Números negativos: ");
        for (int i = 0; i < vector.length; i += 1){
            if (vector[i]< 0){
                System.out.println(vector[i]);
            }
        }


    }
}
