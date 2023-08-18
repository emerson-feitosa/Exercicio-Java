package Entidades;

public class Produto {
    public String nome;
    public double preco;

    public int estoque;

    public double valorEmEstoque(){
        return estoque * preco;
    }
    public void adicionarProduto(int estoque){
         this.estoque += estoque;
    }
    public void  removerProduto(int estoque){
          this.estoque -= estoque;
    }
    public String toString(){
        return "Produto: " + nome + "\n"
                + "Preço: " + String.format("%.2f\n", preco)
                + "Estoque: " + estoque + "\n" + "Valor em estoque: " + valorEmEstoque();

    }

}
