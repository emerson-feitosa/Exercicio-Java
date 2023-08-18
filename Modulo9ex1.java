import Entidades.Produto;

import java.util.Scanner;

public class Modulo9ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto product;
        product = new Produto();
        System.out.print("Enter product data: ");
        product.nome = scanner.nextLine();
        product.preco = scanner.nextDouble();
        product.estoque = scanner.nextInt();
        System.out.println();
        System.out.println(product);
        System.out.println();
        System.out.print("Enter number of products to be added in stock: ");
        int estoque = scanner.nextInt();
        product.adicionarProduto(estoque);
        System.out.println();
        System.out.printf("Updated data: %s\n", product);
        System.out.println();
        System.out.print("Enter number of products to be remove from stock: ");
        estoque = scanner.nextInt();
        product.removerProduto(estoque);
        System.out.println();
        System.out.printf("Updated data: %s", product);
    }
}
