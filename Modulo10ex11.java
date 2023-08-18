import java.util.Scanner;

public class Modulo10ex11 {
    public static void main(String[] args) {
        double menorAltura = 0;
        double maiorAltura = 0;
        int numeroHomens = 0;
        int numeroMulheres = 0;
        double somaAlturaMulheres = 0;
        double mediaAlturaMulheres = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantidade Pessoas: ");
        int tamanhoVetor = scanner.nextInt();
        double[] vetorAltura = new double[tamanhoVetor];
        char[] vetorSexo = new char[tamanhoVetor];
        for (int i =0; i< vetorSexo.length; i+=1){
            System.out.printf("Altura da %da pessoa ", i +1);
            vetorAltura[i] = scanner.nextDouble();
            System.out.printf("Sexo da %da pessoa ", i +1);
            vetorSexo[i] = scanner.next().toUpperCase().charAt(0);
            if (vetorSexo[i] == 'F'){
                numeroMulheres += 1;
                somaAlturaMulheres += vetorAltura[i];
            }
            else if (vetorSexo[i] == 'M') {
                numeroHomens +=1;

            }
            mediaAlturaMulheres = somaAlturaMulheres / numeroMulheres;

        }
        for (int i =0; i< vetorSexo.length; i+=1){
            if (vetorAltura[i] >= maiorAltura){
                maiorAltura = vetorAltura[i];

            }


        }
        for (int i =0; i< vetorSexo.length; i+=1){
            if (vetorAltura[i] < vetorAltura[0]){
                vetorAltura[0] = vetorAltura[i];
                menorAltura = vetorAltura[i];
            }
        }
        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Média das altura das mulheres = %.2f\n", mediaAlturaMulheres);
        System.out.printf("Número de homens = %d\n", numeroHomens);
    }
}
