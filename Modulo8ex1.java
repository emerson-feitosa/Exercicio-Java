import java.util.Scanner;

public class Modulo8ex1 {
    public static void main(String[] args) {
        double xa, xb, xc, ya, yb, yc, spx, spy, areax, areay;
        Scanner scanner = new Scanner(System.in);
        System.out.print("lados do triangulo x");
        xa = scanner.nextDouble();
        xb = scanner.nextDouble();
        xc = scanner.nextDouble();
        System.out.print("lados do triangulo y");
        ya = scanner.nextDouble();
        yb = scanner.nextDouble();
        yc = scanner.nextDouble();

        spx = (xa + xb + xc) / 2;
        spy = (ya + yb +yc) / 2;
        areax = Math.sqrt(spx * (spx - xa) * (spx - xb) * (spx - xc));
        areay = Math.sqrt(spy * (spy - ya) * (spy - yb) * (spy - yc));
        System.out.printf("Área do triangulo x = %f\n", areax);
        System.out.printf("Área do triangulo y = %f\n", areay);
        if (areax > areay){
            System.out.println("A maior área é a do triângulo: X");
        }
        else {
            System.out.println("A maior área é a do triângulo: y");
        }
    }
}
