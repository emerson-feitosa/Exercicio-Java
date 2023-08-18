import Estoque.Produto;

import java.util.Scanner;

public class Modulo8ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto;
        produto = new Produto();
        System.out.printf("Nome: %s\nValor: %.2f\nQuantidade: %d\nValor total: %.2f\n",produto.nome, produto.valor,
                produto.quantidade, produto.valorTotalNoStock());

        System.out.println(produto);
        System.out.print("adicione prodtuos ao estoque ");
        int quantidade = scanner.nextInt();
        produto.addProdutos(quantidade);
        System.out.println(produto);
        System.out.print(" Remova produtos ");
        quantidade = scanner.nextInt();
        produto.removerProdutos(quantidade);
        System.out.print(produto);







    }
}
